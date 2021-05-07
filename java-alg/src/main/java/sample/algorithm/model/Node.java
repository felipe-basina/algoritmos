package sample.algorithm.model;

public class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int data, Node l, Node r) {
        this.data = data;
        this.left = l;
        this.right = r;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}