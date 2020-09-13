package com.example.mobileassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class shirtPage extends AppCompatActivity {
    TextView mShirt1,mShirt2,mShirt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shirt_page);

        mShirt1=findViewById(R.id.shirt1);
        mShirt2=findViewById(R.id.shirt2);
        mShirt3=findViewById(R.id.shirt3);

        mShirt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openShirt1();
            }

            public void openShirt1(){
                Intent intent=new Intent(shirtPage.this,shirt1.class);
                startActivity(intent);
            }
        });

        mShirt2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openShirt2();
            }

            public void openShirt2(){
                Intent intent=new Intent(shirtPage.this,shirt2.class);
                startActivity(intent);
            }
        });

        mShirt3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openShirt3();
            }

            public void openShirt3(){
                Intent intent=new Intent(shirtPage.this,shirt3.class);
                startActivity(intent);
            }
        });
    }


}