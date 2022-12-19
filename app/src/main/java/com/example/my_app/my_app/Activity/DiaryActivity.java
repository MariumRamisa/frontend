
package com.example.my_app.my_app.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.my_app.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DiaryActivity extends AppCompatActivity {

    TextView input_food;
    TextView input_exercise;
    TextView remaining_cal;
    TextView AddBreakfast;
    TextView AddLunch;
    TextView AddDinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary);

        input_food=findViewById(R.id.txtview_input_food);
        input_exercise=findViewById(R.id.txtview_input_exercise);
        remaining_cal=findViewById(R.id.txtview_input_total);
        AddBreakfast=findViewById(R.id.Add_food_breakfast);
        AddLunch=findViewById(R.id.Add_food_lunch);
        AddDinner=findViewById(R.id.Add_food_dinner);


        // adding breakfast
        AddBreakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), AddFood.class));
            }
        });
        //adding lunch
        AddLunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), AddFood.class));
            }
        });
        //adding dinner
        AddDinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), AddFood.class));
            }
        });


//navigation
        BottomNavigationView navigationView=findViewById(R.id.bottomNavigationView);
        navigationView.setSelectedItemId(R.id.diary);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
           @Deprecated
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.dashboard:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.diary:

                        return true;

                    case R.id.profile:
                        startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.plans:
                        startActivity(new Intent(getApplicationContext(), PlanActivity.class));
                        overridePendingTransition(0,0);
                        return true;


                }

                return false;
            }
        });
    }
}