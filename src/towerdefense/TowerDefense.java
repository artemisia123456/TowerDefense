/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package towerdefense;

/**
 *
 * @author Artemisia
 */
public class TowerDefense {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HraciePole h = new HraciePole();
        Nepriatel n = new Nepriatel (20);
        Veza a = new Veza (15);
        Veza b = new Veza (10);
        Ciel c = new Ciel (0);
        h.pridajN(n);
        h.pridajS(c);
        h.pridajS(a);
        h.pridajS(b);
        
        try {
        for (int i = 0; i < 20; i++) {
            h.tik();
        }
        } catch (PrehraException neheh){
            System.out.println("L");
        }
    }
    
}
