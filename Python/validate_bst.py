# Validate that a binary search tree is a binary search tree

def validate_tree(binary_tree):
    return validate_tree_node(binary_tree, -float('inf'), float('inf'))

def validate_tree_node(node,left_bound, right_bound):
    if not node:
        return True
    return node.data >= left_bound and node.data <= right_bound and \
            validate_tree_node(node.left, left_bound, node.data) and \
            validate_tree_node(node.right, node.data, right_bound)

# Node class, Node is iomportant
class Node():
    def __init__(self, data, left=None, right=None):
        self.data = data
        self.left= left
        self.right = right
