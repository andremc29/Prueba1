package com.example.hp.prueba1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView nomb;
    private EditText opcion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nomb = (TextView) findViewById(R.id.textNom);
        Bundle bundle = this.getIntent().getExtras();
        nomb.setText(bundle.getString("NOMBRE"));
    }



}


