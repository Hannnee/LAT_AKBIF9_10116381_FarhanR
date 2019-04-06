package com.example.zetro.akb9_10116381_farhanr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);


        Intent intent = getIntent();
        String message = intent.getStringExtra(Activity3.EXTRA_MESSAGE);
        TextView textView = (TextView)findViewById(R.id.txt2);
        textView.setText(message);
    }
    public void oke(View view){
        finish();
        moveTaskToBack(true);
    }
}
