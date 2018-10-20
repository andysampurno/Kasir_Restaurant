/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aktifitas7;

import java.util.Scanner;

/**
 *
 * @author Andy Sampurno
 */
public class aktifitas71 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka[][] = new int[4][3];
        
        for (int a = 0; a < angka.length; a++) {
            for (int b = 0; b < angka[a].length; b++) {
                System.out.print("Baris [" + (a+1)+"]"+"Kolom ["+(b+1)+"] : ");
                angka[a][b] = sc.nextInt();
            }
        }
        System.out.println("============================");
        for (int a = 0; a < angka.length; a++) {
            for (int b = 0; b < angka[a].length; b++) {
                System.out.print(angka[a][b] + "\t");
            }
            System.out.println("");
        }
    }
}
