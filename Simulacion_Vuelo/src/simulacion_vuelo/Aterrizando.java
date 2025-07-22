/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacion_vuelo;

/**
 *
 * @author Aprendiz
 */
public class Aterrizando implements EstadoAvion{

    @Override
    public void maniobrar() {
        System.out.println("Aterrizando.");
        System.out.println("    ");
        System.out.println("Descendiendo hacia pista .");
    }

    @Override
    public void usarMotor() {
        System.out.println("Reduciendo potencia para aterrizar .");
    }

    @Override
    public void comunicarseConTorre() {
        System.out.println("Solicitando permiso para aterrizar .");
        System.out.println("--------------------------------");
        System.out.println("    ");
    }
    
}
