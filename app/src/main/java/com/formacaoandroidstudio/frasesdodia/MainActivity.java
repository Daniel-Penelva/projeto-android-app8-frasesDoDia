package com.formacaoandroidstudio.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* Ação do botão para gerar a nova frase */
    public void gerarNovaFrase(View view){

        /* Array de frases */
        String[] frases = {
                "Sonhos são caminhos construídos pelo coração.",
                "Impossível é uma palavra que serve só de enfeite no dicionário.",
                "Permita que o seu corpo descanse.",
                "Mudar pode dar medo, mas é uma aventura que pode te levar muito longe.",
                "Tem uma força dentro de você que é capaz de sempre te surpreender!",
                "Tenha coragem para se tornar aquilo que sonha.",
                "Minha missão na vida não é apenas sobreviver, mas prosperar."};


        /* Para gerar um número de indice do array aleatoriamente */
        int aleatorio = new Random().nextInt(7);

        /* Captura o id da viewText */
        TextView texto = findViewById(R.id.textResultado);

        /* Gerar um dos valores aleatórios da string de array */
        texto.setText(frases[aleatorio]);
    }


}
