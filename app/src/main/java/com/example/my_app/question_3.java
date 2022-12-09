package com.example.my_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class question_3 extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);

        ImageView arrow=findViewById(R.id.arrow);
        ImageView next=findViewById(R.id.next_arrow);
        TextView male=findViewById(R.id.txt_male);
        TextView female=findViewById(R.id.txt_female);

        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),question_2.class));
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),question_4.class));
            }
        });

        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Spinner age=findViewById(R.id.spinner_age);
        ArrayAdapter age_adapter=ArrayAdapter.createFromResource(this,R.array.age,R.layout.spinner_background_2);
        age.setAdapter(age_adapter);
        age.setOnItemSelectedListener(this);

        Spinner location=findViewById(R.id.spinner_location);
        ArrayAdapter location_adapter=ArrayAdapter.createFromResource(this,R.array.location,R.layout.spinner_background_2);
        location.setAdapter(location_adapter);
        location.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}