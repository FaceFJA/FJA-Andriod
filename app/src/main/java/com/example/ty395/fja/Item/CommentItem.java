package com.example.ty395.fja.Item;

public class CommentItem {
    String text_nickname;
    String text_recommend;
    public CommentItem(){}

    public String getText_nickname() {
        return text_nickname;
    }

    public void setText_nickname(String text_nickname) {
        this.text_nickname = text_nickname;
    }
    public CommentItem(String text_nickname,String text_recommend) {
        this.text_nickname = text_nickname;
        this.text_recommend=text_recommend;
    }

    public String getText_recommend() {
        return text_recommend;
    }

    public void setText_recommend(String text_recommend) {
        this.text_recommend = text_recommend;
    }
}
