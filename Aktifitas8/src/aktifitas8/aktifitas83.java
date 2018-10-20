/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aktifitas8;

import java.util.*;

/**
 *
 * @author Andy Sampurno
 */
public class aktifitas83 {

    static int faktorial(int angka) {
        if (angka == 1) {
            return 1;
        } else {
            return angka = angka * faktorial(angka -1);
        }
    }

    public static void main(String[] args) {
        int angka;
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Angka : ");
        angka = sc.nextInt();
        System.out.println("Hasil Faktorial : " + faktorial(angka));
    }
}
