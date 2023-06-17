import java.util.*;

public class Tree <T extends Comparable<? super T>> {
    private class Node{
        T value;
        Node left;
        Node right;

        public Node (T value){
            this.value = value;
        }
    }

    private Node root;

    public void add(T value){
        if (root == null){
            root = new Node(value);
            return;
        }
        add(root, value);
    }

    private void add(Node currentNode, T value){
        if (value.compareTo(currentNode.value) < 0){
            if (currentNode.left == null){
                currentNode.left = new Node(value);
            } else {
                add(currentNode.left, value);
            }
        } else if (value.compareTo(currentNode.value) > 0) {
            if (currentNode.right == null){
                currentNode.right = new Node(value);
            } else {
                add(currentNode.right, value);
            }

        }
    }

    public boolean contains(T value){
        return findNode(root, value) != null;
    }

    private Node findNode(Node currentNode, T value){
        if (currentNode == null){
            return null;
        }
        if (currentNode.value == value){
            return currentNode;
        } else if (currentNode.value.compareTo(value) > 0) {
            return findNode(currentNode.left, value);
        } else {
            return findNode(currentNode.right, value);
        }
    }

    public void remove(T value){
        root = removeNode(root, value);
    }

    private Node removeNode(Node currentNode, T value){
        if (currentNode == null) return null;

        if (value.compareTo(currentNode.value) < 0){
            currentNode.left = removeNode(currentNode.left, value);
            return currentNode;
        } else if (value.compareTo(currentNode.value) > 0){
            currentNode.right = removeNode(currentNode.right, value);
            return  currentNode;
        }

        if (currentNode.left == null && currentNode.right == null){
            return null;
        }

        if (currentNode.left != null && currentNode.right == null){
            return currentNode.left;
        }

        if (currentNode.left == null){
            return currentNode.right;
        }

        currentNode.value = findFirst(currentNode.right).value;
        currentNode.right = removeNode(currentNode.right, currentNode.value);
        return currentNode;
    }

    private Node findFirst(Node currentNode){
        if (currentNode.left != null){
            return findFirst(currentNode.left);
        }
        return currentNode;
    }

    public T findFirst(){
        if (root == null){
            throw new NoSuchElementException();
        }
        return findFirst(root).value;
    }

    public List<T> dfs(){
        if (root == null) return List.of();
        List<T> result = new ArrayList<>();
        dfs(root, result);
        return List.copyOf(result);
    }

    private void dfs(Node currentNode, List<T> result){
        if (currentNode.left != null){
            dfs(currentNode.left, result);
        }
        if (currentNode.right != null){
            dfs(currentNode.right, result);
        }

    }

    public List<T> bfs(){
        if (root == null) return List.of();

        List<T> result = new ArrayList<>();

        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()){
            Node nextNode = queue.poll();
            result.add(nextNode.value);
            if (nextNode.left != null){
                queue.add(nextNode.left);
            }
            if (nextNode.right != null){
                queue.add(nextNode.right);
            }
        }
        return result;
    }
}