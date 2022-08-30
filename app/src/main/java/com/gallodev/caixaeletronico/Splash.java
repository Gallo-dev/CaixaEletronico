package com.gallodev.caixaeletronico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import java.util.Random;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

            ActivityTela_senha();

            }

        }, 3000);

    }

    private void ActivityTela_senha(){

        Intent intent = new Intent(Splash.this,Tela_senha.class);
        startActivity(intent);
        finish();
    }
}
