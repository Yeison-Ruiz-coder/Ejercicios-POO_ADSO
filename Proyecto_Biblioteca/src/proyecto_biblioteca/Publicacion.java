/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_biblioteca;

/**
 *
 * @author Aprendiz
 */
public class Publicacion {
    String titulo,autor,editorial,referencia_bibliografica;
    int anio_publicacion;

    public Publicacion(String titulo, String autor, String editorial, String referencia_bibliografica, int anio_publicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.referencia_bibliografica = referencia_bibliografica;
        this.anio_publicacion = anio_publicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getReferencia_bibliografica() {
        return referencia_bibliografica;
    }

    public void setReferencia_bibliografica(String referencia_bibliografica) {
        this.referencia_bibliografica = referencia_bibliografica;
    }

    public int getAnio_publicacion() {
        return anio_publicacion;
    }

    public void setAnio_publicacion(int anio_publicacion) {
        this.anio_publicacion = anio_publicacion;
    }
    
    
    public void imprimir(){
        System.out.println("El titulo es: " + titulo);
        System.out.println("El Autor es :" + autor);
        System.out.println("La editorial es:" +editorial);
        System.out.println("La referencia es:" +referencia_bibliografica);
        System.out.println("El año publicacion es :" +anio_publicacion);
    }
}
