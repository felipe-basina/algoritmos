package sample.algorithm.model;

public class SingleNode {
    public int data;
    public SingleNode next;

    public SingleNode(int data, SingleNode next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return "SingleNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}