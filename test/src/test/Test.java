/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.*;

/**
 *
 * @author Andy Sampurno
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int baris = 0;
        int x[][] = new int[baris][5];
        System.out.println("Masukkan jumlah baris");
        baris = input.nextInt();
        for (int i = 0; i <= baris; i++) {

            for (int j = 0; j <= 5; j++) {

                System.out.print("[“+i+”][“+j+”]: ");

                x[i][j] = input.nextInt();

            }

        }
    }

}
