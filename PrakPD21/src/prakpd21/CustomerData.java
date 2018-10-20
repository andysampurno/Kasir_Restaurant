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
public class CustomerData {
    String nama;
    String alamat;
    String tgl_lahir;
    String pekerjaan;
    int gaji;
    
    CustomerData(String nm, String al, String tgl, String pk, int gj){
        nama = nm;
        alamat =  al;
        tgl_lahir = tgl;
        pekerjaan = pk;
        gaji = gj;
    }
    
    void info(){
        System.out.println("Nama            : "+nama);
        System.out.println("Alamat          : "+alamat);
        System.out.println("Tanggal Lahir   : "+tgl_lahir);
        System.out.println("Pekerjaan       : "+pekerjaan);
        System.out.println("GAJI            : Rp."+gaji);
    }
    public static void main(String[] args){
        CustomerData cd1,cd2,cd3;
        cd1 = new CustomerData("Andy","Malang","09-12-1999","Programmer",100000000);
        cd2 = new CustomerData("Ronal","Surabaya","23-04-1999","Juru Parkir",123000000);
        cd3 = new CustomerData("Reyhan","Kediri","29-01-1998","Renternir",523000000);
        cd1.info();
        System.out.println("-------------------------------------");
        cd2.info();
        System.out.println("-------------------------------------");
        cd3.info();
    }
}
