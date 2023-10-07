/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S08_24;

public class Main_S08_24 {
    
    public static void main(String[] args) {
        Calculadora_24 miCalculadora = new Calculadora_24();

        miCalculadora.sumar(5.5, 2.5);
        System.out.println("Suma: " + miCalculadora.obtenerResultado());

        miCalculadora.restar(7.0, 3.2);
        System.out.println("Resta: " + miCalculadora.obtenerResultado());

        Estudiante_24 estudiante1 = new Estudiante_24();

        estudiante1.setNombre("Juan");
        estudiante1.setEdad(20);

        System.out.println("Nombre del estudiante: " + estudiante1.getNombre());
        System.out.println("Edad del estudiante: " + estudiante1.getEdad());
    }
}
