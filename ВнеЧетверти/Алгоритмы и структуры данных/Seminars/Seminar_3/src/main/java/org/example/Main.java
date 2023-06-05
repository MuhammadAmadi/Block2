package org.example;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        System.out.println(myLinkedList.ToString());
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);
        myLinkedList.add(6);
        System.out.println(myLinkedList.ToString());
        System.out.println(myLinkedList.pop(3));
        System.out.println(myLinkedList.ToString());
    }
}
