public class TCNode {

    Node head;
    Node tail;

    public void push(int value){
        Node node = new Node();
        node.value = value;
        node.next = head;
        head.previous = node;
        head = node;
    }


    public Integer peek (){
        Integer result = null;
        if (tail != null){
            result = tail.value;
            tail.previous.next = null;
            tail = tail.previous;
        }
        return result;
    }


    public void add(int value){
        Node node = new Node();
        node.value = value;
        if(head == null){
            head = node;
        } else {
            tail.next = node;
            node.previous = tail;
        }
        tail = node;
    }

    public void add(int value, Node node){
        Node nextNode = node.next;
        Node newNode = new Node();
        newNode.value = value;
        node.next = newNode;
        newNode.previous = node;
        if(nextNode == null){
            tail = newNode;
        } else {
            nextNode.previous = newNode;
            newNode.next = nextNode;
        }
    }

    public void delete(Node node){
        Node previousNode = node.previous;
        Node nextNode = node.next;
        if (previousNode == null){
            nextNode.previous = null;
            head = nextNode;
        } else {
            if (nextNode == null){
                previousNode.next = null;
                tail = previousNode;
            } else {
                previousNode.next = nextNode;
                nextNode.previous = previousNode;
            }
        }

    }

    public void revert(){
        Node currentNode = head;
        while (currentNode != null){
            Node nextNode = currentNode.next;
            Node previousNode = currentNode.previous;
            currentNode.next = previousNode;
            currentNode.previous = nextNode;
            if (previousNode == null){
                tail = currentNode;
            }
            if (nextNode == null){
                head = currentNode;
            }
            currentNode = nextNode;
        }
    }

    public Node find(int value){
        Node currentNode = head;
        while (currentNode != null){
            if (currentNode.value == value){
                return currentNode;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

    public class Node{
        int value;
        Node next;
        Node previous;
    }
}