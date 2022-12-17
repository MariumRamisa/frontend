package com.example.my_app.my_app.Model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Access {
    @SerializedName("access")
    @Expose
    private String access;

    public Access(String access) {
        this.access = access;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    @Override
    public String toString() {
        return "Access{" +
                "access='" + access + '\'' +
                '}';
    }
}

