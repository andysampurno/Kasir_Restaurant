/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aktivitas3;
import java.util.Scanner;
/**
 *
 * @author Andy Sampurno
 */
public class Aktivitas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("====================================");
		System.out.println("1. Persegi");
		System.out.println("2. Persegi Panjang");
		System.out.println("3. Segitiga Sama Sisi");
		System.out.println("4. Segitiga Siku-Siku");
		System.out.println("5. Lingkaran");
		System.out.println("====================================");

		Scanner input = new Scanner(System.in);
		int pilihan = input.nextInt();
		if (pilihan == 1)
		{
			System.out.println("Rumus : s x s");
			int a;
			System.out.println("Masukkan Nilai S : ");
			int s = input.nextInt();
			a = s*s;
			System.out.println("Luas Persegi : "+a+"");
		}
		else if (pilihan ==2)
		{
			System.out.println("Rumus : P x L");
			int v = 0;
			System.out.println("Masukkan Panjang : ");
			int panjang = input.nextInt();
			System.out.println("Masukkan Lebar : ");
			int lebar = input.nextInt();
			v = panjang * lebar;
			System.out.println("Luas Persegi Panjang :"+v+"");
		}
		else if (pilihan ==3)
		{
			System.out.println("Rumus : 1/2*alas*tinggi");
			double l;
			System.out.println("Masukkan Alas : ");
			double la = input.nextDouble();
			System.out.println("Masukkan Tinggi : ");
			double T = input.nextDouble();
			l = 0.5*la*T;
			System.out.println("Luas Segitiga Sama Sisi : "+l+"");
		}
		else if (pilihan ==4)
		{
			System.out.println("Rumus : 1/2*alas*tinggi");
			double tab;
			System.out.println("Masukkan Alas : ");
			double jari = input.nextDouble();
			System.out.println("Masukkan nilai Tinggi : ");
			double Ti = input.nextDouble();
			tab = 0.5*jari*Ti;
			System.out.println("Luas Segitiga Siku-Siku : "+tab+"");
		}
		else if (pilihan ==5)
		{
			System.out.println("Rumus : 22/7*r*r");
			double ker;
			System.out.println("Masukkan Jari-Jari : ");
			double jar = input.nextDouble();
			ker = 22/7*jar*jar;
			System.out.println("Luas Lingkaran : "+ker+"");
		}
	}	
    }
    

