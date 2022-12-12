package com.example.my_app.my_app.Activity;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class BaseDataActivity extends AppCompatActivity {

    public static final int OK = 200;
    public static final int CREATED = 201;
    public static final int ACCEPTED = 202;
    public static final int BAD_REQUEST = 400;
    public static final int UNAUTHORIZED = 401;
    public Intent startActivity;

    //public ApiInterface getApi () {

      //  return AppPrefs.getInstance(getApplicationContext()).getApi();
    //}


}
