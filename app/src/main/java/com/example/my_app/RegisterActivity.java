package com.example.my_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText username=findViewById(R.id.username);
        EditText user_email=findViewById(R.id.email);
        EditText user_password=findViewById(R.id.password);
        EditText confirmPassword=findViewById(R.id.confirm_password);
        Button register_btn=findViewById(R.id.register_button);
        TextView txt_login=findViewById(R.id.txtview_login);


        txt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),LoginActivity.class));
            }
        });

        register_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 String email = user_email.getText().toString().trim();
                String pass = user_password.getText().toString().trim();
                String cpass = confirmPassword.getText().toString().trim();
                 String name = username.getText().toString();

                if (TextUtils.isEmpty(name)) {
                    username.setError("Username is Required");
                    return;
                }
                if (TextUtils.isEmpty(email)) {
                    user_email.setError("Email is Required");
                    return;
                }
                if (TextUtils.isEmpty(pass)) {
                    user_password.setError("Password is Required");
                    return;
                }
                if (pass.length() < 8) {
                    user_password.setError("Password must be 8 character");
                }
                if (!cpass.equals(pass)) {
                    confirmPassword.setError("Password doesn't match");
                }

                else{
                    Toast.makeText(RegisterActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getApplicationContext(),LoginActivity.class));
                }
            }
        });
    }
}