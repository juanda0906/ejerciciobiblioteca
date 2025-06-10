/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciobiblioteca.pkg1;

/**
 *
 * @author Aprendiz
 */

public class Libro extends Publicacion {
    private String autor;
    private String referenciabibliografia;
    private String editorial;

    public Libro(String autor, String referenciabibliografia, String editorial, String titulo, int anioPublicacion) {
        super(titulo, anioPublicacion);
        this.autor = autor;
        this.referenciabibliografia = referenciabibliografia;
        this.editorial = editorial;
    }

    public void imprimir(){
        System.out.println("--- Libro ---");
        System.out.println("titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Editorial: " + editorial);
        System.out.println("Referencia Bibliográfica: " + referenciabibliografia);        System.out.println("Año de publicacion: " + anioPublicacion);
        System.out.println("");
    }
    

    
}

