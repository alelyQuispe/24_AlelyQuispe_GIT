/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S08v2_24;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main_S08_24 {
    /*public static void main(String[] args) {
        Auto_24 auto = new Auto_24();

        // Obtener la marca del auto
        auto.marca = JOptionPane.showInputDialog("Ingrese la marca del auto:");

        // Obtener el color del auto
        auto.color = JOptionPane.showInputDialog("Ingrese el color del auto:");

        // Obtener los kilómetros como cadena y convertirlo a entero
        String kmStr = JOptionPane.showInputDialog("Ingrese los kilómetros del auto:"); // solo acepta numeros no numeros+km
        auto.km = Integer.parseInt(kmStr);
    }
}*/

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el nombre de la persona: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa la edad de la persona: ");
        int edad = scanner.nextInt();

        Persona_24 persona = new Persona_24(nombre, edad);

        System.out.println("Hola, " + persona.nombre + ". ¿Qué deseas hacer?");
        System.out.println("1. Hablar");
        System.out.println("2. Levantar la mano");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                persona.hablar();
                break;
            case 2:
                persona.levantarMano();
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}