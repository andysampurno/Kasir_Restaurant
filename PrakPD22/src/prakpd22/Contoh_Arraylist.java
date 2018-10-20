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
import java.util.*;

public class Contoh_Arraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> al = new ArrayList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        Iterator itr = al.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
