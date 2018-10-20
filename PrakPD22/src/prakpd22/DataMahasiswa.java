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

public class DataMahasiswa {

    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<String>();
        ArrayList<String> nrp = new ArrayList<String>();
        ArrayList<String> alt = new ArrayList<String>();
        nama.add("andy");
        nrp.add("171111012");
        alt.add("malang");
        nama.add("ronal");
        nrp.add("171111022");
        alt.add("kediri");
        nama.add("rey");
        nrp.add("171111032");
        alt.add("surabaya");
        nama.add("fajar");
        nrp.add("171111042");
        alt.add("magelang");
        nama.add("sanu");
        nrp.add("171111052");
        alt.add("gresik");

        alt.remove(0);
        
        Iterator i = nama.iterator();
        Iterator it = nrp.iterator();
        Iterator itr = alt.iterator();

        while (i.hasNext()) {
            System.out.println("nama : " + i.next());
            while (it.hasNext()) {
                System.out.println("nrp: " + it.next());

                while (itr.hasNext()) {
                    System.out.println("alamat : " + itr.next() + "\n");
                    break;
                }
                break;
            }

        }

    }
}
