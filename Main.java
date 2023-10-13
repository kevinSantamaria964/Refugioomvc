/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c.mascota;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Refugio refugio = new Refugio();

        while (true) {
            String menu = "Bienvenido al sistema de refugio de mascotas. Por favor, elige una opción:\n\n" +
                          "1. Agregar mascota\n" +
                          "2. Consultar mascotas\n" +
                          "3. Retirar mascota\n" +
                          "4. Mostrar estadísticas\n" +
                          "5. Salir";
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            if (opcion == 1) {
                String tipoMascota = JOptionPane.showInputDialog("Vas a agregar una nueva mascota. ¿Qué tipo de mascota es? (1: Canino, 2: Felino): ");
                int tipo = Integer.parseInt(tipoMascota);
                String nombre = JOptionPane.showInputDialog("Ingresa el nombre de la mascota: ");
                String raza = JOptionPane.showInputDialog("Ingresa la raza de la mascota: ");
                String color = JOptionPane.showInputDialog("Ingresa el color de la mascota: ");
                String edadMascota = JOptionPane.showInputDialog("Ingresa la edad de la mascota: ");
                int edad = Integer.parseInt(edadMascota);

                if (tipo == 1) {
                    String nivelEntrenamientoCanino = JOptionPane.showInputDialog("Has seleccionado un canino. Ingresa su nivel de entrenamiento: ");
                    int nivelEntrenamiento = Integer.parseInt(nivelEntrenamientoCanino);
                    refugio.agregarMascota(new Canino(nombre, raza, color, edad, nivelEntrenamiento));
                    JOptionPane.showMessageDialog(null, "Se ha agregado un nuevo canino al refugio.");
                } else if (tipo == 2) {
                    String libreToxoplasmosisFelino = JOptionPane.showInputDialog("Has seleccionado un felino. ¿Está libre de toxoplasmosis? (true/false): ");
                    boolean libreToxoplasmosis = Boolean.parseBoolean(libreToxoplasmosisFelino);
                    refugio.agregarMascota(new Felino(nombre, raza, color, edad, libreToxoplasmosis));
                    JOptionPane.showMessageDialog(null, "Se ha agregado un nuevo felino al refugio.");
                }
            } else if (opcion == 2) {
                StringBuilder mascotas = new StringBuilder();
                for (int i = 0; i < refugio.mascotas.size(); i++) {
                    Mascota mascota = refugio.mascotas.get(i);
                    mascotas.append((i + 1) + ". " + mascota.getNombre() + " (" + mascota.getRaza() + ", " + mascota.getColor() + ", " + mascota.getEdad() + " años)\n");
                }
                JOptionPane.showMessageDialog(null, "Aquí están las mascotas en el refugio:\n\n" + mascotas.toString());
            } else if (opcion == 3) {
                String indexMascota = JOptionPane.showInputDialog("Ingresa el número de la mascota que deseas retirar: ");
                int index = Integer.parseInt(indexMascota) - 1;
                Mascota retirada = refugio.retirarMascota(index);
                JOptionPane.showMessageDialog(null, "Has retirado a la mascota: " + retirada.getNombre());
            } else if (opcion == 4) {
                String estadisticas = "Edad promedio de las mascotas: " + refugio.promedioEdad() +
                                      "\nTotal de caninos en el refugio: " + refugio.totalCaninos() +
                                      "\nTotal de felinos en el refugio: " + refugio.totalFelinos();
                JOptionPane.showMessageDialog(null, "Aquí están las estadísticas del refugio:\n\n" + estadisticas);
            } else if (opcion == 5) {
                break;
            }
        }
    }
}

