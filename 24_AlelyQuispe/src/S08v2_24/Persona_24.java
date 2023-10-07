/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S08v2_24;

import java.util.Scanner;

public class Persona_24 {
    //atributos
    String nombre;
    int edad;
    
    public Persona_24(String nombre, int edad) {  //define el constructor de la clase Persona
        this.nombre = nombre; //se está asignando el valor del parámetro nombre, "this" se define al atributo nombre
        this.edad = edad;
    }
    
    //metodos
    public void hablar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(nombre + " dice: ");
        String mensaje = scanner.nextLine();
        System.out.println(nombre + " dice: " + mensaje);
    }
    
    public void levantarMano() {
        System.out.println(nombre + " levanta la mano");
    }
}
