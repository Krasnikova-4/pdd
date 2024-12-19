package com.example.pdd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class GlavnActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.glavn);
    }
    public void velikClicked(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(),
                "Неправильно !",
                Toast.LENGTH_LONG);
        myToast.show();
    }
    public void peshehod(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(),
                "Неправильно !",
                Toast.LENGTH_LONG);
        myToast.show();
    }
    public void nikomu(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(),
                "Неправильно !",
                Toast.LENGTH_LONG);
        myToast.show();
    }
    public void pravilno(View view) {
        Button button = findViewById(R.id.button);
        Intent intent = new Intent(GlavnActivity.this, PravilnActivity.class);
        startActivity(intent);
        finish();
    }
}
