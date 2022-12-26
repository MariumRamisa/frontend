package com.example.my_app.my_app.Model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Login {
   User user;
   String message;

    public Login() {
    }

    public Login(User user, String message) {
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
