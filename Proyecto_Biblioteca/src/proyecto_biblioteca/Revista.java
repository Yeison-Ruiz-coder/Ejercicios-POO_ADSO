/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_biblioteca;

/**
 *
 * @author Aprendiz
 */
public class Revista extends Publicacion{
    int edicion,volumen;
    String coleccion;

    public Revista(String titulo, String autor, String editorial, String referencia_bibliografica, int anio_publicacion,int edicion,int volumen,String coleccion) {
        super(titulo, autor, editorial, referencia_bibliografica, anio_publicacion);
        this.edicion = edicion;
        this.volumen = volumen;
        this.coleccion = coleccion;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public String getColeccion() {
        return coleccion;
    }

    public void setColeccion(String coleccion) {
        this.coleccion = coleccion;
    }
    
    
    
    @Override
    public void imprimir() {
        System.out.println("   ");
        System.out.println("Título de la revista: " + titulo);
        System.out.println("Autor de la revista: " + autor);
        System.out.println("Editorial de la revista: " + editorial);
        System.out.println("Referencia bibliográfica: " + referencia_bibliografica);
        System.out.println("Año de publicación: " + anio_publicacion);
        System.out.println("Edicion de la revsita: " + edicion);
        System.out.println("Volumen de la revista: " + volumen);
        System.out.println("Coleccion de la revista " + coleccion);
        System.out.println("   ");
}
    
}