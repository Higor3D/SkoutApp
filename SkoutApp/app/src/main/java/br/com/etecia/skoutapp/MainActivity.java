package br.com.etecia.skoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Declarando variaveis globais
    EditText edtUsuario, edtSenha;
    Button btnEntrar, btnSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //apresentar componentes do xml para o java
        edtSenha = findViewById(R.id.edtSenha);
        edtUsuario = findViewById(R.id.edtUsuario);
        btnEntrar = findViewById(R.id.btnEntrar);
        btnSair = findViewById(R.id.btnSair);

        //criando a ação do botão sair
        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario, senha;
                usuario = edtUsuario.getText().toString();
                senha = edtSenha.getText().toString();


                if (usuario.equals("etecia") && senha.equals("etecia")) {

                    startActivity(new Intent(getApplicationContext(), Menu_principal.class));
                    finish();

                } else {
                    Toast.makeText(getApplicationContext(), "não", Toast.LENGTH_LONG).show();
                    edtUsuario.setText("");
                    edtSenha.setText("");
                    edtUsuario.requestFocus();
                }

            }
        });
    }
}