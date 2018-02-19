class Node:
    #Function to initialize the node object
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    # Function to initialize the linkeed list object
    def __init__(self):
        self.head = None


    def push(self, new_data):
        # 1 & 2: alocate the node & put in the data
        new_node = Node(new_data)
        # 3. Make next of new Node as head
        new_node.next = self.head

        # 4. Move the head to point to new Node
        self.head = new_node