package com.example.my_app.my_app;

//import com.example.my_app.my_app.Model.Login;
import com.example.my_app.my_app.Model.Login;
import com.example.my_app.my_app.Model.Register;
import com.example.my_app.my_app.Model.Token;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;


public interface Api {

    @FormUrlEncoded
    @POST("register/")
    Call<Register> register(
            @Field("name") String name,
            @Field("email") String email,
            @Field("password") String password
    );
    @FormUrlEncoded
    @POST("login/")
    Call<Login> login( @Field("email") String email,
                       @Field("password") String password);


}
