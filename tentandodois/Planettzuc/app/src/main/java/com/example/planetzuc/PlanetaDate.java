package com.example.planetzuc;

import android.widget.ImageView;
import android.widget.TextView;

public class PlanetaDate {

    private String name;
    private String tagline;
    private String tagline_icon;

    private String picture;
    private String textureUrl;
    private String description;
    private String distanceFromSun;
    private String yearLength;
    private String namesake;
    private String spaceTexture_url;

    public PlanetaDate(String name, String tagline, String tagline_icon, String picture, String textureUrl, String description, String distanceFromSun, String yearLength, String namesake, String spaceTexture_url) {
        this.name = name;
        this.tagline = tagline;
        this.tagline_icon = tagline_icon;
        this.picture = picture;
        this.textureUrl = textureUrl;
        this.description = description;
        this.distanceFromSun = distanceFromSun;
        this.yearLength = yearLength;
        this.namesake = namesake;
        this.spaceTexture_url = spaceTexture_url;
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

    public String getPicture() {
        return picture;
    }

    public String getTextureUrl() {
        return textureUrl;
    }

    public String getDescription() {
        return description;
    }

    public String getDistanceFromSun() {
        return distanceFromSun;
    }

    public String getYearLength() {
        return yearLength;
    }

    public String getNamesake() {
        return namesake;
    }

    public String getSpaceTextureUrl() {
        return textureUrl;
    }
}
