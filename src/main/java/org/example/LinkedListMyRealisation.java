package org.example;

public class LinkedListMyRealisation {
    class Node {
        int data;
        Node next;
    }

    public static void printList(Node head) {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + "->");
            ptr = ptr.next;
        }
        System.out.println("null");
    }

    // глобальный заголовок
    public static Node head;

    public Node push(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        return newNode;
    }

    public void constructList(int[] keys) {
        // начинаем с конца массива
        for (int i = keys.length - 1; i >= 0; i--) {
            head = push(keys[i]);
        }
    }

}

