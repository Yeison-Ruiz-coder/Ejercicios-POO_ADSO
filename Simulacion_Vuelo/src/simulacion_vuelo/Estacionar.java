/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacion_vuelo;

/**
 *
 * @author Aprendiz
 */
public class Estacionar implements EstadoAvion{

    @Override
    public void maniobrar() {
        System.out.println("Estacionando.");
        System.out.println("    ");
        System.out.println("Ubicand avion para desembarque .");
    }

    @Override
    public void usarMotor() {
        System.out.println("Motores apagados .");
    }

    @Override
    public void comunicarseConTorre() {
        System.out.println("Aterrizaje exitoso .");
        System.out.println("--------------------------------");
        System.out.println("    ");
    }
    
}
