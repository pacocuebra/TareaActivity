package com.pacuebra.contacto2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    Button boton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView txtNomb = (TextView)findViewById(R.id.tv1);
        TextView txtEm = (TextView)findViewById(R.id.tv2);
        TextView txtDesc = (TextView)findViewById(R.id.tv3);
        TextView txtMes = (TextView)findViewById(R.id.mes);

        Bundle bundle = this.getIntent().getExtras();

        txtNomb.setText("Nombre: " + bundle.getString("NOMBRE"));
        txtEm.setText("Email: " + bundle.getString("EMAIL"));
        txtDesc.setText("Descripción: " + bundle.getString("DESCRIPCION"));
        txtMes.setText("Fecha de Nacimiento: "+bundle.getInt("DAY")+ " / " + bundle.getInt("MONTH")+" / "+ bundle.getInt("YEAR"));


        boton2 = (Button)findViewById(R.id.btn2);

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });



    }
}
