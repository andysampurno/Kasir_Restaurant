/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aktifitas44;

/**
 *
 * @author Andy Sampurno
 */
public class Aktifitas44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b, c;
        a = 5;
        b = 8;
        System.out.println();
        do {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        } while (a + b <= 50);
    }
}
