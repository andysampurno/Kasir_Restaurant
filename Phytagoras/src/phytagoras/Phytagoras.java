/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phytagoras;

import java.util.*;

/**
 *
 * @author Andy Sampurno
 */
public class Phytagoras extends segitiga {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan alas : ");
        double a = sc.nextDouble();
        System.out.println("Masukkan tinggi : ");
        double t = sc.nextDouble();
        rumus(a, t);
    }
}

class segitiga {

    static double hasil;

    static void rumus(double a, double t) {
        hasil = Math.sqrt((Math.pow(a, 2)) + Math.pow(t, 2));
        System.out.println("Sisi Miring : "+hasil);
    }

}
