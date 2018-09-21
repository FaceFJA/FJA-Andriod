package com.example.ty395.fja.Connecter;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;

interface API {
    //Login
    @POST("/join")
    @FormUrlEncoded
    Call<RetrofitRepo> post_member(@Field("id") String id,@Field("pw") String pw,@Field("name") String name, @Field("email") String email, @Field("gender") Integer gender, @Field("old") Integer old);

    @POST("/join/email")
    @FormUrlEncoded
    Call<RetrofitRepo> post_email(@Field("email") String email);

    @POST("/login")
    @FormUrlEncoded
    Call<RetrofitRepo> post_login(@Field("id") String id, @Field("pw") String pw);

    @POST("/auth/id")
    @FormUrlEncoded
    Call<RetrofitRepo> post_findid(@Field("name") String name,@Field("email") String email);

    @POST("/auth/pw")
    @FormUrlEncoded
    Call<RetrofitRepo> post_findpw(@Field("id") String id,@Field("pw") String pw);

    //Evaluation
    @GET("/assess/list/:needCategory")
    Call<RetrofitRepo> get_category_evaluation(@Field("post_id")String post_id,@Field("title")String title,@Field("text")String text,@Field("image")String image,@Field("category")String category,@Field("star")Integer star);

   //Debate
    @GET("/discuss/list/:needCategory")
    Call<RetrofitRepo> get_category_debate(@Field("post_id")String post_id,@Field("title")String title,@Field("text")String text,@Field("image")String image,@Field("category")String category,@Field("star")Integer star);


    //FasioniStar
    @GET("/fashionista/:date")
    Call<RetrofitRepo> get_fasionista(@Field("post_id") Integer post_id,@Field("title")String title,@Field("star")Double star);

    //Mypage
    @GET("/persona")
    Call<RetrofitRepo> get_information(@Field("uid") String uid,@Field("pw") String pw,@Field("gender") Integer gender,@Field("old") Integer old,@Field("email")String email);
    @PUT("/persona")
    Call<RetrofitRepo> put_pw(@Field("pw") String pw);
}
