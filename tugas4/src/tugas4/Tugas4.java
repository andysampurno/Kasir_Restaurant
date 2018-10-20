/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

/**
 *
 * @author Andy Sampurno
 */
public class Tugas4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int angka, pembagi;
        System.out.println("Bilangan Prima : ");
        for (angka = 10; angka <= 50; angka++) {
            int x = 0;
            for (pembagi = 2; pembagi <= angka; pembagi++) {
                if (angka % pembagi == 0) {
                    if (angka != pembagi) {
                        x = 1;
                    }
                    if (x != 1 && angka == pembagi) {
                        System.out.println(angka);
                    }
                }
            }
        }
    }

}
