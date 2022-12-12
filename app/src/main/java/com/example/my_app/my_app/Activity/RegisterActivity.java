package com.example.my_app.my_app.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PatternMatcher;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.my_app.R;
import com.example.my_app.my_app.Api;
import com.example.my_app.my_app.Model.Register;
import com.example.my_app.my_app.RetrofitClient;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterActivity extends AppCompatActivity {

    EditText name;
    EditText email;
    EditText password;
    EditText password2;
    Button btnRegister;
    TextView txt_login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        name=findViewById(R.id.username);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        password2=findViewById(R.id.confirm_password);
        btnRegister=findViewById(R.id.register_button);
        txt_login=findViewById(R.id.txtview_login);


        txt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
            }
        });

        // OnClickListener for button register
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userName = name.getText().toString();
                String userEmail = email.getText().toString();
                String userPassword = password.getText().toString();
                String userPassword2 = password2.getText().toString();

                //register user

                if (userName.isEmpty()){
                    name.requestFocus();
                    name.setError("Please enter your name");
                    return;
                }
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
                if (!userPassword2.equals(password)) {
                    password2.requestFocus();
                    password2.setError("Password must be minimum 8 characters");
                    return;
                }


               Call<Register> callRegister = RetrofitClient.getInstance().getApi().register(userName,userEmail,userPassword);
                callRegister.enqueue((new Callback<Register>() {
                    @Override
                    public void onResponse(Call<Register> call, Response<Register> response) {
                        Register registerResponse =response.body();
                       if(response.isSuccessful()){
                           Toast.makeText(RegisterActivity.this, registerResponse.getMessage(), Toast.LENGTH_SHORT).show();
                           startActivity(new Intent(getApplicationContext(), question_1.class));
                       }
                       else {
                           Toast.makeText(RegisterActivity.this,"Registration unsuccessful", Toast.LENGTH_SHORT).show();
                       }
                    }

                    @Override
                    public void onFailure(Call<Register> call, Throwable t) {
                        Toast.makeText(RegisterActivity.this, "t.getMessage()", Toast.LENGTH_SHORT).show();
                    }

                }));

            }
        });
    }


}