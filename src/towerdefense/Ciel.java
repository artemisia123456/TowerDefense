/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package towerdefense;

/**
 *
 * @author Artemisia
 */
public class Ciel extends Struktura {

    Ciel(int x) {
        super(x);

    }

    public void overNepriatela(Nepriatel n) throws PrehraException {
        if (n != null) {
            if (x == n.dajPoziciu()) {
                throw new PrehraException();
            }
        }

    }

    public char dajOznacenie() {
        return 'X';

    }

}
