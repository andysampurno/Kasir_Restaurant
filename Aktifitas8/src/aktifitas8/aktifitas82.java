/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aktifitas8;
import java.util.*;
/**
 *
 * @author Andy Sampurno
 */
public class aktifitas82 {
    static int faktorial(int angka){
        int hasil = 1;
        for (int ulang = angka; ulang>1; ulang-- ){
            hasil = hasil*ulang;
        }
        return hasil;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Angka : ");
        int fak = sc.nextInt();
        System.out.println("Hasil Faktorial : "+faktorial(fak));
    }
}
