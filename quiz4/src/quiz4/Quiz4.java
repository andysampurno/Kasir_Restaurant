/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz4;

import java.util.Scanner;

/**
 *
 * @author Andy Sampurno
 */
public class Quiz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama = "";
        int nilai;
        System.out.println("Masukkan Nama : ");
        nama = sc.nextLine();
        System.out.println("Masukkan Nilai : ");
        nilai = sc.nextInt();

        if (nilai >= 80 && nilai <= 100) {
            System.out.println("Nilai A");
        } else if ((nilai > 75) && (nilai <= 79)) {
            System.out.println("Nilai B+");
        } else if ((nilai > 70) && (nilai <= 74)) {
            System.out.println("Nilai B");
        } else if ((nilai > 65) && (nilai <= 69)) {
            System.out.println("Nilai C+");
        } else if ((nilai > 56) && (nilai <= 64)) {
            System.out.println("Nilai C");
        } else if ((nilai > 40) && (nilai <= 45)) {
            System.out.println("Nilai D");
        } else {
            System.out.println("Nilai E");
        }
    }

}
