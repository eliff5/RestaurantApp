package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {
    EditText yemekAdedi1, yemekAdedi2, yemekAdedi3;
    Button siparisVerButton;
    int masaNumarasi = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        yemekAdedi1 = findViewById(R.id.yemekAdedi1);
        yemekAdedi2 = findViewById(R.id.yemekAdedi2);
        yemekAdedi3 = findViewById(R.id.yemekAdedi3);
        siparisVerButton = findViewById(R.id.siparisVerButton);


        ArrayList<String> selectedItems = getIntent().getStringArrayListExtra("selectedItems");

        if (selectedItems != null && !selectedItems.isEmpty()) {
            Toast.makeText(this, "Seçilen Yemekler: " + selectedItems.toString(), Toast.LENGTH_LONG).show();
        }


        siparisVerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String yemek1Adet = yemekAdedi1.getText().toString();
                String yemek2Adet = yemekAdedi2.getText().toString();
                String yemek3Adet = yemekAdedi3.getText().toString();

                if (yemek1Adet.isEmpty() && yemek2Adet.isEmpty() && yemek3Adet.isEmpty()) {
                    Toast.makeText(OrderActivity.this, "Lütfen en az bir yemek seçin!", Toast.LENGTH_SHORT).show();
                } else {
                    StringBuilder siparis = new StringBuilder("Masa " + masaNumarasi + " için sipariş:\n");
                    if (!yemek1Adet.isEmpty())
                        siparis.append("Yemek 1: ").append(yemek1Adet).append(" adet\n");
                    if (!yemek2Adet.isEmpty())
                        siparis.append("Yemek 2: ").append(yemek2Adet).append(" adet\n");
                    if (!yemek3Adet.isEmpty())
                        siparis.append("Yemek 3: ").append(yemek3Adet).append(" adet\n");

                    Toast.makeText(OrderActivity.this, siparis.toString(), Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(OrderActivity.this, ProcessingActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}



