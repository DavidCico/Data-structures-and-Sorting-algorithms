/**
 * Priority queue implementation for a heap of Task 
 */

public class TaskPrioQueue {

	private Task[] heap;
	private int heapSize;

	/** Constructor **/
	public TaskPrioQueue(int size) {
		heap = new Task[size];
		heapSize = 0;
	}

	/** function to check if empty **/
	public boolean isEmpty() {
		return heapSize == 0;
	}

	/** function to check if full **/
	public boolean isFull() {
		return heapSize == heap.length;
	}

	/** function to get Size **/
	public int size() {
		return heapSize;
	}

	/** function to insert element in queue **/
	public void insert(String job, int priority) {

		Task newJob = new Task(job, priority);

		if (!isFull()) {
			heap[heapSize] = newJob;
			int pos = heapSize;
			while (pos > 0) {
				int parent = (pos - 1) / 2;
				if (heap[parent].getPriority() > heap[pos].getPriority())
					break;
				swapTask(heap, parent, pos);
				pos = parent;
			}

			heapSize++;

		}

	}

	/** function to remove element in queue **/
	public Task pop() {

		if (!isEmpty()) {
			Task toReturn = heap[0]; // element to return from heap root
			heap[0] = heap[heapSize - 1]; // store last element in heaproot

			int pos = 0;
			while (pos < heapSize / 2) {
				int greatest = getGreaterChild(pos);
				if (greatest != pos) {
					swapTask(heap, greatest, pos);
					pos = greatest;
				} else {
					break;
				}
			}
			heapSize--;
			return toReturn;
		}
		else{
			return null;
		}

	}

	/**
	 * function that returns the greatest element between parent and child based
	 * on the priority integer
	 **/
	public int getGreaterChild(int i) {
		int lc = 2 * i + 1;
		int rc = 2 * i + 2;
		int greatest = i;

		if (lc < heap.length
				&& heap[lc].getPriority() > heap[greatest].getPriority()) {
			greatest = lc;
		}

		if (rc < heap.length
				&& heap[rc].getPriority() > heap[greatest].getPriority()) {
			greatest = rc;
		}

		return greatest;

	}

	/** function to swap elements of heap array **/
	public void swapTask(Task[] arr, int i, int j) {
		Task tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	/** print the heap array elements **/
	public void printHeap() {
		for (int i = 0; i < heapSize; i++) {
			System.out.printf("%s ", heap[i]);
			System.out.println();
		}
	}

	public static void main(String[] args) {

		TaskPrioQueue tpq = new TaskPrioQueue(20);

		tpq.insert("alpha", 1);
		tpq.insert("beta", 2);
		tpq.insert("gamma", 3);
		tpq.insert("delta", 4);
		tpq.insert("eta", 5);
		tpq.insert("chi", 6);
		tpq.insert("ksi", 7);
		
		
		tpq.pop();

		tpq.printHeap();

	}

}
