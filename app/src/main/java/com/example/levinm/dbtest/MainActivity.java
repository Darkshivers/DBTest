package com.example.levinm.dbtest;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private DBHandler dbhandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public int insert(DBHandler dbproduct){
        SQLiteDatabase db = dbhandler.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(DBHandler.KEY_Product, dbproduct.name);
        values.put(DBHandler.Key_ProductBarcode, dbproduct.barcode);

        long newRowId = db.insert(dbhandler.TABLE, null, values);

        return (int) newRowId;
    };


}
