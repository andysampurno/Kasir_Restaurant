/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andy Sampurno
 */
class Kucing {

    String nama;
    Kucing ibu;
}

public class test {

    public static void traverse(Kucing kucing) {
        while (kucing != null) {
            System.out.println(kucing.nama);
            kucing = kucing.ibu;
        }
    }

    public static void addAncestor(Kucing kucing, String ancestorName) {
        while (kucing.ibu != null) {
            kucing = kucing.ibu;
        }
        kucing.ibu = new Kucing();
        kucing.ibu.nama = ancestorName;
    }

    public static void main(String[] args) {
        Kucing shadowCat = new Kucing();
        shadowCat.nama = "Amanda";
        addAncestor(shadowCat, "Betty");
        addAncestor(shadowCat, "Cindy");
        addAncestor(shadowCat, "Donna");
        traverse(shadowCat);

    }
}
