/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package batalla_deadpool_vs_wolverine;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Batalla_Deadpool_vs_Wolverine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Ingrese la vida Inicial de Deadpool .");
        int vidaDeadpool = sc.nextInt();
        System.out.println("Ingrese la vida inicial de Wolverine .");
        int vidaWolverine = sc.nextInt();
        
        Personajes deadpool = new Deadpool(vidaDeadpool);
        Personajes wolverine = new Wolverine(vidaWolverine);
        
        Batalla.iniciar(deadpool, wolverine);
        sc.close();
        

    }
}
