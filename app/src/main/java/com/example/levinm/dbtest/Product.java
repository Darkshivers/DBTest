package com.example.levinm.dbtest;

/**
 * Created by levinm on 18/07/2017.
 */

public class Product {

    private int id;
    private String name;
    private String barcode;

    public Product(){}


    public Product(int id, String name, String barcode){

        this.id = id;
        this.name = name;
        this.barcode = barcode;
    }

public void setId(int id) {
    this.id = id;

}

public void setName(String name) {
    this.name = name;
}

public int getId() {
    return id;
}

public String getBarCode() {
    return barcode;
}

public String getName() {
    return name;
}

}
