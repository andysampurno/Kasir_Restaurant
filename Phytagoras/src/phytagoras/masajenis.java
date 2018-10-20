/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phytagoras;

/**
 *
 * @author Andy Sampurno
 */
import java.util.*;
public class masajenis extends air{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan M : ");
        double m = sc.nextDouble();
        System.out.println("Masukkan V : ");
        double v = sc.nextDouble();
        rumus(m, v);
    }
}

class air {

    static double hasil;

    static void rumus(double m, double v) {
        hasil = m/v;
        System.out.println("Masa Jenis air : "+hasil+"KG/M3");
    }

}
