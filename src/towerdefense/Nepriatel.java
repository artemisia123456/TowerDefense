/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package towerdefense;

/**
 *
 * @author Artemisia
 */
public class Nepriatel implements ITikaci {

    private int x;
    private int zivoty = 0;

    Nepriatel(int x) {
        this.x = x;
        zivoty = 9;

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int dajPoziciu() {
        return x;

    }

    public void uberZivot(int sila) {
        if (zivoty != 0) {
            zivoty -= sila;
        }
    }

    @Override
    public boolean tik() {
        if (zivoty > 0) {
            x--;
            return true;
        }

        return false;

    }

    public int dajOznacenie() {
        return zivoty;
    }

}
