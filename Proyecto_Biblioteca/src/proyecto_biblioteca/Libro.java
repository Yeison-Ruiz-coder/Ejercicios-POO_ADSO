/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_biblioteca;

/**
 *
 * @author Aprendiz
 */
public class Libro extends Publicacion{
    
    String genero,idioma;
    int numerPaginas;
    
    public Libro(String titulo, String autor, String editorial, String referencia_bibliografica, int anio_publicacion,String genero,String idioma,int numerPaginas) {
        super(titulo, autor, editorial, referencia_bibliografica, anio_publicacion);
        this.genero = genero;
        this.idioma = idioma;
        this.numerPaginas = numerPaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getNumerPaginas() {
        return numerPaginas;
    }

    public void setNumerPaginas(int numerPaginas) {
        this.numerPaginas = numerPaginas;
    }
    
     @Override
    public void imprimir() {
         System.out.println("  ");
        System.out.println("Título del libro: " + titulo);
        System.out.println("Autor del libro: " + autor);
        System.out.println("Editorial del libro: " + editorial);
        System.out.println("Referencia bibliográfica: " + referencia_bibliografica);
        System.out.println("Año de publicación: " + anio_publicacion);
        System.out.println("Género del libro: " + genero);
        System.out.println("Idioma del libro: " + idioma);
        System.out.println("Número de páginas: " + numerPaginas);
         System.out.println("   ");
    }
    
    }
