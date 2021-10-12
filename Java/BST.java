public class BST {
	Node root;

	BST() {
		root = null;
	}

	Node getNode(int key) {
		return getNode(root, key);
	}

	Node getNode(Node root, int key) {
		if (root == null || root.key == key) {
			return root;
		}
		if (key > root.key) {
			return getNode(root.right, key);
		}
		return getNode(root.left, key);
	}

	void addNode(int key) {
		root = addNode(root, key);
	}

	Node addNode(Node node, int key) {

		if (node == null) {
			node = new Node(key);
			return node;
		}
		if (key < node.key) {
			node.left = addNode(node.left, key);
		} else if (key > node.key) {
			node.right = addNode(node.right, key);
		}

		return node;
	}

	Node lca(int n1, int n2) {
		return lca(root, n1, n2);
	}

	Node lca(Node node, int n1, int n2) {
		if (node == null) {
			return null;
		}
		if (node.key > n1 && node.key > n2) {
			return lca(node.left, n1, n2);
		}

		if (node.key < n1 && node.key < n2) {
			return lca(node.right, n1, n2);
		}

		return node;
	}
}

class Node {
	int key;
	Node right, left;

	Node(int key) {
		this.key = key;
		right = left = null;
	}
}
