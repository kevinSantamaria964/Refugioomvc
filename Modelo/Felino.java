/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Kevin Santamaria
 */

public class Felino extends Mascota {
    private boolean libreToxoplasmosis;

    public Felino(String nombre, String raza, String color, int edad, boolean libreToxoplasmosis) {
        super(nombre, raza, color, edad);
        this.libreToxoplasmosis = libreToxoplasmosis;
    }

    public boolean isLibreToxoplasmosis() {
        return libreToxoplasmosis;
    }

    public void setLibreToxoplasmosis(boolean libreToxoplasmosis) {
        this.libreToxoplasmosis = libreToxoplasmosis;
    }
}

