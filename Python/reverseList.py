def reverseList(list):
    prev = None
    curr = list.head
    nex curr.getNextNode()

    while curr:
        curr.setNextNode(prev)

        # moving to next node
        prev = curr
        curr = nex
        if nex:
            nex = nex.getNextNode()

    list.head = prev


def reverse(self, node):
    if node.getNextNode() == None:
        self.head = node
        return
    self.reverse(node.getNextNode())
    temp = node.getNextNode()
    temp.setNextNode(node)
    node.setNextNode(None)