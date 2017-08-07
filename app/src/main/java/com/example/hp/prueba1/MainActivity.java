package com.example.hp.prueba1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.hp.prueba1.R.id.ingBton;

public class MainActivity extends AppCompatActivity {
    private EditText nom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nom= (EditText) findViewById(R.id.nomText);
        Button fab = (Button) findViewById(ingBton);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                Bundle b = new Bundle();
                b.putString("NOMBRE", nom.getText().toString());

                //Añadimos la información al intent
                intent.putExtras(b);
                startActivity(intent);
            }
        });

    }
}
