/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Andy Sampurno
 */
public class C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int p, l, luas, keliling, diagonal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Rumus Persegi Panjang ");
        System.out.println("------------------------------");
        System.out.println("Pilihan : ");
        System.out.println("1. Luas ");
        System.out.println("2. Keliling ");
        System.out.println("3. Panjang Diagonal");
        System.out.println("4. Keluar");
        System.out.println("------------------------------");
        System.out.println("Masukkan Pilihan : ");
        int pilihan = sc.nextInt();
        if (pilihan == 1) {
            System.out.println("Luas");
            System.out.println("Masukkan Panjang : ");
            p = sc.nextInt();
            System.out.println("Masukkan Lebar : ");
            l = sc.nextInt();
            luas = p * l;
            System.out.println("Luasnya adalah : " + luas);
        } else if (pilihan == 2) {
            System.out.println("Keliling");
            System.out.println("Masukkan Panjang : ");
            p = sc.nextInt();
            System.out.println("Masukkan Lebar : ");
            l = sc.nextInt();
            keliling = (p + l) * 2;
            System.out.println("Kelilingnyanya adalah : " + keliling);
        } else if (pilihan == 3) {
            System.out.println("Panjang Diagonal");
            System.out.println("Masukkan Panjang : ");
            p = sc.nextInt();
            System.out.println("Masukkan Lebar : ");
            l = sc.nextInt();
            diagonal = (p * p) + (l * l);
            System.out.println("Diagonalnya adalah : " + Math.sqrt(diagonal));
        } else if (pilihan == 4) {
            System.out.println("Exit");
            System.exit(0);
        }
    }

}
