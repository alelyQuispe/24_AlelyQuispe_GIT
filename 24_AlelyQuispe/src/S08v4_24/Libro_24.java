/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S08v4_24;

public class Libro_24 {
    private String titulo;
    private String autor;

    public Libro_24(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void mostrarDatos() {
        System.out.println("Título del libro: " + titulo);
        System.out.println("Autor del libro: " + autor);
    }
}
