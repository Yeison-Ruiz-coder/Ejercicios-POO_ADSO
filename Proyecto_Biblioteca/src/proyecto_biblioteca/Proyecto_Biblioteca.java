/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_biblioteca;

/**
 *
 * @author Aprendiz
 */
public class Proyecto_Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Biblioteca biblioteca1 = new Biblioteca ("Biblioteca Nacional");

    
        Libro libro1 = new Libro ("Cien años de soledad","Gabriel"
                + "Garcia Marquez", "Sudamericana","858.76/M566",1976,"Literatura moderna","Español",200);
         biblioteca1.agregarPublicacion(libro1);
        
        Libro libro2 = new Libro("1984", "George Orwell", "Secker & Warburg", 
        "823.912/O79", 1949, "Distopía", "Inglés", 328);
         biblioteca1.agregarPublicacion(libro2);

        Libro libro3 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "Francisco de Robles", 
        "863/C411", 1605, "Novela clásica", "Español", 863);
         biblioteca1.agregarPublicacion(libro3);

        Libro libro4 = new Libro("To Kill a Mockingbird", "Harper Lee", "J.B. Lippincott & Co.", 
        "813.54/L477", 1960, "Drama social", "Inglés", 281);
         biblioteca1.agregarPublicacion(libro4);
            
        Revista revista1 = new Revista("La Inteligencia Artificial en la Industria", "Juan Rodríguez", 
        "Revista de Tecnología y Sociedad", "5(1)/23-35", 2020, 0, 0, "");  
         biblioteca1.agregarPublicacion(revista1);
        
         
        Revista revista2 = new Revista("El Cambio Climático y sus Efectos en la Biodiversidad", "Ana López", 
        "Revista de Ciencias Ambientales", "12(3)/45-52", 2019, 0, 0, "");
         biblioteca1.agregarPublicacion(revista2);
         
         Revista revista3 = new Revista("La Economía Circular y su Impacto en la Sostenibilidad", "Carlos González", 
        "Revista de Economía y Sostenibilidad", "8(2)/10-22", 2021, 0, 0, "");  
         biblioteca1.agregarPublicacion(revista3);
         
         Revista revista4 = new Revista("La Educación en Línea y su Efectividad en la Formación de Estudiantes", "Sofía Martínez", 
        "Revista de Educación a Distancia", "15(1)/1-15", 2018, 0, 0, "");  
         biblioteca1.agregarPublicacion(revista4);
         

        biblioteca1.mostrarPublicacion();
    }
    
}