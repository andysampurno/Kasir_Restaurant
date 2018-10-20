/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan8;
import java.util.*;
/**
 *
 * @author Andy Sampurno
 */
public class Latihan8 {
    static double faktorial(double angka){
      double hasil =1;
      for (double ulang = angka; ulang> 1; ulang--){
          hasil = hasil * ulang;
      }
      return hasil;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double total;
        System.out.println("Masukkan Angka \t: ");
        double angka = sc.nextInt();
        System.out.println(angka+"/"+angka+"!");
        total = angka/faktorial(angka);
        System.out.println("Hasil \t\t: "+total);
    }
}
