package com.example.planetzuc;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "planet.db";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_PLANET = "planet";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_TAGLINE = "tagline";
    public static final String COLUMN_TAGLINE_ICON = "tagline_icon";
    public static final String COLUMN_PICTURE = "picture";
    public static final String COLUMN_TEXTURE_URL = "texture_url";
    public static final String COLUMN_DESCRIPTION = "description";
    public static final String COLUMN_DISTANCE_FROM_SUN = "distance_from_sun";
    public static final String COLUMN_YEAR_LENGTH = "year_length";
    public static final String COLUMN_NAMESAKE = "namesake";
    public static final String COLUMN_SPACE_TEXTURE_URL = "space_texture_url";

    private static final String CREATE_TABLE_PLANET = "CREATE TABLE " + TABLE_PLANET + " ("
            + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + COLUMN_NAME + " TEXT, "
            + COLUMN_TAGLINE + " TEXT, "
            + COLUMN_TAGLINE_ICON + " TEXT, "
            + COLUMN_PICTURE + " TEXT, "
            + COLUMN_TEXTURE_URL + " TEXT, "
            + COLUMN_DESCRIPTION + " TEXT, "
            + COLUMN_DISTANCE_FROM_SUN + " TEXT, "
            + COLUMN_YEAR_LENGTH + " TEXT, "
            + COLUMN_NAMESAKE + " TEXT, "
            + COLUMN_SPACE_TEXTURE_URL + " TEXT)";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_PLANET);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PLANET);
        onCreate(db);
    }
}
