#include <stdio.h>

/**
 * Searches for key in the array with divide-conquer approach
 * So it means at each search the array is divided by half
 * The array must be sorted
 *
 * @param l
 * @param h
 * @param key
 * @return l - the index of the found element in the array
 */
int binarySearch(int l, int h, int key, int arr[]) {
    if (l == h) {
        if (arr[l] == key) {
            return l;
        } else {
            return -1;
        }
    } else {
        int mid = (l + h) / 2;
        if (arr[mid] < key) {
            return binarySearch(mid + 1, h, key, arr);
        } else {
            return binarySearch(l, mid, key, arr);
        }
    }
}

void doABinarySearch() {
    int arr[16] = {3, 6, 8, 12, 14, 17, 25, 29, 31, 36, 42, 47, 53, 55, 62};
                // 0  1  2  3   4   5   6   7   8   9   10  11  12  13  14

    char msg[] = "Searching for";
    int keys[] = {36, 3, 31, 13};
    int totalKeys = (sizeof keys / sizeof (keys[0]));
    int totalElements = (sizeof arr / sizeof (arr[0]));

    for (int index = 0; index < totalKeys; index++) {
        printf("%s [%2d] - index: %d\n",
               msg,
               keys[index],
               binarySearch(0, totalElements, keys[index], arr));
    }
}

int main() {
    doABinarySearch();
    return 0;
}
