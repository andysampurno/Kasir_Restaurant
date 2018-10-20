/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strukturprima;

import java.util.Scanner;

/**
 *
 * @author Andy Sampurno
 */
public class faktor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;
        System.out.print("Masukkan angka : ");
        angka = sc.nextInt();
        
        for(int x = 1; x <= angka; x++)
        {
            if(angka%x == 0)
            {
                System.out.println(x);
            }
        }
    }
}
