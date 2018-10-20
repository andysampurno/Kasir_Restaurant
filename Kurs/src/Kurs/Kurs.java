/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kurs;
import java.util.Scanner;
/**
 *
 * @author Andy Sampurno
 */
public class Kurs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double rupiah = 1;
    double dolar = 13771;
    
        System.out.println("____________________________");
        System.out.println("1. Kurs Rupiah ke Dolar");
        System.out.println("2. Kurs Dolar ke rupiah");
        System.out.println("____________________________");
        Scanner kurs = new Scanner(System.in);
        int pilihan = kurs.nextInt();
        if (pilihan == 1)
        {
            System.out.println("Masukkan nilai rupiah : ");
            rupiah = kurs.nextDouble();
            double a = rupiah/dolar;
            System.out.println("Nilai Dolar : "+ a );
        }
        else if (pilihan ==2)
        {
            System.out.println("Masukkan nilai dolar : ");
            rupiah = dolar;
            dolar = kurs.nextDouble();
            double b = rupiah*dolar;
            System.out.println("Nilai Rupiah : "+ b );
        }
    }
    
}
