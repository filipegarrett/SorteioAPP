package com.example.sorteio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public List gerarNumero(List resultados) {

        for (int i = 0; i <= 5; i++) {
            int numero = new Random().nextInt(59) + 1;
            resultados.add(numero);
            System.out.println(resultados);

        }

        Set<Integer> set = new HashSet<>(resultados);
        resultados.clear();
        resultados.addAll(set);

        return resultados;
    }

    public List gerarNovos(List resultados) {

        int i = 6 - resultados.size();
        while(i > 0) {
            int numero = new Random().nextInt(59) + 1;
            resultados.add(numero);
            System.out.println(resultados);

            i--;
        }

        Set<Integer> set = new HashSet<>(resultados);
        resultados.clear();
        resultados.addAll(set);

        return resultados;
    }

    public void sortearNumero(View view){

        TextView textoResultado = findViewById(R.id.alterarNumero);
        List<Integer> resultados = new ArrayList<>();

        gerarNumero(resultados);

        int tamanhoLista = resultados.size();

        if (tamanhoLista < 6){
            gerarNovos(resultados);
          }


        System.out.println(resultados);

        textoResultado.setText("O número selecionado é: " + resultados);

    }

}
