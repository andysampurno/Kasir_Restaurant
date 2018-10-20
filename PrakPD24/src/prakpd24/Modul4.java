/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakpd24;

/**
 *
 * @author Andy Sampurno
 */
import java.util.*;

public class Modul4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList a = new LinkedList();

//        a.print(); // should show nothing
//        System.out.println(a.qpop()); // should show null
//        System.out.println(a.spop()); // should show null
//        a.push(new LinkedListNode(5));
//        a.push(new LinkedListNode(4));
//        a.print(); // should show "5 4"
//        System.out.println(a.spop().data); // should show "4"
//        a.push(new LinkedListNode(4));
//        System.out.println(a.qpop().data); // should show "5"
//        a.print(); // should show "
        System.out.println("Masukkan Jumlah Data : ");
        int data = sc.nextInt();
        System.out.println("");
        for (int i = 1; i <= data; i++) {
            System.out.println("Masukkan angka -"+i);
            int angka = sc.nextInt();
            a.push(new LinkedListNode(angka));
        }
        
        System.out.println("Pilihan");
        System.out.println("1. Queue");
        System.out.println("2. Stack");
        System.out.println("Masukkan Pilihan");
        int pilih = sc.nextInt();
        if(pilih == 1){
            System.out.println(a.qpop().data);
            a.print();
        }else{
            System.out.println(a.spop().data);
            a.print();
        }
    }
}
