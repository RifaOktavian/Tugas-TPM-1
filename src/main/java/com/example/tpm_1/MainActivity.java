package com.example.tpm_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button intentTabung,intentKubus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intentTabung = findViewById(R.id.bTabung);
        intentTabung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TabungActivity.class);
                startActivity(intent);
            }
        });
        intentKubus =  findViewById(R.id.bKubus);
        intentKubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, KubusActivity.class);
                startActivity(intent);
            }
        });
    }
}
