/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strukturprima;

import java.util.*;

/**
 *
 * @author Andy Sampurno
 */
public class Strukturprima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int bilangan;
        int hasil = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka bilangan : ");
        bilangan = input.nextInt();
        System.out.println("Faktor Prima dari " + bilangan + " adalah : ");
        for (int i = 1; i <= bilangan; i++) {
            if (bilangan % i == 0) {
                for (int o = 1; o <= i; o++) {
                    if (i % o == 0) {
                        hasil++;
                    }
                }
                if (hasil == 2) {
                    System.out.println(i + " ");
                }
                hasil = 0;
            }
        }
    }

}
