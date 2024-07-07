package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void gerarNovaFrase(View view) {

        String[] frases = {"Chaves de casa",
                "Documentos",
                "Cartão de passagem",
                "Cartão de Crédito/Débito",
                "Dinheiro de reserva",
                "Bateria Reserva",
                "Carregador"
        };

        int numero = new Random().nextInt(7);
        TextView texto = findViewById(R.id.textResultado);
        texto.setText ( frases[numero] );
    }}