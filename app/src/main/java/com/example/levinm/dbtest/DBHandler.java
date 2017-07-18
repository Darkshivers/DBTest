package com.example.levinm.dbtest;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by levinm on 18/07/2017.
 */

public class DBHandler extends SQLiteOpenHelper {

    SQLiteDatabase db;

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "FeedReader.db";
    private static final String TABLE = "Product";


    //Table Column Names
    public static final String KEY_ID = "id";
    public static final String KEY_Product = "ProductName";
    public static final String Key_ProductBarcode = "barcode";


    //Table Name


    public DBHandler(Context context) {
        super(context, DATABASE_NAME, null , DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {


        Log.d("creating: ","Inserting.. " );

        String CREATE_TABLE_PRODUCTS = "CREATE TABLE " + TABLE + " (" +
                KEY_ID + " INTEGER PRIMARY KEY," +
                KEY_Product + " TEXT," +
                Key_ProductBarcode + " TEXT)";


        db.execSQL(CREATE_TABLE_PRODUCTS);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int OldVersion, int NewVersion) {

        //Drop Older table
        db.execSQL("DROP TABLE IF EXISTS " + TABLE);

        //Recreate
        onCreate(db);


    }

    public void insert(Product product){



        SQLiteDatabase db = getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(Key_ProductBarcode, product.getBarCode());
        values.put(KEY_ID , product.getId());
        values.put(KEY_Product, product.getName());

        db.insert(this.TABLE, null, values);
        db.close();

    }




}




