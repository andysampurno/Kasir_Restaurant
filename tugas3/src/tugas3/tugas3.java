/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;
import java.util.Scanner;
/**
 *
 * @author Andy Sampurno
 */
public class tugas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int hargabarang = 0;
        int jumlahbeli = 0;
        double diskon = 0;
        int pembayaran = 0;
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Harga Barang : ");
        hargabarang = sc.nextInt();
        System.out.println("Masukkan Jumlah Beli : ");
        jumlahbeli = sc.nextInt();
        System.out.println("Masukkan Diskon berapa % :  ");
        diskon = sc.nextDouble();
        
        double d = diskon/100;
        double a = hargabarang * jumlahbeli * d ;
        double b = hargabarang * jumlahbeli - a;
        
        System.out.println("Jumlah pembayaran : "+b);
        System.out.println("Masukkan Uang Pembayaran : ");
        pembayaran = sc.nextInt();
        double kembalian = pembayaran - b ;
        System.out.println("Kembalian Anda : "+kembalian);
    }
    
}
