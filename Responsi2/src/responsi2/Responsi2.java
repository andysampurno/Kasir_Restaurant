/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Responsi2;

import java.util.*;

/**
 *
 * @author JirenCore
 */
public class Responsi2 {

    static void menu() {
        Scanner sc = new Scanner(System.in);
        String[] makanan_minuman = {"sate ayam", "ayam goreng", "ayam bakar", "telor dadar", "sayur bening", "sayur sop", "nasi putih", "nasi kuning", "nasi uduk", "teh anget", "susu anget", "es cendol", "es juice", "es teler", "es jeruk"};
        int[] harga_makanan_minuman = {9000, 8000, 9000, 4000, 3000, 4000, 4000, 5000, 5000, 3000, 5000, 6000, 7000, 9500, 5000};
        int pilih_menu, pil;
        String tambah;
        System.out.println("=======================================");
        System.out.println("||   SELAMAT DATANG DI WARUNG KAMI   ||");
        System.out.println("=======================================");
        System.out.println("||       MENU WARUNG PRASMANAN       ||");
        System.out.println("=======================================");
        System.out.println("||     1. Menu Makanan & Minuman     ||");
        System.out.println("||     2. Keluar                     ||");
        System.out.println("=======================================");
        System.out.print("Pilih : ");
        pilih_menu = sc.nextInt();
        int i = 0;
        int hargatotal = 0;
        String menu[] = new String[100];
        int harga[] = new int[100];

        System.out.println("");
        switch (pilih_menu) {
            case 1:

                do {
                    System.out.println("========================================");
                    System.out.println("||       Daftar Makanan & Minuman     ||");
                    System.out.println("========================================");
                    for (int x = 0; x < makanan_minuman.length; x++) {
                        System.out.println((x + 1) + ". " + makanan_minuman[x] + "\t\t\t| " + harga_makanan_minuman[x]);
                    }

                    System.out.println("Pilih Makanan & Minuman anda : ");
                    pil = sc.nextInt();
                    if (pil <= makanan_minuman.length) {
                        menu[i] = makanan_minuman[pil - 1];
                        harga[i] = harga_makanan_minuman[pil - 1];
                        System.out.println(makanan_minuman[pil - 1]);
                    } else {
                        System.out.println("Maaf pilihan menu anda tidak ada ");
                        menu[i] = "Tidak Ada";
                    }
                    Scanner input = new Scanner(System.in);
                    System.out.println("============================================");
                    System.out.println("||        Menu yang Anda pesan adalah     ||");
                    System.out.println("============================================");
                    System.out.println("||        MENU    \t||      HARGA     ||");
                    System.out.println("||\t" + menu[i] + "\t||\t" + harga[i] + "\t  ||");
                    System.out.println("============================================");
                    System.out.print("Apakah anda ingin memesan lagi ? Y/T : ");
                    tambah = input.nextLine();
                    i++;
                } while (tambah.equalsIgnoreCase("Y"));

                System.out.println("");
                System.out.println("=============================================");
                System.out.println("||     Semua Menu yang Anda pesan adalah   ||");
                System.out.println("=============================================");
                for (int a = 0; a < i; a++) {
                    hargatotal = hargatotal + harga[a];
                    System.out.println("||\t" + menu[a] + "\t\t" + harga[a] + "\t   ||");
                }
                System.out.println("=============================================");
                System.out.println("");
                System.out.println("Total yang harus anda bayar adalah   : Rp." + hargatotal);
                menu();
                break;
                

            case 2:
                System.out.println("Terima Kasih");
                break;
            default:
                System.out.println("Inputan salah!");
        }

    }
}
