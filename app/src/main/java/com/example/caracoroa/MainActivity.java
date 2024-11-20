package com.example.caracoroa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jogar(View view){
        double aleatorio = (Math.floor(Math. random() * 2));

        Intent resultado = new Intent(getApplicationContext(), ResultadoActivity.class);

        resultado.putExtra("resultado", aleatorio);
        startActivity(resultado);
    }
}