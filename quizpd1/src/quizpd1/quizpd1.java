/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizpd1;

import java.util.*;

/**
 *
 * @author Andy Sampurno
 */
public class quizpd1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        quizpd1 a = new quizpd1();
        quizpd1.hitung phytagoras = a.new hitung();
        System.out.println("A. Phytagoras");
        phytagoras.rumus();
        quizpd1.hitung matrix2d =  a.new hitung();
        System.out.println("B. Matrix");
        matrix2d.matrix();
    }

    class hitung {

        double a = 5;
        double b = 4;
        double hasil;
        int z[][];

        int x[][] = {{1, 2},
                     {3, 4}};
        int y[][] = {{4, 3},
                     {1, 2}};

        private void rumus() {
            hasil = (a * a) + (b * b);
            System.out.println("   Hasil Phytagoras : " + Math.sqrt(hasil));
        }
        
        private void matrix(){
            z[0][0]= x[0][0]*y[0][0]+x[0][0]*y[0][1];
            z[0][1]= x[0][1]*y[0][0]+x[0][1]*y[0][1];
            z[1][0]= x[1][0]*y[0][1]+x[1][0]*y[1][1];
            z[0][1]= x[1][1]*y[0][1]+x[1][1]*y[1][1];
            System.out.println("Hasil Matrix Z : "+z);
           
        }
    }
}
