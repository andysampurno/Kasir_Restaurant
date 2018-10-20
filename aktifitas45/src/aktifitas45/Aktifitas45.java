/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aktifitas45;

import java.util.Scanner;

/**
 *
 * @author Andy Sampurno
 */
public class Aktifitas45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y = 0;
        int hasil = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan x = ");
        x = sc.nextInt();
        System.out.println("Masukkan y = ");
        y = sc.nextInt();

        for (int i = 1; i <= y; i++) {
            hasil = hasil * x;
        }
        System.out.println("Hasilnya = " + hasil);
    }

}
