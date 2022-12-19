package com.example.my_app.my_app;

//import com.example.my_app.my_app.Model.Login;
import com.example.my_app.my_app.Model.Register;
import com.example.my_app.my_app.Model.Token;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;


public interface Api {

    @POST("register/")
    Call<ResponseBody> register(@Body Register register);

 //   @POST("login")
//    Call<Token> login(@Body Login login);


}
