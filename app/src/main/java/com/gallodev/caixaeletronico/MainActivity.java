package com.gallodev.caixaeletronico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView edit_saldo;
    private EditText edit_valor;
    private Button bt_sacar;

    double saldoEmConta = 3000.00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciarComponentes();// inicia o metodo tratado

        getSupportActionBar().hide();

        edit_saldo.setText("Saldo: " + "R$ " + saldoEmConta);

        //evento de click no botão
        bt_sacar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double dinheiro;
                dinheiro = Double.parseDouble(edit_valor.getText().toString());

                        //estrutura de condição (if) e (else)
                if (dinheiro < 20){
                    Toast.makeText(MainActivity.this, "Saque minimo 20 Reais", Toast.LENGTH_SHORT).show();
                }else if (dinheiro == 20){
                    saldoEmConta -= dinheiro;
                    edit_saldo.setText("Saldo: " + "R$ " + saldoEmConta);
                    Toast.makeText(MainActivity.this, "20 Reais sacados", Toast.LENGTH_SHORT).show();
                }else if (dinheiro == 50){
                    saldoEmConta -= dinheiro;
                    edit_saldo.setText("Saldo: " + "R$ " + saldoEmConta);
                    Toast.makeText(MainActivity.this, "50 Reais sacados", Toast.LENGTH_SHORT).show();
                }else if (dinheiro == 100){
                    saldoEmConta -= dinheiro;
                    edit_saldo.setText("Saldo: " + "R$ " + saldoEmConta);
                    Toast.makeText(MainActivity.this, "100 Reais sacados", Toast.LENGTH_SHORT).show();
                }else if (dinheiro > 1000){
                    Toast.makeText(MainActivity.this, " Saque máximo 1000 R$ ",Toast.LENGTH_SHORT).show();
                } else {
                    saldoEmConta -= dinheiro;
                    edit_saldo.setText("Saldo: " + "R$ " + saldoEmConta);
                    Toast.makeText(MainActivity.this, +dinheiro + " Reais sacados", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    private void iniciarComponentes(){

      edit_saldo = findViewById(R.id.edit_saldo);
      edit_valor = findViewById(R.id.edit_valor);
      bt_sacar = findViewById(R.id.bt_sacar);


    }
}