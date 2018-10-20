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

public class Algo2 {

    /**
     * @param args the command line arguments
     */
    static void push(Stack st, int a) {
        st.push(new Integer(a));
        System.out.println("push " + a + ")");
        System.out.println("Stack " + st);
    }

    static void pop(Stack st) {
        if (st.isEmpty()) {
            System.out.println("stack kosong");
        } else {
            System.out.println("pop --> ");
            Integer a = (Integer) st.pop();
            System.out.println(a);
            System.out.println("Stack " + st);
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println("Stack " + st);

        push(st, 5);
        push(st, 1);
        push(st, 4);
        pop(st);
        pop(st);
    }

}
