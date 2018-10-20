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

public class BukuAlamat {

    public static void main(String[] args) {
        Hashtable<Integer, String> buku = new Hashtable<Integer, String>();

        buku.put(1, "1. Jl.Tirto Taruno");
        buku.put(2, "2. Jl.Tirto Mulyo");
        buku.put(3, "3. Jl.Tirto Waluyo");
        buku.put(4, "4. Jl.Tirto Rahayu");
        buku.put(5, "5. Jl.Tirto Sari");
        buku.put(6, "6. Jl.Kenanga");
        buku.put(7, "7. Jl.Melati");
        buku.put(8, "8. Jl.Mawar");
        buku.put(9, "9. Jl.Anggrek");
        buku.put(10, "10. Jl.Tulip");

        for (int i = 1; i <= buku.size(); i +=2) {
            System.out.println(buku.get(i));
        }
        System.out.println("-------------------------");
        System.out.println("Data sesudah dihapus");
        System.out.println("-------------------------");
        for (int i = 1; i <= buku.size(); i += 2) {
            buku.remove(5);
            buku.remove(9);
            if (buku.get(i) != null) {
                System.out.println(buku.get(i));
            }
        }
    }
}
