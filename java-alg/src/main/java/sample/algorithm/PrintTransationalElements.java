package sample.algorithm;

import sample.algorithm.model.Node;

import java.util.LinkedList;
import java.util.Queue;

/**
 * This algorithm is based on BFS (Breadth-First-Search)
 * Where a node visits each of its children before visiting
 * any of their children's children
 */
public class PrintTransactionalElements {

    public static void main(String[] args) {
        Queue<Node> queue = new LinkedList<>();
        System.out.println(queue.size());
        queue.add(new Node(1, null, null));
        queue.add(new Node(2, null, null));
        queue.add(new Node(3, null, null));
        System.out.println(queue.size());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.size());
    }

    private static Node createNode() {
        Node four = new Node(4, null, null);
        Node six = new Node(6, null, null);
        Node three = new Node(3, null, four);
        Node five = new Node(5, three, six);
        Node two = new Node(2, null, five);
        return new Node(1, null, two);
    }

}
