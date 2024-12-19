package com.example.pdd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PravilnActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.praviln);
    }
    public void oprogramm(View view) {
        Button button = findViewById(R.id.button);
        Intent intent = new Intent(PravilnActivity.this, EndActivity.class);
        startActivity(intent);
        finish();
    }
}
