/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package towerdefense;

import java.util.ArrayList;

/**
 *
 * @author Artemisia
 */
public class HraciePole {

    private ArrayList<Nepriatel> nepriatelia = new ArrayList<Nepriatel>();
    private ArrayList<Struktura> struktury = new ArrayList<Struktura>();

    HraciePole() {
        for (int i = 0; i < 21; i++) {
            struktury.add(null);
            nepriatelia.add(null);
        }

    }

    public void pridajN(Nepriatel a) {
        nepriatelia.set(a.dajPoziciu(), a);

    }

    public void pridajS(Struktura s) {
        struktury.set(s.dajPoziciu(), s);

    }

    public void tik() throws PrehraException {
        for (Nepriatel nepriatel : nepriatelia) {
            if (nepriatel != null) {
                if (nepriatel.tik() == true) {
                    nepriatelia.set(nepriatel.getX() + 1, null);
                    nepriatelia.set(nepriatel.getX(), nepriatel);
                }
            }

        }
        for (Struktura struktura : struktury) {
            if (struktura != null) {
                if (struktura.dajOznacenie() == 'V') {
                    ((Veza) struktura).tik();
                }

                for (Nepriatel nepriatel : nepriatelia) {
                    struktura.overNepriatela(nepriatel);
                }
            }

        }
        vypis();

    }

    public void vypis() {
        String a = "";
        String b = "";
        for (Struktura struktura : struktury) {
            a += struktura == null ? " " : struktura.dajOznacenie();
        }
        System.out.println(a);

        for (Nepriatel nepriatel : nepriatelia) {
            b += nepriatel == null ? " " : nepriatel.dajOznacenie();
        }
        System.out.println(b);

    }
}
