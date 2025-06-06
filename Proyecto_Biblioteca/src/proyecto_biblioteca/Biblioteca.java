/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_biblioteca;

import java.util.ArrayList;

/**
 *
 * @author Aprendiz
 */
public class Biblioteca {
    String nombre;
    ArrayList<Publicacion> coleccionPublicacion;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        coleccionPublicacion = new ArrayList<Publicacion>();
    }
    
    
    public void agregarPublicacion(Publicacion publicacion) {
        coleccionPublicacion.add(publicacion);
    }
    public void mostrarPublicacion(){
        for (int i = 0; i <coleccionPublicacion.size() ; i++) {
            Publicacion publicacion = (Publicacion) coleccionPublicacion.get(i);
            publicacion.imprimir();
        }
    }
    
}