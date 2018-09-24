package com.example.ty395.fja.Connecter;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;

interface API {

    //Login
    @POST("join")
    @FormUrlEncoded
    Call<RetrofitRepo> post_member(@Field("id") String id,@Field("pw") String pw,@Field("name") String name, @Field("email") String email, @Field("gender") Integer gender, @Field("old") Integer old);

    @POST("join/email")
    @FormUrlEncoded
    Call<RetrofitRepo> post_email(@Field("email") String email);

    @POST("login")
    @FormUrlEncoded
    Call<RetrofitRepo> post_login(@Field("id") String id, @Field("pw") String pw);

    @POST("auth/id")
    @FormUrlEncoded
    Call<RetrofitRepo> post_findid(@Field("name") String name,@Field("email") String email);

    @POST("auth/pw")
    @FormUrlEncoded
    Call<RetrofitRepo> post_findpw(@Field("id") String id,@Field("pw") String pw);

    //Evaluation

    @GET("assess/list/:needCategory")
    Call<RetrofitRepo> get_category_evaluation(@Field("post_id")String post_id,@Field("title")String title,@Field("text")String text,@Field("image")String image,@Field("category")String category,@Field("star")Integer star);

    @GET("assess/post/:postId")
    Call<RetrofitRepo> get_category_post(@Field("post_id")String post_id,@Field("title")String title,@Field("text")String text,@Field("image")String image,@Field("category")String category,@Field("star")Integer star,@Field("comments") String comments);

    @PUT("assess/markStar/:postId")
    Call<RetrofitRepo> put_star(@Field("star") Integer star);

    @GET("assess/comments/:postId")
    Call<RetrofitRepo> get_comments(@Field("comment_id")String comment_id,@Field("text") String text,@Field("like") Integer like,@Field("unlike") Integer unlike,@Field("image") String image);

    @POST("assess/commentUpload/:postId")
    @FormUrlEncoded
    Call<RetrofitRepo> post_comments(@Field("text")String text);

    @PUT("assess/markLike/:commentId")
    Call<RetrofitRepo> put_commentId(@Field("comment_id")String comment_id);

    @POST("assess/upload/")
    @FormUrlEncoded
    Call<RetrofitRepo> post_post(@Field("title")String title,@Field("text")String text,@Field("category") String category,@Field("image") String image);

    //Debate

    @GET("discuss/list/:needCategory")
    Call<RetrofitRepo> get_dabate_category_debate(@Field("post_id")String post_id,@Field("title")String title,@Field("text")String text,@Field("image")String image,@Field("category")String category,@Field("star")Integer star);

    @GET("discuss/post/:postId")
    Call<RetrofitRepo> get_dabate_category_post(@Field("post_id")String post_id,@Field("title")String title,@Field("text")String text,@Field("image")String image,@Field("category")String category,@Field("star")Integer star,@Field("comments") String comments);

    @PUT("discuss/markStar/:postId")
    Call<RetrofitRepo> put_dabate_star(@Field("star") Integer star);

    @GET("discuss/comments/:postId")
    Call<RetrofitRepo> get_dabate_comments(@Field("comment_id")String comment_id,@Field("text") String text,@Field("like") Integer like,@Field("unlike") Integer unlike,@Field("image") String image);

    @POST("discuss/commentUpload/:postId")
    @FormUrlEncoded
    Call<RetrofitRepo> post_dabate_comments(@Field("text")String text);

    @PUT("discuss/markLike/:commentId")
    Call<RetrofitRepo> put_dabate_commentId(@Field("comment_id")String comment_id);

    @POST("discuss/upload/")
    @FormUrlEncoded
    Call<RetrofitRepo> post_dabate_post(@Field("title")String title,@Field("text")String text,@Field("category") String category,@Field("image") String image);

    //FasioniStar
    @GET("fashionista/:date")
    Call<RetrofitRepo> get_fasionista(@Field("post_id") Integer post_id,@Field("title")String title,@Field("star")Double star);

    //Mypage
    @GET("persona")
    Call<RetrofitRepo> get_information(@Field("uid") String uid,@Field("pw") String pw,@Field("gender") Integer gender,@Field("old") Integer old,@Field("email")String email);
    @PUT("persona")
    Call<RetrofitRepo> put_pw(@Field("pw") String pw);
}
