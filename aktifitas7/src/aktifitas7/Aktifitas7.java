/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aktifitas7;

import java.util.*;

/**
 *
 * @author Andy Sampurno
 */
public class Aktifitas7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int angka[][] = new int[3][5];
        Scanner sc = new Scanner(System.in);

        for (int a = 0; a < angka.length; a++) {
            for (int b = 0; b < angka[a].length; b++) {
                System.out.print("Masukkan angka : ");
                angka[a][b] = sc.nextInt();
            }
        }
        for (int a = 0; a < angka.length; a++){
            for (int b = 0; b< angka[a].length; b++){
                System.out.print(angka[a][b]+"\t");
            }
            System.out.println();
        }
    }
}
