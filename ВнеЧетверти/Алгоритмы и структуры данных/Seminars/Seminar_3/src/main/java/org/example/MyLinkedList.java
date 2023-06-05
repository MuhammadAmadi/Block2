package org.example;

public class MyLinkedList {


    private class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }


    private Node head;


    public void add (int value){
        if (head == null){
            head = new Node(value);
        } else {
            Node lastNode = findLast();
            lastNode.next = new Node(value);
        }
    }


    private Node findLast() {
        Node currentNode = head;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
        return currentNode;
    }


    public int popFirst(){
        return pop(0);
    }


    public int pop(int index){
        if (index >= 0 && head != null){
            if (index == 0){
                int pop = head.value;
                head = head.next;
                return pop;
            }
            Node currentNode = head;
            int currentIndex = 1;
            while (currentNode.next != null){
                if (currentIndex == index){
                    int pop = currentNode.next.value;
                    currentNode.next = currentNode.next.next;
                    return pop;
                }
                currentNode = currentNode.next;
                currentIndex++;
            }
        }
        throw new IndexOutOfBoundsException(index);
    }


    public int getFirst(){
        return get(0);
    }


    public int get(int index){
        Node currentNode = head;
        int currentIndex = 0;

        if (index >= 0 && currentNode != null){
            while (currentNode != null && currentIndex < index){
                currentNode = currentNode.next;
                currentIndex++;
            }

            if (currentIndex == index && currentNode != null){
                return currentNode.value;
            }
        }

        throw new IndexOutOfBoundsException(index);
    }


    public String ToString (){
        StringBuilder result = new StringBuilder("[");
        Node currentNode = head;
        while (currentNode != null){
            result.append(currentNode.value).append(" -> ");
            currentNode = currentNode.next;
        }
        int length = result.length();
        if (length > 4) {
            result.delete(length - 4, length);
        }
        result.append("]");

        return result.toString();
    }
}