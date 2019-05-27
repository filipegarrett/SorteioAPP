package com.example.sorteio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearNumero(View view){

        TextView textoResultado = findViewById(R.id.alterarNumero);

        List<Integer> resultados = new ArrayList<>();

        for (int i = 0; i <= 5; i++) {
            int numero = new Random().nextInt(59) + 1;
            resultados.add(numero);
            int tamanhoLista = resultados.size();

            for (int j = 0; j <= tamanhoLista; j++) {
                if (resultados.contains(numero)) {
                    resultados.remove(numero);
                    i--;

                }

            }

        }

        resultados.toString();
        System.out.println(resultados);

        textoResultado.setText("O número selecionado é: " + resultados);

    }

}
