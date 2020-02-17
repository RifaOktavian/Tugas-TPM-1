package com.example.tpm_1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class KubusActivity extends AppCompatActivity {
    private Button bHasil;
    private EditText eSisi;
    private TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus);

        eSisi = findViewById(R.id.sisiKubus);
        bHasil = findViewById(R.id.hitungKubus);
        tvHasil = findViewById(R.id.hasilKubus);

        bHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double sisi = Double.parseDouble(eSisi.getText().toString());
                    double hasil = sisi * sisi * sisi;
                    String sHasil = String.valueOf(hasil);

                    tvHasil.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Nilai harus diisi", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    }
