/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c.mascota;

import java.util.ArrayList;

class Refugio {
   ArrayList<Mascota> mascotas = new ArrayList<>();

   void agregarMascota(Mascota mascota) { mascotas.add(mascota); }
   
   Mascota retirarMascota(int index) { return mascotas.remove(index); }

   double promedioEdad() {
       int totalEdad = 0;
       for (Mascota mascota : mascotas) totalEdad += mascota.getEdad();
       return (double) totalEdad / mascotas.size();
   }

   int totalCaninos() {
       int count = 0;
       for (Mascota mascota : mascotas) if (mascota instanceof Canino) count++;
       return count;
   }

   int totalFelinos() {
       int count = 0;
       for (Mascota mascota : mascotas) if (mascota instanceof Felino) count++;
       return count;
   }
}

