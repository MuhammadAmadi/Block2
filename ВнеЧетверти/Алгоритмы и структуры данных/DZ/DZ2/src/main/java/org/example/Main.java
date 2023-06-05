package org.example;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        System.out.println(myLinkedList.ToString());
        myLinkedList.add(1);
        myLinkedList.add('f');
        myLinkedList.add(3.5);
        myLinkedList.add(4);
        myLinkedList.add(5);
        myLinkedList.add(6);
        System.out.println(myLinkedList.ToString());
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.pop(3).toString());
        System.out.println(myLinkedList.ToString());
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.contains(7));
        MyLinkedList myLinkedList1 = myLinkedList.reversed();
        System.out.println(myLinkedList1.ToString());

    }
}
