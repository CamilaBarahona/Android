package com.example.sensores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void openProximity(View view){
        startActivity(new Intent( MainActivity.this, Proximity.class));
    }

    public void openGyroscope(View view) {
        startActivity(new Intent(MainActivity.this, Gyroscope.class));
    }
    public void openRotationVector(View view) {
        startActivity(new Intent(MainActivity.this, RotationVector.class));
    }
}