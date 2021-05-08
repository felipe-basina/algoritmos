package sample.algorithm;

import sample.algorithm.model.SingleNode;

import java.util.ArrayList;
import java.util.List;

public class PrintInReverse {

    public static void main(String[] args) {
        reversePrint(createSingleNode1());
        System.out.println("-----------------");
        reversePrint(createSingleNode2());
        System.out.println("-----------------");
        reversePrint(createSingleNode3());
    }

    public static List<Integer> getDatas(SingleNode node, List<Integer> datas) {
        if (node.next == null) {
            datas.add(node.data);
            return datas;
        }
        datas.add(node.data);
        return getDatas(node.next, datas);
    }

    public static void reversePrint(SingleNode llist) {
        if (llist == null) {
            return;
        }
        List<Integer> datas = new ArrayList<>();
        datas = getDatas(llist, datas);
        for (int index = datas.size() - 1; index >= 0; index--) {
            System.out.println(datas.get(index));
        }
    }

    /**
     * Representation
     * 16 -> 12 -> 4 -> 2 -> 5 -> null
     */
    private static SingleNode createSingleNode1() {
        SingleNode five = new SingleNode(5, null);
        SingleNode two = new SingleNode(2, five);
        SingleNode four = new SingleNode(4, two);
        SingleNode twelve = new SingleNode(12, four);
        return new SingleNode(16, twelve);
    }

    /**
     * Representation
     * 7 -> 3 -> 9 -> null
     */
    private static SingleNode createSingleNode2() {
        SingleNode nine = new SingleNode(9, null);
        SingleNode three = new SingleNode(3, nine);
        return new SingleNode(7, three);
    }

    /**
     * Representation
     * 5 -> 1 -> 18 -> 3 -> 13 -> null
     */
    private static SingleNode createSingleNode3() {
        SingleNode thirteen = new SingleNode(13, null);
        SingleNode three = new SingleNode(3, thirteen);
        SingleNode eighteen = new SingleNode(18, three);
        SingleNode one = new SingleNode(1, eighteen);
        return new SingleNode(5, one);
    }

}
