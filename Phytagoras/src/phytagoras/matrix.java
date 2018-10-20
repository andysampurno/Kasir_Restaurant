/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phytagoras;

/**
 *
 * @author Andy Sampurno
 */
public class matrix extends hitung{
    public static void main(String[] args){
        matrix();
    }
}
    class hitung {
    static void matrix () {
		
        int x[][]= {{1,2},{3,4}};
        int y[][]= {{3,3},{2,1}};
        int z[][]= new int[2][2];
         
        z[0][0]=x[0][0]*y[0][0]+z[0][1]*y[1][0];
        z[0][1]=x[0][0]*y[0][1]+z[0][1]*y[1][1];
        z[1][0]=x[1][0]*y[0][0]+z[1][1]*y[1][0];
        z[1][1]=x[1][0]*y[0][1]+z[1][1]*y[1][1];
         
        System.out.println("Hasil perkalian Matriks 2x2");
        for(int a = 0 ;a<2;a++){
            for(int b = 0;b<2;b++){
                System.out.print(z[a][b]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("");
    }
}