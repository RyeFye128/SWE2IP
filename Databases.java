package com.example.ryan.geolbuddy;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Ryan on 1/20/2016.
 */
public class Databases extends SQLiteOpenHelper {


    public static final String TABLE = "Student";

    // Labels Table Columns names
    //--------- SEDIMENTARY ROCKS SCHEMA----------------------
    public static final String SEDKEY_ID = "id";
    public static final String SEDKEY_name = "name";
    public static final String SEDKEY_grains = "possibleGrainsWithin";
    public static final String SEDKEY_clastic = "isClastic";
    public static final String SEDKEY_cement = "Cement Type";
    public static final String SEDKEY_sortedness = "Maturity";
    public static final String SEDKEY_location = "Native to";
    public static final String SEDKEY_color = "Typical Color";

    //---------METAMORPHIC SCHEMA-----------------------------
    public static final String METAKEY_id = "id";
    public static final String METAKEY_name = "name";
    public static final String METAKEY_minerals = "Minerals Within";
    public static final String METAKEY_texture = "Texture";
    public static final String METAKEY_grade = "Grade";
    public static final String METAKEY_location = "Native to";

    //--------IGNEOUS ROCKS SCHEMA---------------------------
    public static final String IGKEY_id = "id";
    public static final String IGKEY_name = "name";
    public static final String IGKEY_minerals = "Minerals Within";
    public static final String IGKEY_texture = "Texture";
    public static final String IGKEY_formationTemp = "Forms at this temp";






    //version number to upgrade database version
    //each time if you Add, Edit table, you need to change the
    //version number.
    private static final int DATABASE_VERSION = 4;

    // Database Name


    public Databases(Context context ) {
        super(context, "Rocks", null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //All necessary tables you like to create will create here

        //Creates the Sedimentary rock DB table.
        String CREATE_TABLE_SEDIMENTARY_ROCKS = "CREATE TABLE " + "Sedimentary Rocks"  + "("
                + SEDKEY_ID  + " INTEGER PRIMARY KEY AUTOINCREMENT ,"
                + SEDKEY_name + " TEXT, "
                + SEDKEY_grains + " TEXT, "
                + SEDKEY_clastic + " TEXT, "
                + SEDKEY_cement + " TEXT, "
                + SEDKEY_sortedness + " TEXT, "
                + SEDKEY_location + " TEXT, "
                + SEDKEY_color + " TEXT )";

        db.execSQL(CREATE_TABLE_SEDIMENTARY_ROCKS);

        //Creates the Metamorphic rock DB table
        //TODO

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed, all data will be gone!!!
        db.execSQL("DROP TABLE IF EXISTS " + "Sedimentary Rocks");

        // Create tables again
        onCreate(db);

    }
}
