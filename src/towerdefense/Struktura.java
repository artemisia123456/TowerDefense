/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package towerdefense;

/**
 *
 * @author Artemisia
 */
public abstract class Struktura {

    protected int x;
    
    
    Struktura (int x){
        this.x = x;
        
    }
    
    public int dajPoziciu (){
        return x;
    }
    
    public abstract void overNepriatela (Nepriatel n) throws PrehraException;
    
    public abstract char dajOznacenie ();
    
    
}
