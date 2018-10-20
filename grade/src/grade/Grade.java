/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grade;

import java.util.Scanner;

/**
 *
 * @author Andy Sampurno
 */
public class Grade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tugas, uts, uas, nrp;
        double nilaiakhir;
        tugas = 0;
        uts = 0;
        uas = 0;
        char grade = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan NRP : ");
        nrp = sc.nextInt();
        if (nrp != 0) {
            System.out.println("Masukkan Nilai Tugas Anda : ");
            tugas = sc.nextInt();
            if(tugas >= 0 && tugas <= 100){
            System.out.println("Masukkan Nilai uts Anda : ");
            uts = sc.nextInt();
            if(uts >=0 && uts <= 100){
            System.out.println("Masukkan Nilai uas Anda : ");
            uas = sc.nextInt();
            if(uas >= 0 && uas <=100){
                nilaiakhir = (tugas * 0.1 + uts * 0.3 + uas * 0.6);

                if (nilaiakhir >= 80 && nilaiakhir <= 100) {
                    grade = 'A';
                } else if ((nilaiakhir >= 70) && (nilaiakhir <= 79)) {
                    grade = 'B';
                } else if ((nilaiakhir >= 56) && (nilaiakhir <= 69)) {
                    grade = 'C';
                } else if ((nilaiakhir >= 44) && (nilaiakhir <= 55)) {
                    grade = 'D';
                } else if ((nilaiakhir >= 0) && (nilaiakhir <= 43)) {
                    grade = 'E';
                }

                //output
                System.out.println("_________________________________________________________");
                System.out.println("|NRP\t|Tugas\t|UTS\t|UAS\t|Nilai Akhir\t|Grade\t|");
                System.out.println("_________________________________________________________");
                System.out.println("|" + nrp + "\t|" + tugas + "\t|" + uts + "\t|" + uas + "\t|" + nilaiakhir + "\t\t|" + grade + "\t|");
                System.out.println("---------------------------------------------------------");

            }
            else{
                System.out.println("Nilai UAS Diluar Batas");
            }
            }
            else{
                System.out.println("Nilai UTS Diluar Batas");
            }
            }
            else {
                System.out.println("Nilai Tugas Diluar Batas");
            }
        } else {
            System.out.println("Maaf, salah input nrp");
        }
    }
}
