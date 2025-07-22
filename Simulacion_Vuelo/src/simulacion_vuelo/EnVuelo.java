/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacion_vuelo;

/**
 *
 * @author Aprendiz
 */
public class EnVuelo implements EstadoAvion{

    @Override
    public void maniobrar() {
        System.out.println("Ajustando rumbo y altitud .");
    }

    @Override
    public void usarMotor() {
        System.out.println("Velocidad crucero .");
    }

    @Override
    public void comunicarseConTorre() {
        System.out.println("Confirmando ubicación .");
    }
    
}
