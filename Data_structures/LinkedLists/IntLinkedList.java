/** 
 * Class that implements a linked list (LL)
 * for nodes integer as data
 */

public class IntLinkedList {
	private Node head;
	
	//Constructor
	public IntLinkedList(int item){
		head = new Node();
		head.value = item;
		head.link = null;
	}
	
	//Function to insert new node at the head of the LL
	public boolean insertItem(int item){
		Node n = new Node();
		n.value = item;
		n.link = head; 
		head = n;
		return true;
	}
	
	//Function to print the list of node values
	public void printList(){
		Node z = head;
		while (z!=null){
			System.out.println(z.value);
			z = z.link;
		}
	}
	
	//Function to delete node from the linked list
	public boolean deleteItem(int item){
		if(head.value == item){ // check if node is head
			head = head.link;
			return true;
		} else{   // iterate through linked list as long as the item is not found
			Node x = head;
			Node y = head.link;
			while(true){
				if(y == null || y.value == item){
					break;
				} else {
					x = y;
					y = y.link;
				}
			}
			if(y != null){ 
				x.link = y.link; // delete the node by skipping link
				return true;
			} else {
				return false;
			}
		}
	}
	

	/**
	 * Class to define a node containing the data type,
	 * and its next node.
	 */
	class Node {
		private int value;
		private Node link;
	}
	
}
