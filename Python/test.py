import main
from unittest import TestCase

class MyTestCase(TestCase):
    def test_createNode(self):
        root = bst.Node(1)
        self.assertEqual(1, root.key)

    def test_createTree(self):
        root = bst.Node(1)
        root.left =bst.Node(2)
        root.right = bst.Node(3)
        root.left.left = bst.Node(4)
        root.left.right = bst.Node(5)
        root.right.left = bst.Node(6)
        root.right.right = bst.Node(7)

    def test_LCARoot(self):
        self.assertEqual(1, bst.findLCA(1,2,3))

    def test_LCA(self):
        root = bst.Node(1)
        root.left = bst.Node(2)
        root.right = bst.Node(3)
        root.left.left = bst.Node(4)
        root.left.right = bst.Node(5)
        root.right.left = bst.Node(6)
        root.right.right = bst.Node(7)
        self.assertEqual(3, bst.findLCA(1,6,7))





