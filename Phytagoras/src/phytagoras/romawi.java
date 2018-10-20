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
import java.util.*;

public class romawi extends romaw {

    public static void main(String[] args) {
        ubah();
    }
}

class romaw {

    static void ubah() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int angka = new Scanner(System.in).nextInt();
        int lagi = 0;
        if (angka < 1 || angka > 5000) {
            System.out.println("maaf,, tahun harus dalam jangkauan 1...5000");
        } else {
            while (angka >= 1000) {
                System.out.print("M");
                angka = angka - 1000;
            }
            if (angka >= 500) {
                if (angka >= 900) {
                    System.out.print("CM");
                    angka = angka - 900;
                } else {
                    System.out.print("D");
                    angka = angka - 500;
                }
            }
            while (angka >= 100) {
                if (angka >= 400) {
                    System.out.print("CD");
                    angka = angka - 400;
                } else {
                    System.out.print("C");
                    angka = angka - 100;
                }
            }
            if (angka >= 50) {
                if (angka >= 90) {
                    System.out.print("XC");
                    angka = angka - 90;
                } else {
                    System.out.print("L");
                    angka = angka - 50;
                }
            }
            while (angka >= 10) {
                if (angka >= 40) {
                    System.out.print("XL");
                    angka = angka - 40;
                } else {
                    System.out.print("X");
                    angka = angka - 10;
                }
            }
            if (angka >= 5) {
                if (angka == 9) {
                    System.out.print("IX");
                    angka = angka - 9;
                } else {
                    System.out.print("V");
                }
                angka = angka - 5;
            }
        }
        while (angka >= 1) {
            if (angka == 4) {
                System.out.print("IV");
                angka = angka - 4;
            } else {
                System.out.print("I");
            }
            angka = angka - 1;
        }

    }
}
