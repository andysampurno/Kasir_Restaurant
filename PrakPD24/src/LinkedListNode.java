/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andy Sampurno
 */
public class LinkedListNode {
    LinkedListNode next;
    LinkedListNode prev;
    String data;

    LinkedListNode(String new_data) {
        this.data = new_data;
        this.prev = null;
        this.next = null;
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
            other.next = this;
        }
    }
}
