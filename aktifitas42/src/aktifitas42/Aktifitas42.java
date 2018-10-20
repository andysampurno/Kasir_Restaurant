/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aktifitas42;

/**
 *
 * @author Andy Sampurno
 */
public class Aktifitas42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("Pengulangan dengan for arah indeks Naik");
      for (int i= 1; i<=5; i++)
      {
          System.out.println("Indeks naik ke : "+i );
      }
      System.out.println("Pengulangan dengan for arah Indeks turun");
      for (int i = 5;  i > 0; --i )
      {
          System.out.println("Indeks turun ke : "+i);
      }
    }
    
}
