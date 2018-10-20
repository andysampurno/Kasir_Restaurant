/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;
import java.util.Scanner;
/**
 *
 * @author Andy Sampurno
 */
public class Latihan3 {
public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
                System.out.println("Maximal data Byte : "+Byte.MAX_VALUE);
		System.out.println("a. Masukkan sebuah angka byte : ");
		byte a = sc.nextByte();
		System.out.println("Maximal data Int : "+Integer.MAX_VALUE);
                System.out.println("b. Masukkan sebuah angka integer : ");
		int b = sc.nextInt();
		System.out.println("Maximal data float : "+Float.MAX_VALUE);
                System.out.println("c. Masukkan sebuah angka float : ");
		float c = sc.nextFloat();
                System.out.println("Maximal data double : "+Double.MAX_VALUE);
		System.out.println("d. Masukkan sebuah angka double : ");
		double d = sc.nextDouble();
                System.out.println("Maximal data char : "+Character.MAX_VALUE);
		System.out.println("e. Masukkan sebuah charakter : ");
		char e = sc.next().charAt(0);
}
}