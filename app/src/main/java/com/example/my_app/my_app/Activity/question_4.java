package com.example.my_app.my_app.Activity;

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

import com.example.my_app.R;

public class question_4 extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    ImageView arrow;
    ImageView next;
    Spinner height;
    Spinner weight;
    Spinner goal_weight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);

        arrow=findViewById(R.id.arrow);
        next=findViewById(R.id.next_arrow);
        height=findViewById(R.id.spinner_height);
        weight=findViewById(R.id.spinner_current_weight);
        goal_weight=findViewById(R.id.spinner_goal);

        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), question_3.class));
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), question_5.class));
            }
        });

        ArrayAdapter height_adapter=ArrayAdapter.createFromResource(this,R.array.height,R.layout.spinner_background_2);
        height.setAdapter(height_adapter);
        height.setOnItemSelectedListener(this);

        ArrayAdapter weight_adapter=ArrayAdapter.createFromResource(this,R.array.weight,R.layout.spinner_background_2);
        weight.setAdapter(weight_adapter);
        weight.setOnItemSelectedListener(this);

        ArrayAdapter goal_weight_adapter=ArrayAdapter.createFromResource(this,R.array.weight,R.layout.spinner_background_2);
        goal_weight.setAdapter(goal_weight_adapter);
        goal_weight.setOnItemSelectedListener(this);


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "item selected", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}