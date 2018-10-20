/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e;

/**
 *
 * @author Andy Sampurno
 */
public class E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 1, b = 1;
        int n = 10; // Batas output bilangan
        int i = 1;
        System.out.println(a + " ");
        do {
            System.out.println(a + " ");
            a = a*a;
            a = a + b;
            b = a - b;
            i++;
        } while (i < n);
        System.out.println();
    }

}
