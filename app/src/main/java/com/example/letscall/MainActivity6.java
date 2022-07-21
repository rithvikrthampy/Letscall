package com.example.letscall;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        MaterialButton qrcodejoin = (MaterialButton) findViewById(R.id.qrcodejoin);
        qrcodejoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), MainActivity4.class);
                startActivity(i);
            }
        });
        MaterialButton invitejoin = (MaterialButton) findViewById(R.id.invitejoin);
        invitejoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), MainActivity5.class);
                startActivity(i);
            }
        });
    }}
