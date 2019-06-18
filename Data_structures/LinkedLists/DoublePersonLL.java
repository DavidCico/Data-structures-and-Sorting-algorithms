/** 
 * Class that implements a double linked list (DLL)
 * for nodes with Person object as data
 */

public class DoublePersonLL {
	
	private Node head;
	
	//Constructor
	public DoublePersonLL(Person item){
		head = new Node();
		head.data = item;
		head.next = null;
		head.previous = null;
	}
	
	//Function to insert new node at the head of the DLL
	public boolean insertStartPerson(Person item){
		Node n = new Node();
		n.data = item;
		n.previous = null;
		head.previous = n;
		n.next = head;
		head = n;
		return true;
	}
	
	//Function to insert new node at the end of the DLL
	public boolean insertLastPerson(Person item){
		Node n = new Node();
		Node a = head;
		
		while(a.next!=null){
			a = a.next;
		}
		
		n.data = item;
		a.next = n;
		n.previous = a;
		n.next = null;
		return true;
	}
	
	//Function to delete node from the linked list
	public boolean deletePerson(Person item){
		if(head.data==item){
			head = head.next;
			return true;
		}
		else{
			Node x = head;
			Node y = head.next;
			
			while(y!=null && !(y.data == item)){
				x = y;
				y = y.next;
			}
			
			if(y != null){
				x.next = y.next;
				return true;
			}
			else{
				return false;
			}
		}
		
	}
	
	//Function to print the list of node values
	public void printList(){
		Node a = head;
		while(a != null){
			System.out.println(a.data);
			a = a.next;
		}
	}
	
	//Function to sort the list by Age of Person using BubbleSort algorithm
	public void sortList(){
		Node a = head;
		Person c = null;
		
		while(a.next!=null){ 
			Node b = head;
			while(b.next!=null){
				
				if(b.data.getAge() > b.next.data.getAge()){ //check age of b and b.next then swap nodes
					c = b.data;								// if condition fulfilled
					b.data = b.next.data;
					b.next.data  = c;
				}
				b = b.next;
			}
			a = a.next;
		}
	}
	
	
	/**
	 * Class to define a node containing the data type,
	 * and its link to previous and next nodes.
	 */
	public class Node{
		private Person data;
		private Node next;
		private Node previous;
	}

}
