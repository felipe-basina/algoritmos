package sample.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountItemsInDeposit {

    public static void main(String[] args) {
        System.out.println(getTotalItems("|****|***|******|", Arrays.asList(0, 5, 9), Arrays.asList(5, 9, 15)));
        System.out.println(getTotalItems("****|***|**|***|", Arrays.asList(0, 4, 8), Arrays.asList(4, 11, 11)));
    }

    private static List<Integer> getTotalItems(String string, List<Integer> startIndex, List<Integer> endIndex) {
        List<Integer> totalItems = new ArrayList<>();

        for (int index = 0; index < startIndex.size(); index++) {
            int start = startIndex.get(index);
            int end = endIndex.get(index);

            if (string.charAt(start) == '|' && string.charAt(end) == '|') {
                int countItems = 0;
                for (int itemIdx = start + 1; itemIdx < end; itemIdx++) {
                    if (string.charAt(itemIdx) == '*') {
                        countItems++;
                    } else {
                        countItems = 0;
                        break;
                    }
                }
                totalItems.add(countItems);
            } else {
                totalItems.add(0);
            }
        }

        return totalItems;
    }

}
