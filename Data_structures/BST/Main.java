
public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("David", 24);
		Person p2 = new Person("MK Dong", 47);
		Person p3 = new Person("Kosta", 35);
		Person p4 = new Person("Marco", 67);
		Person p5 = new Person("Doobidou", 85);
		
		
		BST bst = new BST();
		
		bst.insert(p1);
		bst.insert(p2);
		bst.insert(p3);
		bst.insert(p4);
		bst.insert(p5);
		
		bst.showAll(bst.findNode("MK Dong"));
		
	}
}
