package com.example.zetro.akb9_10116381_farhanr;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }
    public void masuk1 (View view){
        Intent intent = new Intent(Activity2.this, Activity3.class);
        startActivity(intent);
    }
}
