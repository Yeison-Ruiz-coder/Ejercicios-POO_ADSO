/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_factura;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Aprendiz
 */
public class Factura {
     static int sigid = 123;
     int id;
     Date fecha;
     Cliente cliente;
     List<Linea> lineas;
     int ContadorLineas = 1;

    public Factura(Cliente cliente) {
        this.id = getSigid();
        this.fecha = new Date();
        this.cliente = cliente;
        this.lineas = new ArrayList<>();
    }
    
    private static int getSigid(){
        return sigid++;
    }
    
    public void añadirProducto(Producto producto,int cantidad){
        lineas.add(new Linea(ContadorLineas,producto,cantidad));
    }
    
    public void imprimirFactura(){
        System.out.println("Factura n°: "+id);
        System.out.println("Fecha: "+fecha);
        System.out.println("    ");
        System.out.println("Datos del Cliente ");
        System.out.println("----------------------");
        System.out.println("Nombre: "+ cliente.nombre);
        System.out.println("Dirección: "+ cliente.direccion);
        System.out.println("Telefono: " + cliente.telefono);
        System.out.println("    ");
        System.out.println("Detalle de la factura.");
        System.out.println("----------------------");
        System.out.println("Línea;Producto;Cantidad;Precio ud.;Precio total");
        System.out.println("     ");
        
        double subtotal = 0;
        for (Linea linea : lineas) {
            System.out.println(linea.imprimir());
            subtotal += linea.CalcularTotal();
        }

        double iva = subtotal * 0.18;
        double total = subtotal + iva;
        
        System.out.println("Subtotal: "+subtotal+" €");
        System.out.println("IVA (18%): "+iva+" €");
        System.out.println("TOTAL: "+total+" €");
}
}
