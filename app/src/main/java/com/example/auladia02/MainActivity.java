package com.example.auladia02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonIrCadastro;
    Button buttonJogo;
    Button buttoncarregar;
    Button buttontutorial;
    Button buttonconf;
    Button buttonsair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonIrCadastro = findViewById(R.id.buttonHistoria);

    }
}