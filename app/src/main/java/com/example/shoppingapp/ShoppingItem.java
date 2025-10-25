package com.example.shoppingapp;

public class ShoppingItem {

    private Integer imageID;
    private String description;
    private String title;

    public ShoppingItem(int imageID, String title, String description) {
        this.imageID = imageID;
        this.description = description;
        this.title = title;
    }

    public Integer getImageID() {
        return imageID;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

}
