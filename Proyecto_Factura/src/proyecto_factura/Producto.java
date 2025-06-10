/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_factura;

/**
 *
 * @author Aprendiz
 */
public class Producto {
    String nmbre;
    double PrecioUnitario;

    public Producto(String nmbre, double PrecioUnitario) {
        this.nmbre = nmbre;
        this.PrecioUnitario = PrecioUnitario;
    }

    public String getNmbre() {
        return nmbre;
    }

    public void setNmbre(String nmbre) {
        this.nmbre = nmbre;
    }

    public double getPrecioUnitario() {
        return PrecioUnitario;
    }

    public void setPrecioUnitario(double PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }
    
    
}
