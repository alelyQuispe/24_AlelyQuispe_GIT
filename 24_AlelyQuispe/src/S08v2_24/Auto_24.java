/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S08v2_24;

import javax.swing.JOptionPane;

public class Auto_24{

    //Atributos    
    String marca;
    String color;
    int km;
  
    // Método para crearAuto esto permite mantener los atributos y se puede llamar desde la clase Auto
    public static Auto_24 crearAuto() {
        Auto_24 auto = new Auto_24();
        return auto;
    }
    
    // Método para acelerar el auto
    public void acelerar() {
        if (km >= 20) {
            JOptionPane.showMessageDialog(null, "El auto de color " + color + " acelera.");
        } else {
            JOptionPane.showMessageDialog(null, "El auto de color " + color + " no aceleró.");
        }
    }
}
