package com.example.timecamera;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void skip(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,IndexActivity.class);
        startActivity(intent);
    }
}
