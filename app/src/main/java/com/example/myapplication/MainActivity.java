package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button masa1, masa2, masa3, masa4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        masa1 = findViewById(R.id.masa1);
        masa2 = findViewById(R.id.masa2);
        masa3 = findViewById(R.id.masa3);
        masa4 = findViewById(R.id.masa4);

        masa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOrderActivity(1);
            }
        });

        masa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOrderActivity(2);
            }
        });

        masa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOrderActivity(3);
            }
        });

        masa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOrderActivity(4);
            }
        });


        Button menuButton = findViewById(R.id.menuButton);
        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });
    }

    public void openOrderActivity(int masaNumarasi) {
        Intent intent = new Intent(MainActivity.this, OrderActivity.class);
        intent.putExtra("masa_numarasi", masaNumarasi);
        startActivity(intent);
    }
}
