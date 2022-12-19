/*
package com.example.my_app.my_app.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import com.example.my_app.R;
import com.example.my_app.my_app.Adapted.RecyclerviewAdapter;
import com.example.my_app.my_app.Model.FoodData;

import java.util.ArrayList;
import java.util.List;

public class search_food extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerviewAdapter recyclerviewAdapter;
    EditText searchView;
    CharSequence search="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_food);
        searchView= findViewById(R.id.search_view);


        List<FoodData> foodDataList=new ArrayList<>();

        foodDataList.add(new FoodData("white Rice"));
        foodDataList.add(new FoodData("Brown Rice"));
        foodDataList.add(new FoodData("Meat"));
        foodDataList.add(new FoodData("Chocolate"));
        foodDataList.add(new FoodData("Biryani"));
        foodDataList.add(new FoodData("Pulao"));

        setFoodRecycler(foodDataList);

        searchView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                recyclerviewAdapter.getFilter().filter(charSequence);
                search=charSequence;
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });



    }

    public void setFoodRecycler(List<FoodData> foodDataList){
        recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL,false));

        recyclerviewAdapter=new RecyclerviewAdapter(this,foodDataList);
        recyclerView.setAdapter(recyclerviewAdapter);
    }

}*/
