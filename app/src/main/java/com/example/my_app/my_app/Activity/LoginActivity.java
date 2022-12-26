package com.example.my_app.my_app.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.my_app.R;
//import com.example.my_app.my_app.Model.Login;
import com.example.my_app.my_app.Model.Login;
import com.example.my_app.my_app.RetrofitClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity  {

    EditText email;
    EditText password;
    Button login_btn;
    TextView forget_password;
    TextView reg;
    Button google_btn;
    Button facebook_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        login_btn=findViewById(R.id.login_button);
        forget_password=findViewById(R.id.txtview_forgetpassword);
        reg=findViewById(R.id.txtview_register);
        google_btn=findViewById(R.id.google_button);
        facebook_btn=findViewById(R.id.facebook_button);


        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), RegisterActivity.class));
            }
        });

        forget_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Forget_password.class));
            }
        });
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userEmail = email.getText().toString();
                String userPassword = password.getText().toString();

                if (userEmail.isEmpty()){
                    email.requestFocus();
                    email.setError("Please enter your email");
                    return;
                }

                if (!Patterns.EMAIL_ADDRESS.matcher(userEmail).matches()){
                    email.requestFocus();
                    email.setError("Please enter correct email");
                    return;
                }
                if (userPassword.isEmpty()){
                    password.requestFocus();
                    password.setError("Please enter your password");
                    return;
                }
                if (userPassword.length()<8){
                    password.requestFocus();
                    password.setError("Password must be minimum 8 characters");
                    return;
                }

                Call<Login> call = RetrofitClient.getInstance().getApi().login(userEmail,userPassword);
                call.enqueue(new Callback<Login>() {
                    @Override
                    public void onResponse(Call<Login> call, Response<Login> response) {
                        Login loginResponse=response.body();
                        if (response.isSuccessful()){
                            Toast.makeText(LoginActivity.this, loginResponse.getMessage(), Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        }
                        else {
                            Toast.makeText(LoginActivity.this,loginResponse.getMessage(), Toast.LENGTH_SHORT).show();
                        }

                    }

                    @Override
                    public void onFailure(Call<Login> call, Throwable t) {
                        Toast.makeText(LoginActivity.this, "t.getMessage()", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }


}