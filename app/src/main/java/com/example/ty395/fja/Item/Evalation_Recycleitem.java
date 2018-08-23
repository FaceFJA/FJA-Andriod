package com.example.ty395.fja.Item;

import android.support.v7.widget.RecyclerView;

public class Evalation_Recycleitem {
    int image;
    String title;
    String subtitle;
    public Evalation_Recycleitem(){

    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Evalation_Recycleitem(int image, String title, String subtitle) {
        this.image = image;
        this.title = title;
        this.subtitle = subtitle;
    }
}

