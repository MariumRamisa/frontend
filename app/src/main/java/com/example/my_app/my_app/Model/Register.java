package com.example.my_app.my_app.Model;
import android.widget.EditText;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Register {
    User user;
    String message;


    public Register() {
    }

    public Register(User user, String message) {
        this.user = user;
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
