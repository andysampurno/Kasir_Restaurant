/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistika;

/**
 *
 * @author Andy Sampurno
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Statistika {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.###");

        int elemen;

        System.out.println("---------- PROGRAM PERHITUNGAN PRODUCT MOMENT ----------");
        System.out.println("");
        do {
        System.out.print("Masukkan Jumlah Masing Masing Data : ");
        elemen = input.nextInt();
        } while (elemen > 20);

        int indeks = 1;
        int[] x = new int[elemen];
        int[] y = new int[elemen];

        int[] x2 = new int[elemen];
        int[] y2 = new int[elemen];

        int[] tx = new int[elemen];
        int[] ty = new int[elemen];

        int[] tx2 = new int[elemen];
        int[] ty2 = new int[elemen];

        int[] xy = new int[elemen];
        int[] txy = new int[elemen];

        double[] r = new double[elemen];

        System.out.println("Masukkan Data Pertama : ");
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan Elemen ke-" + (indeks + i) + "\t : ");
            x[i] = input.nextInt();
            x2[i] = (int) Math.pow(x[i], 2);
            tx[indeks] += x[i];
            tx2[indeks] += x2[i];
        }
        System.out.println("");
        System.out.println("Masukkan Data Kedua : ");
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan Elemen ke-" + (indeks + i) + "\t : ");
            y[i] = input.nextInt();
            y2[i] = (int) Math.pow(y[i], 2);
            ty[indeks] += y[i];
            ty2[indeks] += y2[i];

            //Menghitung  x*y
            xy[i] = x[i] * y[i];

            //Menghitung hasil total x*y 
            txy[indeks] += xy[i];
        }

        r[indeks] = ((elemen * txy[indeks]) - (tx[indeks] * ty[indeks]))
                / (Math.sqrt(((elemen * tx2[indeks]) - (Math.pow(tx[indeks], 2))) * ((elemen * ty2[indeks]) - (Math.pow(ty[indeks], 2)))));

        System.out.println("_________________________________________________________________________________");
        System.out.println("| No\t\t| X\t| Y\t| X^2\t\t| Y^2\t\t\t| XY\t|");
        System.out.println("|_______________________________________________________________________________|");
        for (int j = 0; j < elemen; j++) {
            System.out.println("| " + (indeks + j) + "\t\t| " + x[j] + "\t| " + y[j] + "\t| " + x2[j] + "\t\t| " + y2[j] + "\t\t| " + xy[j] + "\t|");
        }

        System.out.println("|_______________________________________________________________________________|");
        System.out.println("| Statistik\t| X\t| Y\t| X^2\t\t| Y^2\t\t\t| XY\t|");
        System.out.println("|_______________________________________________________________________________|");
        System.out.println("| Jumlah" + "\t| " + tx[indeks] + "\t| " + ty[indeks] + "\t| " + tx2[indeks] + "\t\t| " + ty2[indeks] + "\t\t| " + txy[indeks] + "|");
        System.out.println("|_______________________________________________________________________________|");

        System.out.println("");

        System.out.println("");
        System.out.println("Rumus Pearson Product Moment :");
        System.out.println("\t nΣXY-(ΣX)(ΣY)");
        System.out.println("_______________________________________");
        System.out.println("√{nΣX^2 - (ΣX)^2}.{{nΣY^2 - (ΣY)^2}}");
        System.out.println("");
        System.out.println("Hasil Perhitungan Rasio : " + df.format(r[indeks]));
    }
}
