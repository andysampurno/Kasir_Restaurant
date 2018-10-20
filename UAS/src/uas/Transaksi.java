/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

/**
 *
 * @author Andy Sampurno
 */
public class Transaksi extends Custumer implements Barang {
        private int kodeBarang;
        private String namaBarang;
        private float harga;
 
        private int kodeTransaksi;
        private int banyak;
 
        //konstruktor
        public Transaksi(){}
 
        //dari kelas parent
        public Transaksi(int noId, String nama, String alamat)
        {
                super(noId, nama, alamat);
        }
 
        public void setTransaksi(int kodeTransaksi, int banyak)
        {
                this.kodeTransaksi = kodeTransaksi;
                this.banyak = banyak;
        }
 
        //total transaksi = banyaknya barang * harga barang
        public float totalTransaksi()
        {
                return (banyak*harga);
        }
 
        //override class interface
        public void setBarang(int kodeBarang, String namaBarang, float harga)
        {
                this.kodeBarang = kodeBarang;
                this.namaBarang = namaBarang;
                this.harga = harga;
        }
 
        //output
        public void cetakStruk()
        {
                System.out.println("Nama Pembeli                : " + super.getNama());
                System.out.println("Nama Barang                 : " + namaBarang);
                System.out.println("Banyak                      : " + banyak);
 
                System.out.println("Total Transaksi     : " + totalTransaksi());
        }

    @Override
    public void setBarang() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
