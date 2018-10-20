/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakpd23;

/**
 *
 * @author Andy Sampurno
 */
import java.util.*;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList a = new LinkedList();
        a.print(); // should show nothing
        System.out.println("Masukkan Jumlah Data : ");
        int angka, jmldat, search;
        jmldat = sc.nextInt();
        for (int i = 0; i < jmldat; i++) {
            System.out.println("Masukkan angka : ");
            angka = sc.nextInt();
            a.insert(new LinkedListNode(angka));
        }
//        a.print(); // should show 4 5 6 7
//        a.delete(a.head);
//        a.print(); // should show 5 6 7
//        a.delete(a.tail.prev);
//        a.print(); // should show 5 7
//        a.delete(a.tail);
//        a.print(); // should show 5
//        a.delete(a.head);
//        a.print(); // should show nothing

        System.out.println("---------------------");
        a.print();
        System.out.println("---------------------");
        System.out.println("Cari Data");
        search = sc.nextInt();
        if (a.find_node_by_data(search) == true) {
            System.out.println("Ada");
        }else{
            System.out.println("Tidak Ada");
        }

    }
}
