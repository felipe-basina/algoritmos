from algorithms.models.node import LinkedList

'''
Given the pointer to the head node of a linked list, change the next pointers of the nodes so that their order 
is reversed. 
The head pointer given may be null meaning that the initial list is empty.

Example:
1 -> 2 -> 3 -> 4 -> 5 -> NULL
1 is the HEAD of the list
'''

"""
This function avoids the exception:
'RecursionError: maximum recursion depth exceeded while calling a Python object'
"""
def getElementsInteractive(node, arr):
    if node is None:
        return []

    ref_node = node
    while ref_node:
        arr.append(ref_node.data)
        ref_node = ref_node.next

    return arr


"""
This function works for a LinkedList not too big
and whether it is, then it is possible to occur following exception:
'RecursionError: maximum recursion depth exceeded while calling a Python object'
"""
def get_elements(node, nodes):
    if node.next is None:
        nodes.append(node)
        return nodes
    nodes.append(node)
    return get_elements(node.next, nodes)


def reverse(llist):
    if llist is None:
        return
    nodes = []
    elements = get_elements(llist, nodes)
    new_ll = create_linked_list([el.data for el in reversed(elements)])
    return new_ll


def create_linked_list(values):
    linked_list = LinkedList()
    for val in values:
        linked_list.insert_node(val)
    return linked_list.head


if __name__ == "__main__":
    original_llist = create_linked_list([1, 2, 3, 4, 5])
    new_llist = reverse(original_llist)
    print("org_llist: {}\nnew_llist: {}".format(original_llist, new_llist))
