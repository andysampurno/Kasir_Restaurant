/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas6;

import java.util.*;

/**
 *
 * @author Andy Sampurno
 */
public class Tugas6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int kode[] = new int[5];
        int lama[] = new int[5];
        int anak[] = new int[5];
        int insentif[] = new int[5];
        int gaji[] = new int[5];
        int total[] = new int[5];
        int tunjangan[] = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int a = 0; a < kode.length; a++) {
            System.out.println("Masukkan Kode Pegawai : ");
            kode[a] = sc.nextInt();
            System.out.println("Masukkan Lamanya bekerja : ");
            lama[a] = sc.nextInt();
            System.out.println("Masukkan Jumlah Anak : ");
            anak[a] = sc.nextInt();

            System.out.println("===============================================");

            if (lama[a] <= 5) {
                gaji[a] = 1000000;
            } else if (lama[a] <= 10) {
                gaji[a] = 2000000;
            } else if (lama[a] > 10) {
                gaji[a] = 5000000;
            }

            if (anak[a] <= 2 && lama[a] > 2) {
                tunjangan[a] = anak[a] * 200000;
                insentif[a] = 0;
            } else {
                tunjangan[a] = 0;
            }

            if (anak[a] >= 2 && lama[a] > 2) {
                insentif[a] = 300000;
            } else {
                insentif[a] = 0;
            }

            total[a] = gaji[a] + tunjangan[a] + insentif[a];
        }
        System.out.println("_________________________________________________________________________________________");
        System.out.println("|Kode Pegawai\t|Kerja\t|Anak\t|Insentif\t|Gaji\t\t\t|Total\t\t|");
        for (int b = 0; b < kode.length; b++) {
            System.out.println("_________________________________________________________________________________________");
            System.out.println("|" + kode[b] + "\t\t|" + lama[b] + "\t|" + anak[b] + "\t|" + insentif[b] + "\t\t|" + gaji[b] + "\t\t|" + total[b] + "\t|");
        }

        System.out.println("_________________________________________________________________________________________");
    }

}
