
public class BubbleSort {

	public void sort(int[] arr){
		
		// boolean to check if array is sorted
		boolean isSorted = false;
		// initialize index of unsorted item
		int lastUnsorted = arr.length -1;
		
		while(!isSorted){
			isSorted = true;
			
			// loop over all elements and swap
			for(int i = 0; i<lastUnsorted;i++){
				if(arr[i+1] < arr[i]){
					swap(arr,i,i+1);
					isSorted =false;
				}
			}
			// decrement index of last unsorted item
			lastUnsorted--;
		}
	}
	
	/* A function to swap 2 array elements at specified indexes */
	public void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	/* A utility function to print array of size n */
	public void printArray(int[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
	
	// Driver method
	public static void main(String[] args){
		
		int[] arr ={1,2,35,8,30,6,48,48,60};
		
		BubbleSort bubble = new BubbleSort();
		
		System.out.println("Initial array:");
		bubble.printArray(arr);
		System.out.println();
		
		bubble.sort(arr);
		System.out.println("Sorted array:");
		bubble.printArray(arr);
		
		
		
		
		
	}
}
