package com.example.mobileassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class bottlePage extends AppCompatActivity {
    TextView mBottle1,mBottle2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottle_page);

        mBottle1=findViewById(R.id.bottle1);
        mBottle2=findViewById(R.id.bottle2);

        mBottle1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openBottle1();
            }

            public void openBottle1(){
                Intent intent=new Intent(bottlePage.this,bottle1.class);
                startActivity(intent);
            }
        });

        mBottle2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openBottle2();
            }

            public void openBottle2(){
                Intent intent=new Intent(bottlePage.this,bottle2.class);
                startActivity(intent);
            }
        });
    }
}