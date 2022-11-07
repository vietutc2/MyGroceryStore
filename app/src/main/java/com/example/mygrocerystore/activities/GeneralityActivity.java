package com.example.mygrocerystore.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.mygrocerystore.MainActivity;
import com.example.mygrocerystore.R;
import com.example.mygrocerystore.models.HomeCategory;

public class GeneralityActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generality);
        startActivity(new Intent(GeneralityActivity.this, MainActivity.class));
        finish();
    }

    public void login(View view) {
        startActivity(new Intent(GeneralityActivity.this, LoginActivity.class));
    }

    public void registration(View view) {
        startActivity(new Intent(GeneralityActivity.this, RegistrationActivity.class));
    }
}