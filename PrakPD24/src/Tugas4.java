/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andy Sampurno
 */
import java.util.*;

public class Tugas4 {

    public static void main(String[] args) {
        LinkedList a = new LinkedList();
        Scanner sc = new Scanner(System.in);
        Scanner sn = new Scanner(System.in);
        int jumlah;
        String sepeda, buku;
        System.out.println("  Antrian Sepeda  ");
        System.out.println("------------------");
        System.out.print(" Jumlah Antrian : ");
        jumlah = sc.nextInt();
        
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Pemilik Sepeda "+(i+1)+" : ");
            sepeda = sn.nextLine();
            a.push(new LinkedListNode(sepeda));
        }
        a.print();
        System.out.println("Sepeda : "+a.qpop().data);
        System.out.println("---------------------------");
        a.print();
        
        do{
            System.out.println("Sepeda : "+a.qpop().data);
        }while(a.tail != null);
        
        System.out.println("===========================");
        System.out.println("   Tumpukan Buku   ");
        System.out.println("===================");
        System.out.print(" Jumlah Tumpukan : ");
        jumlah = sc.nextInt();
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Nama Buku "+(i +1)+": ");
            buku = sn.nextLine();
            a.push(new LinkedListNode(buku));
            
        }
        
        a.print();
        System.out.println("Buku : "+a.spop().data);
        System.out.println("Output");
        a.print();
    }
}
