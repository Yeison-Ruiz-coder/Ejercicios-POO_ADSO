/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package batalla_deadpool_vs_wolverine;

import java.util.Random;

/**
 *
 * @author User
 */
public class Personajes {
    private String nombre;
    private int vida;
    private float evasion;
    private int dañoMax;
    private int dañoMin;
    private boolean regeneracion;
    Random pablo = new Random(); 

    public Personajes(String nombre, int vida, float evasion, int dañoMax, int dañoMin,boolean regeneracion) {
        this.nombre = nombre;
        this.vida = vida;
        this.evasion = evasion;
        this.dañoMax = dañoMax;
        this.dañoMin = dañoMin;
        this.regeneracion = regeneracion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }
    
    public boolean estaVivo(){
    return vida > 0;
    }
    
    public int atacar(){
        int daño =  pablo.nextInt((dañoMax - dañoMin +1)) + dañoMin;
        return daño;
    }

    public void setRegeneracion(boolean estado) {
        this.regeneracion = estado;
    }
    
    public boolean puedeAtacar(){
        return !regeneracion;
    }
    
    public void recibirDaño (int daño){
        vida -= daño;
        if(vida < 0) vida = 0;
    }

    public int getDañoMax() {
        return dañoMax;
    }
    
    public boolean evadir(){
        return pablo.nextFloat() > evasion;
    }
    

    }
