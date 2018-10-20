/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan6;

import java.util.*;

/**
 *
 * @author Andy Sampurno
 */
public class Latihan6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String[] nrp = new String[5];
        int[] tugas = new int[5];
        int[] uts = new int[5];
        int[] uas = new int[5];
        double[] nilai_akhir = new double[5];
        char[] grade = new char[5];

        for (int x = 0; x < 5; x++) {
            System.out.print("Masukkan NRP\t: ");
            nrp[x] = sc.next();
            System.out.print("Masukkan Nilai Tugas\t: ");
            tugas[x] = sc.nextInt();
            System.out.print("Masukkan Nilai UTS\t: ");
            uts[x] = sc.nextInt();
            System.out.print("Masukkan Nilai UAS\t: ");
            uas[x] = sc.nextInt();
            nilai_akhir[x] = (tugas[x] * 0.1) + (uts[x] * 0.3) + (uas[x] * 0.6);

            if (nilai_akhir[x] > 43) {
                if (nilai_akhir[x] > 55) {
                    if (nilai_akhir[x] > 69) {
                        if (nilai_akhir[x] > 79) {
                            grade[x] = 'A';
                        } else {
                            grade[x] = 'B';
                        }
                    } else {
                        grade[x] = 'C';
                    }
                } else {
                    grade[x] = 'D';

                }
            } else {
                grade[x] = 'E';
            }
            System.out.println("");
        }
            System.out.println("_________________________________________________________");
            System.out.println("|NRP\t|Tugas\t|UTS\t|UAS\t|Nilai Akhir\t|Grade\t|");
        for (int x = 0; x < 5; x++) {
            System.out.println("_________________________________________________________");
            System.out.println("|" + nrp[x] + "\t|" + tugas[x] + "\t|" + uts[x] + "\t|" + uas[x] + " \t|" + nilai_akhir[x] + "\t\t|" + grade[x] + "\t|");
        }
    }
}
