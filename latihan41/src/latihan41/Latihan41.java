/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan41;

/**
 *
 * @author Andy Sampurno
 */
public class Latihan41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print(x + " ");
            }
            x = x + y;
            System.out.println("");
            y = y + 10;
        }
    }
}
