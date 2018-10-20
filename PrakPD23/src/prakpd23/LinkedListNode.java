/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakpd23;

/**
 *
 * @author Andy Sampurno
 */
public class LinkedListNode {

    LinkedListNode next;
    LinkedListNode prev;
    int data;

    LinkedListNode(int new_data) {
        this.data = new_data;
        this.prev = null;
        this.next = null;
    }

    LinkedListNode() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void set_prev(LinkedListNode other) {
        this.prev = other;
        if (other != null) {
            other.next = this;
        }
    }

    void set_next(LinkedListNode other) {
        this.next = other;
        if (other != null) {
            other.prev = this;
        }
    }

}
