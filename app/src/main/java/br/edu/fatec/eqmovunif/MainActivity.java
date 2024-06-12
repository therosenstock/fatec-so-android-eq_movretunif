package br.edu.fatec.eqmovunif;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etSInicial;
    private EditText etVelocidade;
    private EditText etTempo;
    private Button btnCalcular;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etSInicial = findViewById(R.id.etSInicial);
        etTempo = findViewById(R.id.edTempo);
        etVelocidade = findViewById(R.id.etVelocidade);
        btnCalcular = findViewById(R.id.btnCalcular);
        txtResultado = findViewById(R.id.txtResultado);

        btnCalcular.setOnClickListener(op -> calcular());
    }

    private void calcular () {
        float sinicial = Float.parseFloat(etSInicial.getText().toString());
        float tempo = Float.parseFloat(etTempo.getText().toString());
        float velocidade = Float.parseFloat(etVelocidade.getText().toString());

        float calc = sinicial + velocidade * tempo;
        String resposta = getString(R.string.s_final) + " " + calc + " m";
        txtResultado.setText(resposta);

    }
}