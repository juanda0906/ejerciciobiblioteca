/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciobiblioteca;

/**
 *
 * @author USER
 */
public class EjercicioBiblioteca {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Nacional");
        
        // Crear un libro agregando todos sus atributos
        Libro libro1 = new Libro("Gabriel Garcia Marquez", "858.67/M566","Sudamericana", "Cien años de soledad", 
                                  1967);
        
        // Agregar libro a la biblioteca
        biblioteca.agregarLibro(libro1); 
        
        // Crear una revista con sus atributos específicos
        Revista revista1 = new Revista("Mensual", "National Geographic Partners", "Estados Unidos", "National Geographic",
                 2023);
        
        // Agregar revista a la biblioteca
        biblioteca.agregarRevista(revista1);  
        
         biblioteca.mostrarLibros();
        biblioteca.mostrarRevistas();
    }
}
    

