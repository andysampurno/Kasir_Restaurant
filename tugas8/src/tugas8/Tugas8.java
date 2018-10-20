/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas8;
import java.util.*;
/**
 *
 * @author Andy Sampurno
 */
public class Tugas8 {

    /**
     * @param args the command line arguments
     */
    public static long rekursif(int a, int b){
        if (b<= 0){
            return b;
        }
        return a + rekursif(a,b-1);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Masukkan Nilai A :");
        a = sc.nextInt();
        System.out.println("Masukkan Nilai B :");
        b = sc.nextInt();
        
        if (rekursif(a,b)<0){
            System.out.println("Tidak bisa dikali");
        } else {
            System.out.println(a+" * "+b+" = "+rekursif(a,b));
        }
    }
}
