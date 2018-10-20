/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo2;

/**
 *
 * @author Andy Sampurno
 */
import java.util.*;

public class test1 {

    static void push(Stack a, int x) {
        a.push(new Integer(x));
        System.out.println("mengisikan " + x );
        System.out.println("Data " + a+"\n");
    }

    static void pop(Stack a) {
        if (a.isEmpty()) {
            System.out.println("Kosong Boss");
        } else {
            System.out.println("mengeluarkan --->");
            Integer x = (Integer) a.pop();
            System.out.println(x);
            System.out.println("Sisa Data " + a);
        }

    }

    public static void main(String[] args) {
        Stack a = new Stack();
        System.out.println("Stack"+a);
        
        push(a, 5);
        push(a, 6);
        push(a,7);
        pop(a);
        pop(a);
    }
}
