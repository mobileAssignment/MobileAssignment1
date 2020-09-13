package com.example.mobileassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class shoePage extends AppCompatActivity {
    TextView mShoe1,mShoe2,mShoe3,mShoe4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoe_page);

        mShoe1=findViewById(R.id.shoe1);
        mShoe2=findViewById(R.id.shoe2);
        mShoe3=findViewById(R.id.shoe3);
        mShoe4=findViewById(R.id.shoe4);

        mShoe1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openShoe1();
            }

            public void openShoe1(){
                Intent intent=new Intent(shoePage.this,shoe1.class);
                startActivity(intent);
            }
        });

        mShoe2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openShoe2();
            }

            public void openShoe2(){
                Intent intent=new Intent(shoePage.this,shoe2.class);
                startActivity(intent);
            }
        });

        mShoe3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openShoe3();
            }

            public void openShoe3(){
                Intent intent=new Intent(shoePage.this,shoe3.class);
                startActivity(intent);
            }
        });

        mShoe4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openShoe4();
            }

            public void openShoe4(){
                Intent intent=new Intent(shoePage.this,shoe4.class);
                startActivity(intent);
            }
        });
    }
}