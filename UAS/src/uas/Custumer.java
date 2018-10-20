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
public  class Custumer {
    
   private int noId;
        private String nama;
        private String alamat;
 
        //konstruktor
        public Custumer(){}
 
        public Custumer(int noId, String nama, String alamat)
        {
                this.noId = noId;
                this.nama = nama;
                this.alamat = alamat;
        }
 
        //proses get set
        public int getNoId(){return noId;}
        public void setNoId(int noId)
        {
                this.noId = noId;
        }
 
        public String getNama(){return nama;}
        public void setNama(String nama)
        {
                this.nama = nama;
        }
 
        public String getAlamat(){return alamat;}
        public void setAlamat(String alamat)
        {
                this.alamat = alamat;
        }
}

