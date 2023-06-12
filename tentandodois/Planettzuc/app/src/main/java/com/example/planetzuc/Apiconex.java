package com.example.planetzuc;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Apiconex extends AppCompatActivity {

    private TextView nameTextView;
    private TextView taglineTextView;
    private ImageView taglineiconImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apiconex);

        nameTextView = findViewById(R.id.nameTextView);
        taglineTextView = findViewById(R.id.taglineTextView);
        taglineiconImageView = findViewById(R.id.taglineiconImageView);

        String planetUrl = "https://planets-17f2.onrender.com/planets/getPlanet?name=mars";
        FetchPlanetDataTask task = new FetchPlanetDataTask();
        taglineiconImageView.setClipToOutline(true);
        task.execute(planetUrl);
    }

    private class FetchPlanetDataTask extends AsyncTask<String, Void, PlanetaDate> {

        @Override
        protected PlanetaDate doInBackground(String... urls) {
            String planetUrl = urls[0];
            String jsonResponse = "";

            try {
                URL url = new URL(planetUrl);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");

                InputStream inputStream = connection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    jsonResponse += line;
                }

                bufferedReader.close();
                inputStream.close();
                connection.disconnect();

                JSONObject jsonObject = new JSONObject(jsonResponse);

                JSONObject dataObject = jsonObject.optJSONObject("data");
                if (dataObject == null) {
                    throw new JSONException("");
                }

                JSONObject attributesObject = dataObject.optJSONObject("attributes");
                if (attributesObject == null) {
                    throw new JSONException("");
                }

                String name = attributesObject.optString("name", "");
                String tagline = attributesObject.optString("tagline", "");
                String tagline_icon = attributesObject.optString("tagline_icon", "");

                return new PlanetaDate (name, tagline, tagline_icon);
            } catch (IOException | JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(PlanetaDate planetData) {
            if (planetData != null) {
                nameTextView.setText(planetData.getName());
                taglineTextView.setText(planetData.getTagline());
                Glide.with(Apiconex.this)
                        .load(planetData.getTagline_icon())
                        .circleCrop()
                        .into(taglineiconImageView);
            }
        }
    }
}
