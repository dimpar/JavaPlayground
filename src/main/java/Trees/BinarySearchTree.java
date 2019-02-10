package Trees;

public class BinarySearchTree<Key extends Comparable<Key>, Value> {

    private Node root; // root of BST

    private class Node {
        private Key key;
        private Value value;
        private Node left, rigth;
        private int N; // # of nodes in subtree rooted here

        public Node(Key key, Value value, int n) {
            this.key = key;
            this.value = value;
            this.N = n;
        }
    }

    public int size() {
        return size(root);
    }

    private int size(Node node) {
        if (node == null) return 0;

        return node.N;
    }

    public Value get(Key key) {
        return get(root, key);
    }

    private Value get(Node node, Key key) {
        if (node == null) return null;

        int compare = key.compareTo(node.key);

        if (compare < 0) {
            return get(node.left, key);
        } else if (compare > 0) {
            return get(node.rigth, key);
        } else {
            return node.value;
        }
    }

    public void put(Key key, Value value) {
        root = put(root, key, value);
    }

    private Node put(Node node, Key key, Value value) {
        if (node == null) return new Node(key, value, 1);

        int compare = key.compareTo(node.key);
        if (compare < 0) {
            node.left = put(node.left, key, value);
        } else if (compare > 0) {
            node.rigth = put(node.rigth, key, value);
        } else {
            node.value = value;
        }

        node.N = size(node.left) + size(node.rigth) + 1;

        return node;
    }

}
