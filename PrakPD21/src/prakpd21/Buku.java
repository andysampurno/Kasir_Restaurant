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
public class Buku {

    String namaPengarang;
    String judulBuku;
    int tahunTerbit;
    int cetakanKe;
    double hargaJual;
    
    Buku(String nP, String jB, int tT, int cK, double hJ) {
        namaPengarang = nP;
        judulBuku = jB;
        tahunTerbit = tT;
        cetakanKe = cK;
        hargaJual = hJ;
    }
    
    void show(){
        System.out.println("Nama Penggarang : "+namaPengarang);
        System.out.println("Judul Buku      : "+judulBuku);
        System.out.println("Tahun Terbit    : "+tahunTerbit);
        System.out.println("Cetakan Ke      : "+cetakanKe);
        System.out.println("Harga Jual      : Rp."+hargaJual);
    }

    public static void main(String[] args) {
     Buku b1;
     b1 = new Buku("Erlangga","Hujan",2016,100,100000);

        b1.show();
    }
}
