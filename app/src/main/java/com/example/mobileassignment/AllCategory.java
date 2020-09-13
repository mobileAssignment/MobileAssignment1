package com.example.mobileassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.mobileassignment.adapter.AllCategoryAdapter;
import com.example.mobileassignment.model.AllCategory_model;
import com.example.mobileassignment.model.Category;

import java.util.ArrayList;
import java.util.List;

public class AllCategory extends AppCompatActivity {

    RecyclerView allCategoryRecycler;
    AllCategoryAdapter allCategoryAdapter;
    List<AllCategory_model> allCategoryModelList;
    ImageView back,shoe,shirt,pants,bottle,gym,ball;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_category);

        allCategoryRecycler =findViewById(R.id.all_category);
        back=findViewById(R.id.backButton);
        shoe=findViewById(R.id.shoeCate);
        shirt=findViewById(R.id.shirtCate);
        pants=findViewById(R.id.shortCate);
        bottle=findViewById(R.id.bottleCate);
        gym=findViewById(R.id.gymCate);
        ball=findViewById(R.id.ballCate);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                previousPage();
            }
            public void previousPage(){
                Intent intent = new Intent(AllCategory.this,MainActivity.class);
                startActivity(intent);
            }
        });

        shoe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                shoePage();
            }
            public void shoePage(){
                Intent intent = new Intent(AllCategory.this,shoePage.class);
                startActivity(intent);
            }
        });

        shirt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                shirtPage();
            }
            public void shirtPage(){
                Intent intent = new Intent(AllCategory.this,shirtPage.class);
                startActivity(intent);
            }
        });

        pants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                shortsPage();
            }
            public void shortsPage(){
                Intent intent = new Intent(AllCategory.this,shortPage.class);
                startActivity(intent);
            }
        });

        bottle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                bottlePage();
            }
            public void bottlePage(){
                Intent intent = new Intent(AllCategory.this,bottlePage.class);
                startActivity(intent);
            }
        });

        gym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                gymPage();
            }
            public void gymPage(){
                Intent intent = new Intent(AllCategory.this,gymPage.class);
                startActivity(intent);
            }
        });

        ball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                ballPage();
            }
            public void ballPage(){
                Intent intent = new Intent(AllCategory.this,ballPage.class);
                startActivity(intent);
            }
        });



        // adding data to model
        allCategoryModelList=new ArrayList<>();
        allCategoryModelList.add(new AllCategory_model(1,R.drawable.shoeicon));
        allCategoryModelList.add(new AllCategory_model(2,R.drawable.shorticon2));
        allCategoryModelList.add(new AllCategory_model(3,R.drawable.shirticon));
        allCategoryModelList.add(new AllCategory_model(4,R.drawable.gymicon));
        allCategoryModelList.add(new AllCategory_model(5,R.drawable.bicycleicon));
        allCategoryModelList.add(new AllCategory_model(6,R.drawable.snowboardicon));
        allCategoryModelList.add(new AllCategory_model(7,R.drawable.ballicon));
        allCategoryModelList.add(new AllCategory_model(8,R.drawable.racketicon));
        allCategoryModelList.add(new AllCategory_model(9,R.drawable.bottleicon));

        setCategoryRecycler(allCategoryModelList);
    }

    private void setCategoryRecycler(List<AllCategory_model>allCategoryModelList) {
        RecyclerView.LayoutManager layoutManager=new GridLayoutManager(this,3);
        allCategoryRecycler.setLayoutManager(layoutManager);
        allCategoryAdapter = new AllCategoryAdapter(this,allCategoryModelList);
        allCategoryRecycler.setAdapter(allCategoryAdapter);
    }
}