package com.example.my_app.my_app.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.my_app.R;
import com.example.my_app.my_app.Activity.Goal_edit;
import com.example.my_app.my_app.Activity.MainActivity;

public class ProfileActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    ImageView back_arrow;
    ImageView save_btn;
    TextView goal;
    EditText username;
    EditText email;
    Spinner height;
    Spinner age;
    Spinner location;
    Spinner gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        back_arrow=findViewById(R.id.arrow);
        save_btn=findViewById(R.id.save);
        goal=findViewById(R.id.Goal);
        username=findViewById(R.id.username_edit);
        email=findViewById(R.id.email_edit);

        height=findViewById(R.id.height_edit);
        ArrayAdapter height_adapter=ArrayAdapter.createFromResource(this,R.array.height,R.layout.spinner_background);
        height.setAdapter(height_adapter);
        height.setOnItemSelectedListener(this);

        age=findViewById(R.id.age_edit);
        ArrayAdapter age_adapter=ArrayAdapter.createFromResource(this,R.array.age,R.layout.spinner_background);
        age.setAdapter(age_adapter);
        age.setOnItemSelectedListener(this);

        location=findViewById(R.id.location_edit);
        ArrayAdapter location_adapter=ArrayAdapter.createFromResource(this,R.array.location,R.layout.spinner_background);
        location.setAdapter(location_adapter);
        location.setOnItemSelectedListener(this);

        gender=findViewById(R.id.gender_edit);
        ArrayAdapter gender_adapter=ArrayAdapter.createFromResource(this,R.array.gender,R.layout.spinner_background);
        gender.setAdapter(height_adapter);
        gender.setOnItemSelectedListener(this);

        back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });
        save_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });

        goal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Goal_edit.class));
            }
        });


    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
       // Toast.makeText(this, "item selected", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}