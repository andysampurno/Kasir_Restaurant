/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phytagoras;

/**
 *
 * @author Andy Sampurno
 */
import java.util.Scanner;

public class vocal extends vocal1 {

    public static void main(String[] args) {
        konsonan();
    }

}

class vocal1 {

    static void konsonan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Huruf : ");
        char huruf = sc.next().charAt(0);
        if (huruf == 'a' || huruf == 'i' || huruf == 'u' || huruf == 'e' || huruf == 'o') {
            System.out.println(huruf + ": Termasuk Jenis Huruf Vokal ");
        } else {
            System.out.println(huruf + ": Termasuk Jenis Huruf Konsonan ");
        }

    }
}
