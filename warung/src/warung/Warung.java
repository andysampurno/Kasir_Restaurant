/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Andy Sampurno
 */
public class Warung {

    static int milih;
    static int pili = 0;

    static void menu() {
        String[] makanan = {"Bakso Besar", "Bakso Sedang", "Tahu Kuning", "Siomay", "Mie Kuning", "Gorengan"};
        int[] harga_makanan = {5000, 2500, 500, 500, 500, 500};
        String[] minuman = {"Es Barbar", "Es Witch", "Es Lightning", "Es Teh", "Es Jeruk", "Teh Panas"};
        int[] harga_minum = {7500, 5000, 3500, 2500, 2500, 2000};
        String tambahdata;
        System.out.println("===================================");
        System.out.println("|  Selamat Datang Di Warung Kami  |");
        System.out.println("===================================");
        System.out.println("|        Menu Bakso Goblin        |");
        System.out.println("===================================");
        System.out.println("|1.          Bakso Goblin         |");
        System.out.println("|2.         Minuman Valkyrie      |");
        System.out.println("|3.             Keluar            |");

        BufferedReader input2 = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        int hargatotal = 0;
        String menus[] = new String[100];
        int harga[] = new int[100];

        Scanner menu = new Scanner(System.in);
        System.out.println("Silahkan Pilih Menu Yang Tersedia ");
        milih = menu.nextInt();
        boolean keluar;

        do {

            if (milih == 1) {
                for (int b = 0; b < makanan.length; b++) {
                    System.out.println(b + 1 + " " + makanan[b] + " " + harga_makanan[b]);
                }
                
                    do {
                        System.out.print("Pilihan menu anda  = ");
                        int pil = menu.nextInt();

                        if (pil < makanan.length) {
                            menus[i] = makanan[pil - 1];
                            harga[i] = harga_makanan[pil - 1];
                        } else if (pil == makanan.length) {
                            menu();
                        } else {
                            System.out.println("Maaf pilihan menu anda tidak tepat ");
                            menus[i] = "Tidak Ada";
                            harga[i] = 0;
                        }

                        Scanner input = new Scanner(System.in);
                        System.out.println("=====================================");
                        System.out.println("|    Menu yang Anda pesan adalah    |");
                        System.out.println("=====================================");
                        System.out.println("|        MENU     ||     HARGA      |");
                        System.out.println("|" + menus[i] + "      " + "||" + "      " + harga[i] + "      " + "|");
                        System.out.println("===================================");
                        System.out.print("Apakah anda ingin memesan lagi ? Y/T : ");
                        tambahdata = input.nextLine();
                        i++;
                    } while (tambahdata.equalsIgnoreCase("Y"));

                

                System.out.println("");
                System.out.println("=====================================");
                System.out.println("|    Menu yang Anda pesan adalah    |");
                System.out.println("=====================================");
                System.out.println("Total pesan : " + i);
                for (int a = 0; a < i; a++) {
                    System.out.print(menus[a] + ", ");
                }
                System.out.println("");
                for (int b = 0; b < i; b++) {
                    hargatotal = hargatotal + harga[b];
                }
                System.out.println("Total yang harus anda bayar adalah   : Rp." + hargatotal);

            } else if (milih == 2) {
                for (int a = 0; a < minuman.length; a++) {
                    System.out.println(a + 1 + " " + minuman[a] + " " + harga_minum[a]);
                }

                do {
                    System.out.print("Pilihan menu anda  = ");
                    int pil = menu.nextInt();
                    if (pil < makanan.length) {
                        menus[i] = makanan[pil - 1];
                        harga[i] = harga_makanan[pil - 1];
                    } else if (pil == makanan.length) {
                        menu();
                    } else {
                        System.out.println("Maaf pilihan menu anda tidak tepat ");
                        menus[i] = "Tidak Ada";
                        harga[i] = 0;
                    }
                    Scanner input = new Scanner(System.in);
                    System.out.println("=====================================");
                    System.out.println("|    Menu yang Anda pesan adalah    |");
                    System.out.println("=====================================");
                    System.out.println("|        MENU     ||     HARGA      |");
                    System.out.println("|" + menus[i] + "      " + "||" + "      " + harga[i] + "      " + "|");
                    System.out.println("===================================");
                    System.out.print("Apakah anda ingin memesan lagi ? Y/T : ");
                    tambahdata = input.nextLine();
                    i++;
                } while (tambahdata.equalsIgnoreCase("Y"));

                System.out.println("");
                System.out.println("Menu yang anda pesan adalah          : " + i);
                for (int a = 0; a < i; a++) {
                    System.out.print(menus[a] + ", ");
                }
                System.out.println("");
                for (int b = 0; b < i; b++) {
                    hargatotal = hargatotal + harga[b];
                }
                System.out.println("Total yang harus anda bayar adalah   : Rp." + hargatotal);

            }
        } while (keluar = false);
        System.out.println("Terimakasih");
    }

    public static void main(String[] args) {

        menu();
    }

}
