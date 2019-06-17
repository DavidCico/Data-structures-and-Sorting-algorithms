
public class SelectionSort {
	
	public void sort(int[] arr){
        
        // One by one move boundary of unsorted subarray 
		for(int i=0; i<arr.length;i++){
            
            // Find the minimum element in unsorted array 
			int minimum = i;
			for(int j = i; j<arr.length; j++){
				if(arr[minimum] > arr[j]){
					minimum = j;
				}
			}
			// Swap the found minimum element with the first 
            // element 
			swap(arr,minimum,i);
		}
    }
    
	/* A function to swap 2 array elements at specified indexes */
	public void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
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
        int arr[] = {12, 11,11,14,13, 5, 6, 7}; 
        int l = 0;
        int h = arr.length - 1;
  
        System.out.println("Unsorted array is:");
        printArray(arr);
        System.out.println();
        
        SelectionSort ob = new SelectionSort(); 
        ob.sort(arr); 
  
        System.out.println("Sorted array is:"); 
        printArray(arr); 
    } 
	
	
}
