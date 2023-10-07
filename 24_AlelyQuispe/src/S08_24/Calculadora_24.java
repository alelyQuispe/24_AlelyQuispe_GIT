/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S08_24;

public class Calculadora_24 {
    // Atributos
    private double resultado;

    // Métodos
    public void sumar(double a, double b) {
        resultado = a + b;
    }

    public void restar(double a, double b) {
        resultado = a - b;
    }

    public double obtenerResultado() {
        return resultado;
    }
}
