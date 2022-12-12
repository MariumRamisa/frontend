package com.example.my_app.my_app;

import com.example.my_app.my_app.Model.Register;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Api {

    @FormUrlEncoded
    @POST("user/")
    Call<Register> register(
            @Field("name") String name,
            @Field("email") String email,
            @Field("password") String password);

}
