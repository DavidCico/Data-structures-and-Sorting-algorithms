/**
 * Class to implement a queue with
 * integers elements
 */

public class IntQueue {
	private int[] arr; //array
	private int size; // size of array
	private int front; // index for front of queue
	private int rear; // index for rear of queue
	private int total; // total of elements inside queue
	
	/** Constructor **/
	private IntQueue(int size){
		this.size = size;
		arr = new int[size];
		front = 0;
		rear = 0;
		total = 0;
	}

	/** function to check if empty **/
	public boolean isEmpty(){
		if(total == 0){
			return true;
		}
		
		return false;
	}
	
	/** function to check if full **/
	public boolean isFull(){
		if(total == size){
			return true;
		}
		else{
			return false;
		}
	}
	
	/** function to insert element in queue **/
	public boolean enQueue(int item){
		if(!isFull()){
			arr[rear] = item;
			total++;
			rear = (rear + 1) % size; // increase index of rear
			return true;
		}
		
		else{
			return false;	
		}
	}
	
	/** function to remove element in queue **/
	public int deQueue(){
		if(!isEmpty()){
			int item = arr[front];
			total--; 
			front = (front + 1 ) % size; // increase front index
			return item;
		}
		
		else{
			return -1;
		}
		
	}
	

    public static void main(String[] args) {

        IntQueue q = new IntQueue(15);

        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(6);

        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
    }
	
}
