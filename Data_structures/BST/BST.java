public class BST {
	private Node root;


	// Constructor
	public BST() {
		root = null;
	}

	/**
	 * Function to insert node in the binary search tree
	 * based on comparison of String name of a Person
	 */
	public boolean insert(Person item) {
		Node n = new Node(); // new node instantiation
		n.data = item;
		n.lc = null;
		n.rc = null;

		// initiliazation if the root is empty
		if (root == null) {
			root = n;
			return true;
		}

		Node p = root;
		Node c = root;


		// while loop to compare item name, with its children and choose to put it as right
		// child or left child based on the value.  
		while (c != null) {
			p = c;

			if (item.getName().compareTo(c.data.getName()) < 0) {
				c = c.lc;
			}

			else {
				c = c.rc;
			}
		}

		// when the position of the node has been found, need to store new node
		// n in parent value
		if (item.getName().compareTo(p.data.getName()) < 0) {
			p.lc = n;
		}

		else {
			p.rc = n;
		}

		return true;
	}

	/**
	 * Function to find node in the binary search tree
	 * based on comparison of String name of a Person
	 */
	public Node findNode(String key) {
		Node c = root;

		// iterate through the BST to find the correct key 
		while (c != null) {
			if (key.equals(c.data.getName())) {
				break;
			}

			else if (key.compareTo(c.data.getName()) < 0) {
				c = c.lc;
			}

			else {
				c = c.rc;
			}
		}

		return c;
	}

	/*
	 * Function to find parent node in the binary search tree
	 * based on comparison of String name of a Person
	 */
	public Node findParent(String key) {
		Node p = root;
		Node c = root;

		do {
			if (key.compareTo(c.data.getName()) == 0) {
				break;
			}
			p = c;
			if (key.compareTo(c.data.getName()) < 0) {
				c = c.lc;
			} else {
				c = c.rc;
			}
		} while (c != null);

		if (c != null) {
			System.out.println(">> Parent: " + p.data.getName());
			return p;
		} else {
			return null;
		}
	}
	

	public Person getData(Node n){
		return n.data;
	}

	/*
	 * Function using recursion to print all the subtree structure
	 * starting from a node n.
	 */
	public void showAll(Node n) {
		Node p = n;
		if (p != null) {
			System.out.println(" " + p.data);
			showAll(p.lc);
			showAll(p.rc);
		}
	}


	/**
	 * Class to define a node containing the data type,
	 * and its two children nodes.
	 */
	public class Node {
		private Person data;
		private Node lc;
		private Node rc;
	}

}
