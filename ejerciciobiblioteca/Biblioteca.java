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
public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> coleccionLibros;
    private ArrayList<Revista> coleccionRevistas;
    private ArrayList<Revista> revistas = new ArrayList<>();

    public ArrayList<Revista> getRevistas() {
        return revistas;
    }

    public void setRevistas(ArrayList<Revista> revistas) {
        this.revistas = revistas;
    }
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        coleccionLibros = new ArrayList<>();
        coleccionRevistas = new ArrayList<>();
    
    }
    public void agregarLibro(Libro libro) {
        coleccionLibros.add(libro);
        
    }
    public void agregarRevista(Revista revista) {
        coleccionRevistas.add(revista);
    }
    public void mostrarLibros() {
        System.out.println("Libros en la biblioteca " + nombre + ":");
        System.out.println("======================================");
        if (coleccionLibros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            for (Libro libro : coleccionLibros) {
                libro.imprimir();
            }
        }
    }
    public void mostrarRevistas() {
        System.out.println("Revistas en la biblioteca " + nombre + ":");
        System.out.println("=========================================");
        if (coleccionRevistas.isEmpty()) {
            System.out.println("No hay revistas en la biblioteca.");
        } else {
            for (Revista revista : coleccionRevistas) {
                revista.imprimir();
            }
        }
    }
}
