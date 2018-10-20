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

public class MataKuliah {

    public static void main(String[] args) {
        Hashtable<String, String> data = new Hashtable<String, String>();

        data.put("1", "Algo");
        data.put("2", "PD");
        data.put("3", "BD");
        data.put("4", "APSI");
        data.put("5", "AGAMA");

        System.out.println(data+"\n");

        data.remove("3");
        System.out.println(data);

    }
}
