/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulacion_vuelo;

/**
 *
 * @author Aprendiz
 */
public class Simulacion_Vuelo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Avion avion = new Avion();

        avion.setEstado(new EnTierra());
        avion.maniobrar();
        avion.usarMotor();
        avion.comunicarseConTorre();

        avion.setEstado(new Despegando());
        avion.maniobrar();
        avion.usarMotor();
        avion.comunicarseConTorre();

        avion.setEstado(new EnVuelo());
        avion.maniobrar();
        avion.usarMotor();
        avion.comunicarseConTorre();

        avion.setEstado(new Aterrizando());
        avion.maniobrar();
        avion.usarMotor();
        avion.comunicarseConTorre();
        
        avion.setEstado(new Estacionar());
        avion.maniobrar();
        avion.usarMotor();
        avion.comunicarseConTorre();
    }
    
}
