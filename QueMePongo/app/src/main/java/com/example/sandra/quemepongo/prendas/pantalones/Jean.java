package com.example.sandra.quemepongo.prendas.pantalones;

import com.example.sandra.quemepongo.visitors.Visitor;


/**
 * Clase destinada a representar el pantalón tipo jean.
 */
public class Jean extends Pantalon {

    public Jean(){
        this.nombre = "Jean";
    }

    public void accept(Visitor v){
        v.visit(this);
    }

    @Override
    public void setPuntaje(double max, int humedad, boolean es_mujer, boolean es_formal) {
        if (!es_formal) {
            if (max <= 25) {
                this.puntaje = obligatorio;
            }
            else{
                this.puntaje = opcional;
            }
        }
    }
}
