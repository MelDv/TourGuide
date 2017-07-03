package com.example.android.tourguide;

public class Location {
    private int title;
    private int address;
    private int description;
    private int image = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Location(int title, int address, int description, int image) {
        this.title = title;
        this.address = address;
        this.description = description;
        this.image = image;
    }


    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public int getDescription() {
        return description;
    }

    public void setDescription(int description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public boolean hasImage() {
        return image != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return title + ": " + description + "\naddress: " + address + "\nImage id: " + image;
    }
}
