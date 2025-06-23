/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package batalla_deadpool_vs_wolverine;

public class Batalla {
    public static void iniciar(Personajes p1,Personajes p2){
        
        int turno = 1;
        
        while(p1.estaVivo() && p2.estaVivo()){
            //Determinar ganador.
            System.out.println("\nTurno " +turno);
            
            turnoPelea(p1, p2);
            if(!p1.estaVivo()){
                System.out.println("\n"+p2.getNombre()+" gana la batalla");
                break;
            }
            turno ++;
            
            System.out.println("\nTurno "+turno);
            
            turnoPelea(p2,p1);
            if(!p2.estaVivo()){
                System.out.println("\n"+p1.getNombre()+" gana la batalla");
                break;
            }
            
            turno++;
            
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Error al pausaar " + e.getMessage());
            }           
        }
    }
    

    public static void turnoPelea (Personajes atacante,Personajes defensor){
       if (!atacante.estaVivo()) return;

        if (!atacante.puedeAtacar()) {
            System.out.println(atacante.getNombre() + "se está regenerándose y no ataca. Vida restante " +atacante.getVida());
            atacante.setRegeneracion(false);
            return;
        }

        int daño = atacante.atacar();
        System.out.println(atacante.getNombre() + " inflige " + daño + " de daño.");

        if (daño == atacante.getDañoMax()) {
            defensor.setRegeneracion(true);
            System.out.println(defensor.getNombre() + " pierde su próximo turno por el golpe crítico.");
        } else if (!defensor.evadir()) {
            defensor.recibirDaño(daño);
            System.out.println(defensor.getNombre() + " recibe el daño. Vida restante: " + defensor.getVida());
        } else {
            System.out.println(defensor.getNombre() + " esquiva el ataque. Vida restante " + defensor.getVida());
        }
    }
}