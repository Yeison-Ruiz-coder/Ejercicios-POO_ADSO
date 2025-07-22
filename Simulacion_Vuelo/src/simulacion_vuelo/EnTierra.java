/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacion_vuelo;

/**
 *
 * @author Aprendiz
 */
public class EnTierra implements EstadoAvion {

    @Override
    public void maniobrar() {
        System.out.println("En tierra.");
        System.out.println("    ");
        System.out.println("Rodando en la pista.");
    }

    @Override
    public void usarMotor() {
        System.out.println("Encendiendo motores.");
    }

    @Override
    public void comunicarseConTorre() {
        System.out.println("Solicitar permiso para despegar.");
        System.out.println("--------------------------------");
        System.out.println("    ");
    }
    
}
