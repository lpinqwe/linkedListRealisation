package org.example;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        LinkedList<String> cars = new LinkedList<String>();
        int[] keys = { 1, 2, 3, 4 };
LinkedListMyRealisation my_list = new LinkedListMyRealisation();
        my_list.constructList(keys);
        my_list.printList(my_list.head);

    }
}