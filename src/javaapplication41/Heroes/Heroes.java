/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication41.Heroes;

import javaapplication41.MetodosListas;

/**
 *
 * @author user
 */
public abstract class Heroes {

    String nombre;
    Heroes siguienteHeroe;
    Object poderDeHeroe;

    public Heroes(String nombre, Heroes siguienteHeroe) {
        this.nombre = nombre;
        this.siguienteHeroe = siguienteHeroe;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Heroes getSiguienteHeroe() {
        return siguienteHeroe;
    }

    public void setSiguienteHeroe(Heroes siguienteHeroe) {
        this.siguienteHeroe = siguienteHeroe;
    }

}
