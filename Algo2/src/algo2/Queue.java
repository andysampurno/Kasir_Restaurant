/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo2;
import java.util.*;
/**
 *
 * @author Andy Sampurno
 */
public class Queue {
    static int[] queue;
	static int ukuran;
	static int top;
	
	static void inisialisasi(int i){
		ukuran = i;
		queue = new int[ukuran];
		top = 0;
	}
	static boolean isEmpty(){
		return top <= 0;
	}
	static boolean isFully(){
		return top >= ukuran;
	}
	static void insert(int i){
		if(isFully()){
			System.out.println("maaf antrian penuh");
		}else{
			System.out.println("nilai "+i+" masuk antrian");
			queue[top++] = i;
		}
	}
	static void pop(){
		if(isEmpty()){
			System.out.println("maaf antrian kosong");
		}else{
			int pop = queue[0];
			int i = 1;
			System.out.println("nilai "+pop+" keluar antrian");
			while(i < top){
				queue[i-1] = queue[i];
				i++;
			}
			top--;
		}
	}
	static void find(int i){
		int temp = 0;
		boolean hasil = false;
		while(temp < top){
			if(i == queue[temp]){
				hasil = true;
				break;
			}
			temp++;
		}
		if(hasil){
			System.out.println("nilai "+i+" ditemukan di antrian ke "+(temp+1));
		}else{
			System.out.println("antrian tidak ketemu");
		}		
	}
	static void display(){
		System.out.println("isi antrian: ");
		int i = 0;
		while(i < top){
			System.out.println("antrian ke "+(i+1)+" :"+queue[i]);
			i++;
		}
	}
	public static void main(String[] args){
		Queue a = new Queue();
		a.inisialisasi(4);
		a.pop();
		a.insert(12);
		a.insert(5);
		a.insert(2);
		a.insert(3);
		a.display();
		a.insert(9);
		a.pop();
		a.display();
		a.find(3);
		a.find(13);
		
	}
}
