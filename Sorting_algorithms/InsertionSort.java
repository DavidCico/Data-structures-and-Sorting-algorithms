
public class InsertionSort {
	
	public void sort(int[] arr){
		
		for(int i=1; i<arr.length; i++){
			
			int toInsert = arr[i];
			int j = i-1;
            
            /* Move elements of arr[0..i-1], that are 
            greater than key, to one position ahead 
            of their current position */
			while(j>=0 && arr[j] > toInsert){	
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = toInsert;
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
        
        InsertionSort ob = new InsertionSort(); 
        ob.sort(arr); 
  
        System.out.println("Sorted array is:"); 
        printArray(arr); 
    } 
	
	
}
