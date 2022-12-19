package com.example.my_app.my_app.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.my_app.R;

public class ExerciseActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    ImageView save;
    ImageView back_arrow;
    Spinner exercise_name;
    Spinner exercise_quantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        save=findViewById(R.id.save);
        back_arrow=findViewById(R.id.arrow);
        exercise_name=findViewById(R.id.spinner_exercise_name);
        exercise_quantity=findViewById(R.id.spinner_amount);

        back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ArrayAdapter exercise_name_adapter=ArrayAdapter.createFromResource(this,R.array.exercise,R.layout.spinner_background);
        exercise_name.setAdapter(exercise_name_adapter);
        exercise_name.setOnItemSelectedListener(this);

        ArrayAdapter exercise_quantity_adapter=ArrayAdapter.createFromResource(this,R.array.number,R.layout.spinner_background);
        exercise_quantity.setAdapter(exercise_quantity_adapter);
        exercise_quantity.setOnItemSelectedListener(this);





    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "item selected", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}