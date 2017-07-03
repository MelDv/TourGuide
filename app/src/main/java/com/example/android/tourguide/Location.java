package com.example.android.tourguide;

public class Location {
    private String title;
    private String address;
    private String description;
    private int image = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Location(String title, String address, String description, int image) {
        this.title = title;
        this.address = address;
        this.description = description;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageResourceId() {
        return image;
    }

    public void setImage(int image) { this.image = image; }

    public boolean hasImage() {
        return image != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return title + ": " + description + "\naddress";
    }
}
