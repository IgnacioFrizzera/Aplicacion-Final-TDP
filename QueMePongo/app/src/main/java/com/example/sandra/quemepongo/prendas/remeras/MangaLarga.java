package com.example.sandra.quemepongo.prendas.remeras;

import com.example.sandra.quemepongo.visitors.Visitor;


/**
 * Clase destinada a representar una remera manga larga.
 */
public class MangaLarga extends Remera{

    public MangaLarga(){
        this.nombre = "Remera manga larga";
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public void setPuntaje(double max, int humedad, boolean es_mujer, boolean es_formal) {
        if(!es_formal){
            if(max < 20) {
                this.puntaje = opcional;
            }
            if(max < 15) {
                this.puntaje = obligatorio;
            }
        }
    }
}
