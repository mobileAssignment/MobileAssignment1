package com.example.mobileassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class gymPage extends AppCompatActivity {
    TextView mGym1,mGym2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gym_page);

        mGym1=findViewById(R.id.gym1);
        mGym2=findViewById(R.id.gym2);

        mGym1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openGym1();
            }

            public void openGym1(){
                Intent intent=new Intent(gymPage.this,gym1.class);
                startActivity(intent);
            }
        });

        mGym2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openGym1();
            }

            public void openGym1(){
                Intent intent=new Intent(gymPage.this,gym2.class);
                startActivity(intent);
            }
        });
    }
}