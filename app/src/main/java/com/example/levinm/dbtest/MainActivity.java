package com.example.levinm.dbtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DBHandler db = new DBHandler(this);
        Log.d("insert: ","Inserting.. " );

        db.insert(new Product(1, "Davanti","4060800173010"));



    }








}
