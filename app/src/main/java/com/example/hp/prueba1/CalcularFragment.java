package com.example.hp.prueba1;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.text.InputType;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class CalcularFragment extends Fragment {


    public CalcularFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calcular, container, false);
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textView = (TextView) view.findViewById(R.id.nomText);
        final CheckBox sumacb= (CheckBox) view.findViewById(R.id.sumarCb);
        final CheckBox restacb= (CheckBox) view.findViewById(R.id.restarCb);
        final CheckBox multicb= (CheckBox) view.findViewById(R.id.multiplicarCb);
        final CheckBox divicb= (CheckBox) view.findViewById(R.id.dividirCb);
        Button button = (Button) view.findViewById(R.id.calculaBton);
        final EditText numero1 = (EditText) view.findViewById(R.id.num1Ed);
        final EditText numero2 = (EditText) view.findViewById(R.id.num2Ed);
        numero2.setInputType(InputType.TYPE_NULL);
        Log.d("n1", String.valueOf(numero1)+"--"+String.valueOf(numero2));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Funciona"+"-"+numero1+"--"+numero2, Toast.LENGTH_SHORT).show();
                Calcular(sumacb,restacb,multicb,divicb,numero1,numero2);
            }
        });
    }
    public void Calcular(CheckBox s, CheckBox r,CheckBox m,CheckBox d,EditText numero1, EditText numero2){
        int total=0;
        int intNumero1 = Integer.parseInt(numero1.getText().toString());
        int intNumero2 = Integer.parseInt(numero2.getText().toString());
        if(s.isChecked()){
            total = intNumero1 + intNumero2;
            final AlertDialog.Builder alertdialog = new AlertDialog.Builder(getActivity());
            alertdialog.setTitle("Sumar");
            alertdialog.setMessage("El resultado es "+total);
            alertdialog.show();
        }

        if(r.isChecked()){
            total = intNumero1 - intNumero2;
            final AlertDialog.Builder alertdialog = new AlertDialog.Builder(getActivity());
            alertdialog.setTitle("Restar");
            alertdialog.setMessage("El resultado es "+total);
            alertdialog.show();

        }

        if(m.isChecked()){
            total = intNumero1 * intNumero2;
            final AlertDialog.Builder alertdialog = new AlertDialog.Builder(getActivity());
            alertdialog.setTitle("Multiplicarar");
            alertdialog.setMessage("El resultado es "+total);
            alertdialog.show();

        }

        if(d.isChecked()){
            total = intNumero1 / intNumero2;
            final AlertDialog.Builder alertdialog = new AlertDialog.Builder(getActivity());
            alertdialog.setTitle("Dividir");
            alertdialog.setMessage("El resultado es "+total);
            alertdialog.show();

        }
//        Toast.makeText(getContext(), "El resultado es: " + total,Toast.LENGTH_LONG).show();
    }

}
