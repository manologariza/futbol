package com.example.lolo.otraactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Informacion extends AppCompatActivity {

    private EditText lblEquipo;
    private ImageView imagenEscudo;
    private TextView txtEquipo;
    private EditText lblJugador;
    private TextView txtJugador;
    private ImageView imagenJugador;
    private Button btnPulsado;
    Equipo e1;
    Equipo e2;
    Equipo e3;
    Equipo e4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);
        setTitle("INFORMACION");

        lblEquipo = (EditText) findViewById(R.id.lblEquipo);
        imagenEscudo = (ImageView) findViewById(R.id.imagenEscudo);
        txtEquipo = (TextView) findViewById(R.id.txtEquipo);
        lblJugador = (EditText) findViewById(R.id.lblJugador);
        txtJugador = (TextView) findViewById(R.id.txtJugador);
        imagenJugador = (ImageView) findViewById(R.id.imagenJugador);

        e1=new Equipo("REAL MADRID","EL MEJOR CLUB DE LA HISTORIA","JUGADOR ESTRELLA: CR7","EL MEJOR JUGADOR DE LA HISTORIA");
        e2=new Equipo("ATLETI","LAS MISMAS CHAMPIONS QUE EL TOMELLOSO","JUGADOR ESTRELLA: GRIEZMANN","EL UNICO QUE SE SALVA");
        e3=new Equipo("SEVILLA","POR PONER ALGUNO","JUGADOR ESTRELLA: BEN YEDDER","ES LO QUE HAY...");
        e4=new Equipo("FARSA","COMPRAN ARBITROS","JUGADOR ESTRELLA: MESSI","SIEMPRE POR DEBAJO DE CR7");

        String equipo;

        Bundle b=getIntent().getExtras();
        equipo=b.getString("equipoSeleccionado");

        switch (equipo){
            case "REAL MADRID":
                lblEquipo.setText(e1.getNombreEquipo());
                txtEquipo.setText(e1.getDescripcionEquipo());
                lblJugador.setText(e1.getNombreJugador());
                txtJugador.setText(e1.getDescripcionJugador());
                imagenEscudo.setImageResource(R.drawable.realmadrid);
                imagenJugador.setImageResource(R.drawable.cris);
                break;

            case "ATLETI":
                lblEquipo.setText(e2.getNombreEquipo());
                txtEquipo.setText(e2.getDescripcionEquipo());
                lblJugador.setText(e2.getNombreJugador());
                txtJugador.setText(e2.getDescripcionJugador());
                imagenEscudo.setImageResource(R.drawable.atleti);
                imagenJugador.setImageResource(R.drawable.griezmann);
                break;

            case "SEVILLA":
                lblEquipo.setText(e3.getNombreEquipo());
                txtEquipo.setText(e3.getDescripcionEquipo());
                lblJugador.setText(e3.getNombreJugador());
                txtJugador.setText(e3.getDescripcionJugador());
                imagenEscudo.setImageResource(R.drawable.sevilla);
                imagenJugador.setImageResource(R.drawable.ben);
                break;

            case "FARSA":
                lblEquipo.setText(e4.getNombreEquipo());
                txtEquipo.setText(e4.getDescripcionEquipo());
                lblJugador.setText(e4.getNombreJugador());
                txtJugador.setText(e4.getDescripcionJugador());
                imagenEscudo.setImageResource(R.drawable.barca);
                imagenJugador.setImageResource(R.drawable.messi);
                break;

        }

    }







    }





