package org.example;

public class MyLinkedList {


    private static class Node<T>{
        T value;
        Node next;

        Node(T value){
            this.value = value;
        }
    }


    public int size(){
        Node currentNode = head;
        int length = 0;
        while (currentNode != null){
            currentNode = currentNode.next;
            length++;
        }
        return length;

    }

    public <T> boolean contains(T value){
        Node currentNode = head;
        while (currentNode != null){
            if (currentNode.value == value){
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public MyLinkedList reversed(){
        Node currentNode = head;
        if (currentNode == null || currentNode.next == null){
            return MyLinkedList.this;
        }
        MyLinkedList myLinkedList = new MyLinkedList();
        reversed(currentNode, myLinkedList);
        return myLinkedList;
    }

    private void reversed(Node node, MyLinkedList myLinkedList){
        if (node != null){
            reversed(node.next, myLinkedList);
            myLinkedList.add(node.value);
        }
    }


    private Node head;


    public <T> void add (T value){
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


    public <T> T popFirst(){
        return pop(0);
    }


    public <T> T pop(int index){
        if (index >= 0 && head != null){
            if (index == 0){
                T pop = (T) head.value;
                head = head.next;
                return pop;
            }
            Node currentNode = head;
            int currentIndex = 1;
            while (currentNode.next != null){
                if (currentIndex == index){
                    T pop = (T) currentNode.next.value;
                    currentNode.next = currentNode.next.next;
                    return pop;
                }
                currentNode = currentNode.next;
                currentIndex++;
            }
        }
        throw new IndexOutOfBoundsException(index);
    }


    public <T> T getFirst(){
        return get(0);
    }


    public <T> T get(int index){
        Node currentNode = head;
        int currentIndex = 0;

        if (index >= 0 && currentNode != null){
            while (currentNode != null && currentIndex < index){
                currentNode = currentNode.next;
                currentIndex++;
            }

            if (currentIndex == index && currentNode != null){
                return (T) currentNode.value;
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