package DataStructures;

import java.util.NoSuchElementException;

public class LinkedList<T> {

    class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }

        public boolean hasNext() {
            return next != null;
        }
    }

    Node head;
    private int len = 0;

    public int size() {
        return len;
    }

    public void clear() {
        head = null;
        len = 0;
    }

    public void append(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
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

        if (head == null)
            return;

        if (head.data == data) {
            head = head.next;
            return;

        }

        while (curr.next != null) {
            if (curr.next.data == data) {
                curr.next = curr.next.next;
                deleted = true;
                break;
            }
            curr = curr.next;
        }
        if (!deleted)
            throw new NoSuchElementException();
        len--;
    }

    public void deleteAtIndex(int idx) {
        if (idx >= len || idx < 0)
            throw new IndexOutOfBoundsException();
        if (idx == 0) {
            head = head.next;
            return;
        }
        Node curr = head, prev = head;
        while (idx > 0) {
            prev = curr;
            curr = curr.next;
            idx--;
        }
        prev.next = curr.next;
        len--;
    }

    public int find(T data) {
        Node curr = head;
        int i = 0;
        while (curr != null) {
            if (curr.data == data) {
                return i;
            }
            curr = curr.next;
        }
        return -1;
    }

    public void insertAtIndex(T data, int idx) {
        if (idx >= len || idx < 0)
            throw new IndexOutOfBoundsException();
        Node newNode = new Node(data);

        if (idx == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node curr = head, prev = head;
        while (idx > 0) {
            prev = curr;
            curr = curr.next;
            idx--;
        }
        newNode.next = curr;
        prev.next = newNode;
        len++;
    }

    public void reverse() {
        Node curr = head, prev = null, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    @Override
    public String toString() {
        String res = "";
        Node curr = head;
        while (curr != null) {
            res += curr.data;
            if (curr.next != null) {
                res += " -> ";
            }
            curr = curr.next;
        }
        return res;
    }
}