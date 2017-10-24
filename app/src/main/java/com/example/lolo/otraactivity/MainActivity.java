package com.example.lolo.otraactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ArrayList listaEquipos;
    Equipo e1;
    Equipo e2;
    Equipo e3;
    Equipo e4;

    Button btnRealMadrid;
    Button btnBarcelona;
    Button btnAtleti;
    Button btnSevilla;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("EQUIPOS");

        btnRealMadrid=(Button)findViewById(R.id.btnRealMadrid);
        btnBarcelona=(Button)findViewById(R.id.btnBarcelona);
        btnAtleti=(Button)findViewById(R.id.btnAtleti);
        btnSevilla=(Button)findViewById(R.id.btnSevilla);

        e1=new Equipo("REAL MADRID","EL MEJOR CLUB DE LA HISTORIA","JUGADOR ESTRELLA: CR7","EL MEJOR JUGADOR DE LA HISTORIA");
        e2=new Equipo("ATLETI","LAS MISMAS CHAMPIONS QUE EL TOMELLOSO","JUGADOR ESTRELLA: GRIEZMANN","EL UNICO QUE SE SALVA");
        e3=new Equipo("SEVILLA","POR PONER ALGUNO","JUGADOR ESTRELLA: BEN YEDDER","ES LO QUE HAY...");
        e4=new Equipo("FARSA","COMPRAN ARBITROS","JUGADOR ESTRELLA: MESSI","SIEMPRE POR DEBAJO DE CR7");

        btnRealMadrid.setOnClickListener(this);
        btnBarcelona.setOnClickListener(this);
        btnAtleti.setOnClickListener(this);
        btnSevilla.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent=new Intent(this, Informacion.class);

        switch (view.getId()) {
            case R.id.btnRealMadrid:
                intent.putExtra("equipoSeleccionado", e1.getNombreEquipo());
                break;
            case R.id.btnAtleti:
                intent.putExtra("equipoSeleccionado", e2.getNombreEquipo());
                break;
            case R.id.btnSevilla:
                intent.putExtra("equipoSeleccionado", e3.getNombreEquipo());
                break;
            case R.id.btnBarcelona:
                intent.putExtra("equipoSeleccionado", e4.getNombreEquipo());
                break;

        }
        this.startActivity(intent);
    }
}
