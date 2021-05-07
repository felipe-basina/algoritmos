package sample.algorithm;

import sample.algorithm.model.Node;

public class TreeLength {

    public static void main(String[] args) {
        System.out.println(treeLength(createNode()));
    }

    private static int treeLength(Node n) {
        if (n == null) {
            return 0;
        }
        int left = treeLength(n.left);
        int right = treeLength(n.right);
        return Math.max(left, right) + 1;
    }

    private static Node createNode() {
        Node seven = new Node(7, null, null);
        Node six = new Node(6, null, seven);
        Node four = new Node(4, null, null);
        Node five = new Node(5, four, six);
        Node one = new Node(1, null, null);
        Node two = new Node(2, one, null);
        return new Node(3, two, five);
    }

}