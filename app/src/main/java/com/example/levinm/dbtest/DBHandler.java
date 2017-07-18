package com.example.levinm.dbtest;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by levinm on 18/07/2017.
 */

public class DBHandler extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "FeedReader.db";

    public int id;
    public String name;
    public String barcode;

    //Table Name
    public static final String TABLE = "Products";

    //Table Column Names
    public static final String KEY_ID = "_id";
    public static final String KEY_Product = "Product Name";
    public static final String Key_ProductBarcode = "barcode";

    ;


    public DBHandler(Context context) {
        super(context, DATABASE_NAME, null , DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String CREATE_TABLE_PRODUCTS = "CREATE TABLE " + TABLE + "("
                + KEY_ID + "INTEGER PRIMARY KEY AUTOINCREMENT ,"
                + KEY_Product + "TEXT, "
                + Key_ProductBarcode + "TEXT)";
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int OldVersion, int NewVersion) {

        //Drop Older table
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE);

        //Recreate
        onCreate(sqLiteDatabase);


    }

    public void insert(Product product){

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_ID , product.getId());
        values.put(KEY_Product, product.getName());
        values.put(Key_ProductBarcode, product.getBarCode());

        db.insert(this.TABLE, null, values);

    }




}




