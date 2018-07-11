package com.example.ty395.fja;

import android.support.v7.widget.RecyclerView;

public class Evalation_Recycleitem {
    int image;
    String title;
    String subtitle;

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public Evalation_Recycleitem(int image, String title, String subtitle) {
        this.image = image;
        this.title = title;
        this.subtitle = subtitle;
    }
}

