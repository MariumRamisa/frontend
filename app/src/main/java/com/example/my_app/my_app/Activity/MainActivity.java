package com.example.my_app.my_app.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;

import com.example.my_app.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends AppCompatActivity  {


    ProgressBar pb;
    int counter=0;

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
                        startActivity(new Intent(getApplicationContext(), DiaryActivity.class));
                        overridePendingTransition(0,0);
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



        ShapeableImageView profile_image=findViewById(R.id.shapeableImageView);

        profile_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),ProfileActivity.class));
            }
        });

        prog();

    }
 // steps progressbar
     public void prog()
     {
         pb=findViewById(R.id.steps_progressBar);
         final Timer t =new Timer();
         TimerTask tt = new TimerTask() {
             @Override
             public void run() {
                 counter++;
                 pb.setProgress((counter));
                 if(counter==100){
                     t.cancel();
                 }
             }
         };
         t.schedule(tt,0,100);
     }

}