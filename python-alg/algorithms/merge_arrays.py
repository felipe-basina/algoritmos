"""
Merge two sorted lists/arrays
"""


def merge_lists(elements1, elements2):
    len1 = len(elements1)
    len2 = len(elements2)

    mergeArr = []

    v1 = None
    v2 = None

    index1 = 0
    index2 = 0

    while True:
        if index1 < len1:
            v1 = elements1[index1]
        if index2 < len2:
            v2 = elements2[index2]

        if v1 is not None and v2 is not None:
            if v1 < v2:
                mergeArr.append(v1)
                index1 += 1
                v1 = None
            elif v1 > v2:
                mergeArr.append(v2)
                index2 += 1
                v2 = None
            else:
                mergeArr.append(v1)
                mergeArr.append(v2)
                index1 += 1
                index2 += 1
                v1 = None
                v2 = None
        elif v1 is not None:
            mergeArr.append(v1)
            index1 += 1
            v1 = None
        elif v2 is not None:
            mergeArr.append(v2)
            index2 += 1
            v2 = None
        else:
            break

    return mergeArr


if __name__ == '__main__':
    print(merge_lists([1, 3, 7], [1, 2]))
    print(merge_lists([1, 10, 12, 15, 32], [2, 4, 9, 11, 14, 17, 31, 32]))