/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deretbilangan;

/**
 *
 * @author Andy Sampurno
 */
public class Deretbilangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 0;
        for (int x = 1; x <= 5; x++) {
            if (x % 2 == 1) {
                for (int y = 1; y <= 10; y++) {
                    a++;
                    System.out.print(a + "");
                }
                a = a + 10;
            } else {
                for (int y = 1; y <= 10; y++) {
                    System.out.print(a + "");
                    a--;
                }
                a = a + 10;
            }
            System.out.println("");
        }
    }

}
