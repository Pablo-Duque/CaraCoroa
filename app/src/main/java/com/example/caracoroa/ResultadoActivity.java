package com.example.caracoroa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultadoActivity extends AppCompatActivity {
    ImageView resultadoImagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        resultadoImagem = findViewById(R.id.resultadoImagem);
        Bundle bnd = getIntent().getExtras();
        double resultado = bnd.getDouble("resultado");
        if(resultado != 1.0)
            resultadoImagem.setImageResource(R.drawable.moeda_cara);
        else
            resultadoImagem.setImageResource(R.drawable.moeda_coroa);
    }

    public void voltar(View view){

        finish();
    }
}
