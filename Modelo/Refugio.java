/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Kevin Santamaria
 */

import java.util.ArrayList;
import java.util.List;

public class Refugio {
    private List<Mascota> mascotas = new ArrayList<>();

    public void agregarMascota(Mascota mascota) {
        mascotas.add(mascota);
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }
}

