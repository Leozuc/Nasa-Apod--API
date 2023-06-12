/*package com.example.planetzuc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
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

public class PlanetaDate{

    private String name;
    private String tagline;
    private String tagline_icon;

    public PlanetaDate(String name, String tagline, String tagline_icon) {
        this.name = name;
        this.tagline = tagline;
        this.tagline_icon = tagline_icon;
    }

    public String getName() {
        return name;
    }

    public String getTagline() {
        return tagline;
    }

    public String getTagline_icon() {
        return tagline_icon;
    }

}*/

package com.example.planetzuc;

public class PlanetaDate {

    private String name;
    private String tagline;
    private String tagline_icon;

    public PlanetaDate(String name, String tagline, String tagline_icon) {
        this.name = name;
        this.tagline = tagline;
        this.tagline_icon = tagline_icon;
    }

    public String getName() {
        return name;
    }

    public String getTagline() {
        return tagline;
    }

    public String getTagline_icon() {
        return tagline_icon;
    }
}
