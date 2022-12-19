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

public class question_5 extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    ImageView arrow;
    ImageView save;
    Spinner weekly_goal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);

        arrow=findViewById(R.id.arrow);
        save=findViewById(R.id.save);
        weekly_goal=findViewById(R.id.spinner_weekly_goal);


        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), question_4.class));
            }
        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
            }
        });

        ArrayAdapter weekly_goal_adapter=ArrayAdapter.createFromResource(this,R.array.weekly_goal,R.layout.spinner_background_2);
        weekly_goal.setAdapter(weekly_goal_adapter);
        weekly_goal.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "item selected", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}