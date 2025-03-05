/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Biblioteca
 */
public class Area {
     private int ancho;
     private int alto;

    // Constructor
    public Area(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    // Método para calcular el área
    public int calcularArea() {
        return ancho * alto;
    }
    
}
