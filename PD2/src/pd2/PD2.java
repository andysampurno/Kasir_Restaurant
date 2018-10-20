/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd2;

import java.util.*;

/**
 *
 * @author Andy Sampurno
 */
public class PD2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int panjang;
        System.out.print("masukkan panjang matriks : ");
        panjang = sc.nextInt();
        int[] a = new int[panjang];
        int[] b = new int[panjang];
        System.out.println("masukkan nilai matriks a :");
        for (int c = 0; c < a.length; c++) {
            a[c] = sc.nextInt();
        }
        System.out.println("masukkan nilai matriks b :");
        for (int c = 0; c < b.length; c++) {
            b[c] = sc.nextInt();
        }
        System.out.println("===================");
        int[] d = new int[panjang];
        for (int i = 0; i < panjang; i++) {
            d[i] = a[i] * b[i];
            System.out.println(d[i]);
        }
    }

}
