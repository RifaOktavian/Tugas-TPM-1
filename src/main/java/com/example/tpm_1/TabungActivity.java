package com.example.tpm_1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TabungActivity extends AppCompatActivity {
    private final static double PHI = 3.14;
    private Button bHasil;
    private EditText eJari2, eTinggi;
    private TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabung);

        bHasil = findViewById(R.id.hitungTabung);
        eJari2 = findViewById(R.id.jari2Tabung);
        eTinggi = findViewById(R.id.tinggiTabung);
        tvHasil = findViewById(R.id.hasilTabung);

        bHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double jari2 = Double.parseDouble(eJari2.getText().toString());
                    double tinggi = Double.parseDouble(eTinggi.getText().toString());
                    double hasil = PHI * jari2 * jari2 * tinggi;

                    String sHasilHitung = String.valueOf(hasil);
                    tvHasil.setText(sHasilHitung);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(),"Nilai harus diisi",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
