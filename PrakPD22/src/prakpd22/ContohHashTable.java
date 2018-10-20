/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakpd22;

/**
 *
 * @author Andy Sampurno
 */
import java.util.Hashtable;
public class ContohHashTable {
    public static void main(String[] args){
        Hashtable<String,String> urutan = new Hashtable<String,String>();
        urutan.put("A1","NASI GORENG");
        urutan.put("A2","Mie Ayam");
        urutan.put("A3","Es Teler");
        urutan.put("A4","Es Teh");
        urutan.put("A5","Es Campur");
        urutan.put("A6","Es Lalapan");
        urutan.put("A7","Es Tahu Campur");
        urutan.put("A8","Es Nasi Pecel");
        
        System.out.println(urutan);
        
        System.out.println("Value of Key 'A4' = "+urutan.get("A4"));
        System.out.println("Is HashTable empty?"+urutan.isEmpty());
        urutan.remove("A3");
        urutan.remove("A5");
        System.out.println(urutan);
        System.out.println("Size of the Hashtable"+urutan.size());
    }
}
