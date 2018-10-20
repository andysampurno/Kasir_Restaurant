/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakpd21;

/**
 *
 * @author Andy Sampurno
 */
public class Buku2 {

    String namaPengarang;
    String judulBuku;
    int tahunTerbit;
    int cetakanKe;
    double hargaJual;

    Buku2(String nP, String jB, int tT, int cK, double hJ) {
        namaPengarang = nP;
        judulBuku = jB;
        tahunTerbit = tT;
        cetakanKe = cK;
        hargaJual = hJ;
    }

    void show() {
        System.out.println("Nama Penggarang : " + namaPengarang);
        System.out.println("Judul Buku      : " + judulBuku);
        System.out.println("Tahun Terbit    : " + tahunTerbit);
        System.out.println("Cetakan Ke      : " + cetakanKe);
        System.out.println("Harga Jual      : Rp." + hargaJual);
    }

    public static void main(String[] args) {
        Buku b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;
        b1 = new Buku("Erlangga", "Hujan", 2016, 100, 100000);
        System.out.println("=========================");
        b1.show();
        b2 = new Buku("SIDU", "Hujan", 2016, 100, 100000);
        System.out.println("=========================");
        b1.show();
        b3 = new Buku("Erlangga", "Hujan", 2016, 100, 100000);
        System.out.println("=========================");
        b1.show();
        b4 = new Buku("Erlangga", "Hujan", 2016, 100, 100000);
        System.out.println("=========================");
        b1.show();
        b5 = new Buku("Erlangga", "Hujan", 2016, 100, 100000);
        System.out.println("=========================");
        b1.show();
        b6 = new Buku("Erlangga", "Hujan", 2016, 100, 100000);
        System.out.println("=========================");
        b1.show();
        b7 = new Buku("Erlangga", "Hujan", 2016, 100, 100000);
        System.out.println("=========================");
        b1.show();
        b8 = new Buku("Erlangga", "Hujan", 2016, 100, 100000);
        System.out.println("=========================");
        b1.show();
        b9 = new Buku("Erlangga", "Hujan", 2016, 100, 100000);
        System.out.println("=========================");
        b1.show();
        b10 = new Buku("Erlangga", "Hujan", 2016, 100, 100000);
        System.out.println("=========================");
        b1.show();
    }
}
