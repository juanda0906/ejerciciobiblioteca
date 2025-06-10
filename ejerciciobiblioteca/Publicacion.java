/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciobiblioteca;
import java.util.ArrayList;
/**
 *
 * @author USER
 */
public class Publicacion {
    String titulo;
    int anioPublicacion;

    public Publicacion(String titulo, int anioPublicacion) {
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public void imprimir(){
        
    }
}
