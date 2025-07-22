/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacion_vuelo;

/**
 *
 * @author Aprendiz
 */
public class Despegando implements EstadoAvion  {

    @Override
    public void maniobrar() {
        System.out.println("Despegando.");
        System.out.println("    ");
        System.out.println("Aumentando velocidad para acenso .");
    }

    @Override
    public void usarMotor() {
        System.out.println("Motores al máximo.");
    }

    @Override
    public void comunicarseConTorre() {
        System.out.println("Despegue confirmado .");
        System.out.println("--------------------------------");
        System.out.println("    ");
    }
    
}
