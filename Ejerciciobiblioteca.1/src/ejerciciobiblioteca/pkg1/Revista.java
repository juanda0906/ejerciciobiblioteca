/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciobiblioteca.pkg1;

/**
 *
 * @author Aprendiz
 */
public class Revista extends Publicacion{
    private String periodicidad;
    private String editorial;
    private String pais;

    public Revista(String periodicidad, String editorial, String pais, String titulo, int anioPublicacion) {
        super(titulo, anioPublicacion);
        this.periodicidad = periodicidad;
        this.editorial = editorial;
        this.pais = pais;
    }
    public void imprimir() {
        System.out.println("--- Revista ---");
        System.out.println("Nombre: " + titulo);
        System.out.println("Año de publicacion: " + anioPublicacion);
        System.out.println("Periodicidad: " + periodicidad);
        System.out.println("Editorial: " + editorial);
        System.out.println("País: " + pais);
        System.out.println();
    }
}

