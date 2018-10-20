/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

/**
 *
 * @author Andy Sampurno
 */
public class Latihan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int a = 5; a >= 1; a--) {
            for (int b = 1; b <= a; b++) {
                System.out.print(b * 10 + " ");
            }
            System.out.println();
        }
    }

}
