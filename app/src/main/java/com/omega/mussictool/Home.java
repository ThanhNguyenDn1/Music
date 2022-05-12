package com.omega.mussictool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void checl(View view) {
        startActivity(new Intent(this, Detail.class));
    }

    public void shop(View view) {
        startActivity(new Intent(this, ShopActivity.class));
    }
}