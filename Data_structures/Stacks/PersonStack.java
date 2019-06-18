/**
 * Class that implements a stack for object Person
 */

public class PersonStack {
	private Person[] arr;
	private int top;
	private int size;
	
	// Constructor
	public PersonStack(int s){
		size = s;
		top = -1;
		arr = new Person[s];
	}
	
	//Return size of stack
	public int size(){
		return top + 1;
	}
	
	//Check if stack is empty
	public boolean isEmpty(){
		if(top == -1){
			return true;
		}
		else{
			return false;
		}
	}

	//Check if stack is full
	public boolean isFull(){
		if(top == size -1){
			return true;
		}
		
		else{
			return false;
		}
	}
	
	//Push item inside the stack
	public boolean push(Person item){
		if(!isFull()){
			arr[++top] = item;
			return true;
		}
		
		else{
			return false;
		}
	}
	
	//Return the top element of stack
	public Person peek(){
		if(!isEmpty()){
			return arr[top];
		}
		
		return null;
	}
	
	//Remove top element from stack and decrement index
	public Person pop(){
		if(!isEmpty()){
			Person item = arr[top];
			top--;
			return item;
		}
		
		return null;
	}
	
	
}
