/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas7;

/**
 *
 * @author Andy Sampurno
 */
public class Tugas7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[][] = {
            {0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 1, 0, 0, 0, 0}

        };

        System.out.println("A\t B\t != A\t A | B\t A & B\t (!= A) & (A | B)");
        System.out.println("=========================================================");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(a[i][j] + "        ");
                if (a[i][1] != a[i][0]) {
                    a[i][2] = 1;
                }
                a[i][3] = a[i][0] | a[i][1];
                a[i][4] = a[i][0] & a[i][1];
                a[i][5] = a[i][2] & (a[i][1] | a[i][1]);
            }
            System.out.println("");
        }
    }

}
