package sample.algorithm;

import sample.algorithm.model.Node;

import java.util.LinkedList;
import java.util.Queue;

/**
 * This algorithm is based on BFS (Breadth-First-Search)
 * Where a node visits each of its children before visiting
 * any of their children's children
 */
public class PrintTraversalElements {

    public static void main(String[] args) {
        printValues(createNode());
    }

    private static void printValues(Node root) {
        Queue<Node> queue = new LinkedList<>();;
        visit(root);
        addToQueue(root, queue);

        while (!queue.isEmpty()) {
            Node node = queue.remove();
            visit(node.left);
            addToQueue(node.left, queue);
            visit(node.right);
            addToQueue(node.right, queue);
        }
    }

    private static void visit(Node node) {
        if (node != null) {
            System.out.printf("%d ", node.data);
        }
    }

    private static void addToQueue(Node node, Queue<Node> queue) {
        if (node != null) {
            queue.add(node);
        }
    }

/**
// Representation
//    1
//     \
//      2
//       \
//        5
//      /   \
//     3     6
//      \
//       4
**/
    private static Node createNode() {
        Node four = new Node(4, null, null);
        Node six = new Node(6, null, null);
        Node three = new Node(3, null, four);
        Node five = new Node(5, three, six);
        Node two = new Node(2, null, five);
        return new Node(1, null, two);
    }

}
