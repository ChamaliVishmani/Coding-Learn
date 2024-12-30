class Node:
    data = None
    next_node = None

    def __init__(self, data):
        self.data = data

    def __repr__(self):
        return "<Node data : %s>" % self.data


class LinkedList:
    def __init__(self):
        self.head = None

    def is_empty(self):
        return self.head is None

    def size(self):  # Time complexity = O(n)
        current = self.head
        count = 0
        while current:
            count += 1
            current = current.next_node
        return count

    def prepend_node(self, data):  # Time complexity = O(1)
        new_node = Node(data)
        new_node.next_node = self.head
        self.head = new_node

    def search(self, key):
        """
        Search for first node containing data that matches the key
        Time complexity = O(n) (Linear time - traverse complete list in worst case)
        """
        current = self.head

        while current:
            if current.data == key:
                return current
            else:
                current = current.next_node
        return None

    def insert(self, data, index):
        """
        Insert new node at index position
        Insert - takes O(1) time
        Finding node at insertion point - takes O(n)
        Therefore it takes overall O(n) time.
        """
        if index == 0:
            self.prepend_node(data)
        if index > 0:
            new_node = Node(data)

            position = index
            current = self.head

            while position > 1:
                current = current.next_node
                position -= 1

            new_prev_node = current
            new_next_node = current.next_node

            new_prev_node.next_node = new_node
            new_node.next_node = new_next_node

    def remove(self, key):  # takes O(n) time
        current = self.head
        previous = None
        found = False

        while current and not found:
            if current.data == key and current is self.head:
                found = True
                self.head = current.next_node
            elif current.data == key:
                found = True
                previous.next_node = current.next_node
            else:
                previous = current
                current = current.next_node

        return current

    def __repr__(self):  # Time complexity = O(n)
        nodes = []
        current = self.head

        while current:
            if current is self.head:
                nodes.append("[Head: %s]" % current.data)
            elif current.next_node is None:
                nodes.append("[Tail: %s]" % current.data)
            else:
                nodes.append("[%s]" % current.data)

            current = current.next_node

        return '-> '.join(nodes)
