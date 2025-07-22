/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacion_vuelo;

/**
 *
 * @author Aprendiz
 */
public class Avion {
    private EstadoAvion estado;

    public void setEstado(EstadoAvion estado) {
        this.estado = estado;
    }
    
    public void  maniobrar(){
        estado.maniobrar();
    }
    
    public void usarMotor(){
        estado.usarMotor();
     }
    
    public void comunicarseConTorre(){
        estado.comunicarseConTorre();
    }
}
