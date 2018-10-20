/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grade2;

import java.util.*;

/**
 *
 * @author Andy Sampurno
 */
public class Grade2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int nilai;
        while (true) {
            System.out.print("Masukkan Nilai = ");
            nilai = sc.nextInt();
            if (nilai == 1000) {
                break;
            } else if (nilai == 100) {
                System.out.println("SEMPURNA");
            } else if (nilai >= 56 && nilai <= 99) {
                System.out.println("LULUS");
            } else if (nilai >= 1 && nilai <= 55) {
                System.out.println("GAGAL");
            } else if (nilai == 0) {
                System.out.println("PARAH");

            }

        }

    }
}
