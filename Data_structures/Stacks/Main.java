
public class Main {
	
	public static void main(String args[]){

		
		PersonStack stackp = new PersonStack(2);
		
		Person p1 = new Person("Cok", 25);
		Person p2 = new Person("Lacazette", 26);
		
		stackp.push(p1);
		stackp.push(p2);
		
        System.out.println("top element is: " + stackp.peek());
        System.out.println(("size of stack is: " + stackp.size()));
        
        System.out.println("Element removed is: " + stackp.pop());
        
        System.out.println(("size of stack is: " + stackp.size()));
        
        System.out.println("Is the stack full: " + stackp.isFull());
		
		
		
	}

}
