package com.example.sandra.quemepongo.prendas.pantalones.cortos;

import com.example.sandra.quemepongo.prendas.pantalones.Pantalon;
import com.example.sandra.quemepongo.visitors.Visitor;


/**
 * Clase destinada a representar el pantalón corto tipo short.
 */
public class Shorts extends Pantalon {

    public Shorts(){
        this.nombre = "Shorts";
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public void setPuntaje(double max, int humedad, boolean es_mujer, boolean es_formal) {
        if(!es_formal){
            if (max > 20){
                this.puntaje = opcional;
            }
            if (max >= 25) {
                this.puntaje = obligatorio;
            }
        }
    }
}
