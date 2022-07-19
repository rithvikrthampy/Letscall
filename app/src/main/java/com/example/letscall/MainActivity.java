package com.example.letscall;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity{
//    private GlassGestureDetector glassGestureDetector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        glassGestureDetector = new GlassGestureDetector(this, this);
        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent i = new Intent(view.getContext(), MainActivity2.class);
                                            startActivity(i);
                                        }
                                    });
    }}

//        @Override
//        public boolean dispatchTouchEvent(MotionEvent ev) {
//            return glassGestureDetector.onTouchEvent(ev) || super.dispatchTouchEvent(ev);
//
//
//        }

//    @Override
//    public boolean onGesture(Gesture gesture) {
//        switch (gesture) {
//            case SWIPE_DOWN:
//                finish();
//                return true;
//            default:
//                return false;
//    }

        /*public void nextActivity(View view){

            Toast.makeText(MainActivity.this, "Hello Rithvik !!!", Toast.LENGTH_SHORT).show();

        }*/

