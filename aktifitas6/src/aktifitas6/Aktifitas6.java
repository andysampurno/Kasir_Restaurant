/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aktifitas6;

import java.util.*;

/**
 *
 * @author Andy Sampurno
 */
public class Aktifitas6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        int[] angka_awal = new int[10];
        int[] angka_urut = new int[angka_awal.length];
        int temp;
        double hasil;

        temp = 0;
        hasil = 0;

        for (int x = 0; x < angka_awal.length; x++) {
            System.out.print("Masukkan angka : ");
            angka_awal[x] = sc.nextInt();
            angka_urut[x] = angka_awal[x];
            hasil = hasil + angka_awal[x];
        }

        for (int x = 0; x < angka_urut.length; x++) {
            for (int y = 0; y < angka_urut.length - 1; y++) {
                if (angka_urut[y + 1] < angka_urut[y]) {
                    temp = angka_urut[y];
                    angka_urut[y] = angka_urut[y + 1];
                    angka_urut[y + 1] = temp;
                }
            }
        }

        System.out.print("\nNilai Array : ");
        for (int x = 0; x < angka_awal.length; x++) {
            System.out.print(angka_awal[x] + " ");
        }
        
        System.out.println("");
        System.out.println("Angka tertinggi : " + angka_urut[angka_urut.length - 1]);
        System.out.println("Angka terendah : " + angka_urut[0]);
        System.out.println("Rata-rata : " + (hasil / angka_urut.length));
    }
}
