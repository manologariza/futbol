package com.example.lolo.otraactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList listaEquipos;
    Equipos e1;
    Equipos e2;
    Equipos e3;
    Equipos e4;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("EQUIPOS");

        listaEquipos= new ArrayList();

        e1=new Equipos("REAL MADRID","EL MEJOR CLUB DE LA HISTORIA","JUGADOR ESTRELLA: CR7","EL MEJOR JUGADOR DE LA HISTORIA");
        e2=new Equipos("ATLETI","LAS MISMAS CHAMPIONS QUE EL TOMELLOSO","JUGADOR ESTRELLA: GRIEZMANN","EL UNICO QUE SE SALVA");
        e3=new Equipos("SEVILLA","POR PONER ALGUNO","JUGADOR ESTRELLA: BEN YEDDER","ES LO QUE HAY...");
        e4=new Equipos("FARSA","COMPRAN ARBITROS","JUGADOR ESTRELLA: MESSI","SIEMPRE POR DEBAJO DE CR7");

        listaEquipos.add(e1);
        listaEquipos.add(e2);
        listaEquipos.add(e3);
        listaEquipos.add(e4);
    }

    /*public void leerInfo(View v){ //metodo para que cuando pulse el boton mas info redireccione al activity Informacion
        Intent i=new Intent(this,Informacion.class);
        this.startActivity(i);
    }*/

    //INTENTS PARA LANZAR ACTIVITY
    public void lanzarMadrid(View view){
        Intent iRm=new Intent(this,Informacion.class);
        iRm.putExtra("equipo","rm"); //info que le mandas a la otra activity
        this.startActivity(iRm);

    }

    public void lanzarAtleti(View view){
        Intent iAt=new Intent(this,Informacion.class);
        iAt.putExtra("equipo","at");
        this.startActivity(iAt);

    }

    public void lanzarSevilla(View view){
        Intent iSe=new Intent(this,Informacion.class);
        iSe.putExtra("equipo","se");
        this.startActivity(iSe);

    }

    public void lanzarBarca(View view){
        Intent iBa=new Intent(this,Informacion.class);
        iBa.putExtra("equipo","ba");
        this.startActivity(iBa);

    }
}
