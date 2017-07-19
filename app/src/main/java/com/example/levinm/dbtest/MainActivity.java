package com.example.levinm.dbtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DBHandler db = new DBHandler(this);
//        Log.d("insert: ","Inserting.. " );
//        db.insert(this);

        Log.d("READING: ", "Reading all Products");


        List<Product> product = db.getAllProducts();

        for (Product product1 : product) {
            String log = "id: " + product1.getId() + ", Name: " + product1.getName() + " , Barcode: " + product1.getBarCode();

            Log.d("Shop::", log);
        }

        Product product2 = db.getProduct("5060408160299");
        String log2 = "id: " + product2.getId() + ", Name: " + product2.getName() + " , Barcode: " + product2.getBarCode();
        Log.d("Product:", log2);




    }
}












