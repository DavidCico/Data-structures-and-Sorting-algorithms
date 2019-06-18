/**
 * Class that implements a stack for int type 
 */

public class IntStack {
	private int[] arr; // array
	private int top; // top index to keep track of last element added
	private int size; // size of stack
	
	
	// Constructor
	public IntStack(int s){
		size = s;
		top = -1;
		arr = new int[s];
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
	public boolean push(int item){
		if(!isFull()){
			arr[++top] = item;
			return true;
		}
		
		else{
			return false;
		}
	}
	
	//Return the top element of stack
	public int peek(){
		if(!isEmpty()){
			return arr[top];
		}
		
		return -1;
	}
	
	//Remove top element from stack and decrement index
	public int pop(){
		if(!isEmpty()){
			int item = arr[top];
			top--;
			return item;
		}
		
		return -1;
	}
	
	
}
