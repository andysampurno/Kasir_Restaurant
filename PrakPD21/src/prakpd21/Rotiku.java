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
public class Rotiku {

    String warna;
    String rasa;
    int berat;
    double harga;

    void beriWarna(String warnaRoti) {
        warna = warnaRoti;
    }

    void beriRasa(String rasaRoti) {
        rasa = rasaRoti;
    }

    void timbangBerat(int beratRoti) {
        berat = beratRoti;
    }

    void hargaJual(double hargaRoti) {
        harga = hargaRoti;
    }

    void infoRoti() {
        System.out.println(
                "Warna Roti : " + warna + "\n"
                + "Rasa Roti : " + rasa + "\n"
                + "Berat Roti : " + berat + "\n"
                + "Harga Roti : RP." + harga);
    }
    
    public static void main(String[] args) {
        Rotiku roti = new Rotiku();
        roti.beriWarna("Cokelat");
        roti.beriRasa("Pisang Cokelat");
        roti.timbangBerat(50);
        roti.hargaJual(5000);
        roti.infoRoti();
    }
}
