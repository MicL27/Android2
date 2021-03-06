package com.curso.android2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

public class PantallaConfirmacion extends AppCompatActivity {

    String nombre, fecha, tel, mail, descripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_confirmacion);

        Bundle parametros = getIntent().getExtras();
        nombre = parametros.getString("Nombre");
        fecha = parametros.getString("FechaNacimiento");
        tel = (String) parametros.get("Telefono");
        mail = parametros.getString("Mail");
        descripcion = parametros.getString("Descripcion");

        TextView tvNombre = (TextView) findViewById(R.id.tvNombre);
        TextView tvFecha = (TextView) findViewById(R.id.tvFecha);
        TextView tvTel = (TextView) findViewById(R.id.tvTel);
        TextView tvMail = (TextView) findViewById(R.id.tvMail);
        TextView tvDescripcion = (TextView) findViewById(R.id.tvDescricpion);

        tvNombre.setText(nombre);
        tvFecha.setText(fecha);
        tvTel.setText(tel);
        tvMail.setText(mail);
        tvDescripcion.setText(descripcion);

        Button buttonEdit = (Button) findViewById(R.id.buttonEdit);

        buttonEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent intent = new Intent(PantallaConfirmacion.this, MainActivity.class);
                intent.putExtra("Nombre", nombre);
                intent.putExtra("Telefono", tel);
                intent.putExtra("Mail", mail);
                intent.putExtra("Descripcion", descripcion);
                startActivity(intent);*/
                finish();
            }
        });
    }


}