package com.example.myapplication.Models;

public class MainModel {
    int image;
    String type,price,description;

    public MainModel(int image, String name, String price, String description) {
        this.image = image;
        this.type = name;
        this.price = price;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.type = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
