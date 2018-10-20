/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d;

import java.util.*;
/**
 *
 * @author Andy Sampurno
 */
public class D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // TODO Auto-generated method stub
        int random, tebak, jumlah;
        random = (int) (Math.random() * 12);
        System.out.println("Tebaklah Angka Dadu 2-12");
        Scanner masukan = new Scanner(System.in);
        jumlah = 1;
        do {
            jumlah++;
            System.out.print("Masukkan Tebakan Anda : ");
            tebak = masukan.nextInt();
            if (tebak > random)  {
                System.out.println("Tebakan Anda Benar");
            } else if (tebak < random) {
                System.out.println("Maaf Belum Beruntung");
            }
        } while (tebak != random);
    }
}
