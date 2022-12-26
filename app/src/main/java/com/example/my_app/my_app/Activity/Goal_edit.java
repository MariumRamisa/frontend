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

public class Goal_edit extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal_edit);
//buttons

        ImageView back_arrow=findViewById(R.id.arrow);
        ImageView save_btn=findViewById(R.id.save);

//spinner

        Spinner starting_goal=findViewById(R.id.starting_weight_edit);
        ArrayAdapter starting_goal_adapter=ArrayAdapter.createFromResource(this,R.array.weight,R.layout.spinner_background);
        starting_goal.setAdapter(starting_goal_adapter);
        starting_goal.setOnItemSelectedListener(this);

        Spinner current_goal=findViewById(R.id.current_weight_edit);
        ArrayAdapter current_goal_adapter=ArrayAdapter.createFromResource(this,R.array.weight,R.layout.spinner_background);
        current_goal.setAdapter(current_goal_adapter);
        current_goal.setOnItemSelectedListener(this);

        Spinner goal_weight=findViewById(R.id.Goal_weight_edit);
        ArrayAdapter goal_weight_adapter=ArrayAdapter.createFromResource(this,R.array.weight,R.layout.spinner_background);
        goal_weight.setAdapter(goal_weight_adapter);
        goal_weight.setOnItemSelectedListener(this);

        Spinner weekly_goal=findViewById(R.id.weekly_goal_edit);
        ArrayAdapter weekly_goal_adapter=ArrayAdapter.createFromResource(this,R.array.weekly_goal,R.layout.spinner_background);
        weekly_goal.setAdapter(weekly_goal_adapter);
        weekly_goal.setOnItemSelectedListener(this);

        Spinner activity_level=findViewById(R.id.activity_level_edit);
        ArrayAdapter activity_level_adapter=ArrayAdapter.createFromResource(this,R.array.activity_level,R.layout.spinner_background);
        activity_level.setAdapter(activity_level_adapter);
        activity_level.setOnItemSelectedListener(this);





        back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
            }
        });

        save_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
      //  Toast.makeText(this, "item selected", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}