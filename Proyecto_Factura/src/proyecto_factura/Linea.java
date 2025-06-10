/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_factura;

/**
 *
 * @author Aprendiz
 */
public class Linea {
    
    int numero;
    Producto producto;
    int cantidad;

    public Linea(int numero, Producto producto, int cantidad) {
        this.numero = numero;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public double CalcularTotal(){
        
        return producto.PrecioUnitario*cantidad;
    }
    
    public String imprimir (){
        return numero +";"+ producto.nmbre +";"+ cantidad+";"+
                String.format("%.2f",producto.PrecioUnitario)+";"+
                String.format("%.2f",CalcularTotal());
    }
}
