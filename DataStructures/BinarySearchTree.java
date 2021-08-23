public class BinarySearchTree<T extends Comparable<T>> {

    // TODO: Add remove
    private Node root = null;
    private int size = 0;

    private class Node {
        T data;
        Node left, right;

        Node(T data) {
            this.data = data;
        }

        Node(T data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean search(T key) {
        return search(root, key);
    }

    /**
     * Recursively search if key is in BST
     */
    private boolean search(Node node, T key) {
        if (node == null)
            return false;

        if (key.compareTo(node.data) < 0)
            return search(node.left, key);
        else if (key.compareTo(node.data) > 0)
            return search(node.right, key);

        else
            return true;
    }

    public boolean add(T data) {
        if (search(data))
            return false; // cant add if element already in BST.

        root = add(root, data);
        size++;
        return true;
    }

    public Node add(Node node, T data) {
        if (node == null) {
            node = new Node(data);
        } else {
            if (data.compareTo(node.data) < 0) {
                node.left = add(node.left, data);
            } else {
                node.right = add(node.right, data);
            }
        }

        return node;
    }

}
