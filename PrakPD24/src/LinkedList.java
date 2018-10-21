/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andy Sampurno
 */
public class LinkedList {
    LinkedListNode head;
    LinkedListNode tail;

    LinkedList() {
        this.head = null;
        this.tail = null;
    }

    void print() {
        LinkedListNode current = this.head;
        while (current != null) {
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println("");
    }

    void push(LinkedListNode new_node) {
        if (this.head == null && this.tail == null) {
            tail = new_node;
            head = new_node;
        } else {
            tail.next = new_node;
            new_node.prev = tail;
            tail = new_node;
        }
    }

    LinkedListNode qpop() {
        LinkedListNode taken = null;
        if (this.head == null && this.tail == null) {
            taken = null;
        } else if (this.head == this.tail) {
            taken = head;
            head = null;
            tail = null;
        } else {
            taken = head;
            head = head.next;
        }
        return taken;
    }

    LinkedListNode spop() {
        LinkedListNode taken = null;
        if (this.head == null && this.tail == null) {
            taken = null;
        } else if (this.head == this.tail) {
            taken = tail;
            head = null;
            tail = null;
        } else {
            taken = tail;
            tail = tail.prev;
        }
        return taken;
    }
}


