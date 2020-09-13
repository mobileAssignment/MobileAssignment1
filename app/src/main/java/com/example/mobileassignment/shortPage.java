package com.example.mobileassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class shortPage extends AppCompatActivity {
    TextView mShort1,mShort2,mShort3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_short_page);

        mShort1=findViewById(R.id.short1);
        mShort2=findViewById(R.id.short2);
        mShort3=findViewById(R.id.short3);

        mShort1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openShort1();
            }

            public void openShort1(){
                Intent intent=new Intent(shortPage.this,short1.class);
                startActivity(intent);
            }
        });

        mShort2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openShort2();
            }

            public void openShort2(){
                Intent intent=new Intent(shortPage.this,short2.class);
                startActivity(intent);
            }
        });

        mShort3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openShort3();
            }

            public void openShort3(){
                Intent intent=new Intent(shortPage.this,short3.class);
                startActivity(intent);
            }
        });
    }
}