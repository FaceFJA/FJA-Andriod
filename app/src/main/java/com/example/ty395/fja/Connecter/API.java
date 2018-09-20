package com.example.ty395.fja.Connecter;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

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
    //FasioniStar
    //Mypage
}
