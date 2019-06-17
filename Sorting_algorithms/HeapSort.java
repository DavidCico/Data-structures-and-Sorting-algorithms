public class HeapSort {

	public void sorting(int[] arr, int n) {
		
		// build the Max heap first
		for(int i = n/2-1; i>=0; i--){
			heapify(arr,n,i);
		}
		
		//extract elements from heap one by one by reducing its size
		for(int i = n-1; i>=0; i--){
			
			// swap last element with first
			swap(arr,i,0);
			
			// call heapify again with decrement
			heapify(arr,i,0);
		}
		
	}

	/* A function to swap 2 array elements at specified indexes */
	public void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	// n corresponds to the total number of elements, and i is the index for
	// parent nodes
	public void heapify(int[] arr, int n, int i) {

		int lc = 2 * i + 1;
		int rc = 2 * i + 2;
		int greatest = i;
		
		if(lc < n && arr[lc] > arr[greatest]){
			greatest = lc;
		}
		
		if(rc < n && arr[rc] > arr[greatest]){
			greatest = rc;
		}
		
		if (greatest!=i){
			swap(arr, i, greatest);
			
			//recursively apply heapify
			heapify(arr, n, greatest);
		}
		

		
	}
	
    /* A utility function to print array of size n */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
  
    // Driver program 
    public static void main(String args[]) 
    { 
        int arr[] = {12, 11,7,13, 5, 6, 7}; 
        int n = arr.length; 
  
        System.out.println("Unsorted array is:");
        printArray(arr);
        System.out.println();
        
        HeapSort ob = new HeapSort(); 
        ob.sorting(arr,n); 
  
        System.out.println("Sorted array is:"); 
        printArray(arr); 
    } 
	
	
}
