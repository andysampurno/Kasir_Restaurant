/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakpd21;

/**
 *
 * @author Andy Sampurno
 */
public class kotak {

    double panjang;
    double lebar;
    double tinggi;

    kotak(double p, double l, double t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    double hitungVolume() {
        return (panjang * lebar * tinggi);
    }

    public static void main(String[] args) {
        // TODO code application logic here

        kotak k1, k2;
        k1 = new kotak(4, 3, 2);
        k2 = new kotak(6, 5, 4);

        System.out.println("volume k1 = " + k1.hitungVolume());
        System.out.println("Volume k2 = " + k2.hitungVolume());
    }
}
