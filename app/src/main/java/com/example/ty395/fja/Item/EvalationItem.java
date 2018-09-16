package com.example.ty395.fja.Item;

public class EvalationItem {
    int image;
    String title;
    String subtitle;
    public EvalationItem(){

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

    public EvalationItem(int image, String title, String subtitle) {
        this.image = image;
        this.title = title;
        this.subtitle = subtitle;
    }
}
