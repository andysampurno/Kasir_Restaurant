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

public class Tugas3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data, jml_data;
        LinkedList dt = new LinkedList();

        System.out.print("Masukkan jumlah data : ");
        jml_data = sc.nextInt();

        for (int i = 0; i < jml_data; i++) {
            System.out.print("Masukkan data : ");
            data = sc.nextInt();
            dt.push(new LinkedListNode(data));
        }
        System.out.println("");
        System.out.println("----- Data Awal -----");
        dt.print();
        System.out.println("----- Bubble Sort -----");
        dt.bubbleSortList();
        dt.print();
        System.out.println("----- Quick Sort -----");
        dt.quickSort(dt.head);
        dt.print();
    }
}
