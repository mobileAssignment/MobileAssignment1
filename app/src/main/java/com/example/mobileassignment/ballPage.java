package com.example.mobileassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ballPage extends AppCompatActivity {
    TextView mBall1,mBall2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ball_page);

        mBall1=findViewById(R.id.ball1);
        mBall2=findViewById(R.id.ball2);

        mBall1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openBall1();
            }

            public void openBall1(){
                Intent intent=new Intent(ballPage.this,ball1.class);
                startActivity(intent);
            }
        });

        mBall2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openBall2();
            }

            public void openBall2(){
                Intent intent=new Intent(ballPage.this,ball2.class);
                startActivity(intent);
            }
        });


    }
}