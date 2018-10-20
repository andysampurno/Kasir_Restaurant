/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floorandceiling;
import java.util.Scanner;
import java.lang.*;
/**
 *
 * @author Andy Sampurno
 */
public class floorandceiling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        double a =0; 
        System.out.println("Masukkan bilangan : ");
        a = sc.nextDouble();

        if ( a <= 0)
         {
        System.out.println("nilai floor : "+Math.round(a));
        System.out.println("nilai ceiling : "+(Math.round(a)+1));
        }
        else if (a >= 0)
            {
                  System.out.println("nilai floor : "+(Math.round(a)-1));
                   System.out.println("nilai ceiling : "+Math.round(a));
            }
        else (a = 0 )
                {
                System.out.println("nilai floor : "+(Math.round(a)));
                System.out.println("nilai ceiling : "+(Math.round(a)-1));
                }

    }
    
}
