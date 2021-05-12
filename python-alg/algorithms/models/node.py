class Node:

    def __init__(self, data):
        self.data = data
        self.next = None  # References to another node

    def __str__(self):
        return "[data={}:next={}] ".format(self.data, self.next)


class LinkedList:

    def __init__(self):
        self.head = None
        self.tail = None

    def insert_node(self, data):
        node = Node(data)

        if not self.head:
            self.head = node
        else:
            self.tail.next = node

        self.tail = node
