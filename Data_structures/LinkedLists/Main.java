public class Main {
	public static void main(String[] args){
/*		IntLinkedList list = new IntLinkedList(2);
		list.insertItem(5);
		list.insertItem(8);
		list.printList();
		*/
		
		DoublePersonLL list = new DoublePersonLL(new Person("David", 26));
		
		list.insertStartPerson(new Person("KK", 33));
		list.insertStartPerson(new Person("Phoebe", 26));
		list.insertStartPerson(new Person("Sara", 45));
		list.insertStartPerson(new Person("Laogong", 100));
		
		//list.printList();
		
		list.sortList();
		
		list.printList();
		
		
	}

}
