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

import com.example.my_app.R;

public class AddFood extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    ImageView save;
    ImageView arrow;
    Spinner food_name;
    Spinner servingSize;
    Spinner meal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_food);

        save=findViewById(R.id.save);
        arrow=findViewById(R.id.arrow);
        food_name=findViewById(R.id.spinner_food_name);
        servingSize=findViewById(R.id.spinner_serving_size);
        meal=findViewById(R.id.spinner_meal);

        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), DiaryActivity.class));
            }
        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), DiaryActivity.class));
            }
        });

        ArrayAdapter food_name_adapter=ArrayAdapter.createFromResource(this,R.array.food,R.layout.spinner_background);
        food_name.setAdapter(food_name_adapter);
        food_name.setOnItemSelectedListener(this);

        ArrayAdapter serving_size_adapter=ArrayAdapter.createFromResource(this,R.array.serving_size,R.layout.spinner_background);
        servingSize.setAdapter(serving_size_adapter);
        servingSize.setOnItemSelectedListener(this);

        ArrayAdapter meal_adapter=ArrayAdapter.createFromResource(this,R.array.meal,R.layout.spinner_background);
        meal.setAdapter(meal_adapter);
        meal.setOnItemSelectedListener(this);


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}