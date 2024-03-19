package com.example.aula_19_03_24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button botaoTela1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoTela1 = findViewById(R.id.btnTela1);


        botaoTela1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent navigate = new Intent(MainActivity.this,tela2.class);
                startActivity(navigate);

            }
        });
    }
}