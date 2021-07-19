package DataStructures;

import java.util.NoSuchElementException;

public class LinkedList<T> {

    class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }
    }

    Node head;
    private int len = 0;

    public int length(){
        return len;
    }

    public void append(T data) {
        Node newNode = new Node(data);
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        len++;
    }

    public void prepend(T data) {
        Node newroot = new Node(data);
        newroot.next = head;
        head = newroot;
    }

    public void delete(T data) {
        Node curr = head;
        boolean deleted = false;

        if (head == null) return;

        if (head.data == data) {
            head = head.next;
            return;

        }

        while (curr.next != null) {
            if (curr.next == data) {
                curr.next = curr.next.next;
                deleted = true;
            }
            curr = curr.next;
        }
        if (!deleted)
            throw new NoSuchElementException();
    }

    public void deleteAtIndex(int idx) {

    }

}