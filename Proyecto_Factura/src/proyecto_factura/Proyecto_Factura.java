/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_factura;

/**
 *
 * @author Aprendiz
 */
public class Proyecto_Factura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("Agapito Piedralisa","3120980983"," c/ Río Seco, 2");
        
        var factura = new Factura(cliente);
        factura.añadirProducto(new Producto("Ratón USB", 8.43), 1);
        factura.añadirProducto(new Producto("Memoria RAM 2GB", 21.15), 2);
        factura.añadirProducto(new Producto("Altavoces", 12.66), 1);

        factura.imprimirFactura();
    }
    
}
