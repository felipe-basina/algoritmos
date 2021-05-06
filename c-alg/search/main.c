#include <stdio.h>
#include "search.h"

int arr[16] = {3, 6, 8, 12, 14, 17, 25, 29, 31, 36, 42, 47, 53, 55, 62};
            // 0  1  2  3   4   5   6   7   8   9   10  11  12  13  14

int binarySearch(int l, int h, int key) {
    if (l == h) {
        if (arr[l] == key) {
            return l;
        } else {
            return -1;
        }
    } else {
        int mid = (l + h) / 2;
        if (arr[mid] < key) {
            return binarySearch(mid + 1, h, key);
        } else {
            return binarySearch(l, mid, key);
        }
    }
}

int main() {
    char msg[] = "Searching for";
    int keys[] = {36, 3, 31, 13};
    for (int index = 0; index < 4; index++) {
        printf("%s [%2d] - index: %d\n", msg, keys[index], binarySearch(0, 16, keys[index]));
    }
    return 0;
}
