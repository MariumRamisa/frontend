package com.example.my_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.imageview.ShapeableImageView;


public class MainActivity extends AppCompatActivity  {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SearchView searchView=findViewById(R.id.search_view);
        searchView.clearFocus();
        BottomNavigationView navigationView=findViewById(R.id.bottomNavigationView);
        navigationView.setSelectedItemId(R.id.dashboard);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Deprecated
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.dashboard:
                        return true;

                    case R.id.diary:
                        startActivity(new Intent(getApplicationContext(),DiaryActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.profile:
                        startActivity(new Intent(getApplicationContext(),ProfileActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.plans:
                        startActivity(new Intent(getApplicationContext(),PlanActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                }

                return false;
            }
        });



        ShapeableImageView profile_image=findViewById(R.id.shapeableImageView);

        profile_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),ProfileActivity.class));
            }
        });



    }


}