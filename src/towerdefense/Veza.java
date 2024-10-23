/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package towerdefense;

/**
 *
 * @author Artemisia
 */
public class Veza extends Struktura implements ITikaci {

    private int pocetTikov = 0;
    private int vystrel = 0;

    Veza(int x) {
        super(x);
    }

    public char dajOznacenie() {
        return 'V';
    }

    public boolean tik() {
        pocetTikov++;
        return false;

    }

    @Override
    public void overNepriatela(Nepriatel n) {
        if (n != null) {
            if (n.dajPoziciu() <= x + 2 && n.dajPoziciu() >= x - 2 && this.nabitost() == true) {
                n.uberZivot(3);
                vystrel = pocetTikov;
                
            }
        }

    }

    public boolean nabitost() {
        if (vystrel <= pocetTikov + 2) {
            return true;
        }
        return false;
    }

}
