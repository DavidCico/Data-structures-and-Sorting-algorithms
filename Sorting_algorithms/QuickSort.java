
public class QuickSort {
    /* This function takes last element as pivot, 
       places the pivot element at its correct 
       position in sorted array, and places all 
       smaller (smaller than pivot) to left of 
       pivot and all greater elements to right 
       of pivot */
	public int partition(int arr[], int low, int high) 
    { 
		int pivot = arr[high];
		int i = low -1; // index of smaller element 
		
		for(int j=low; j<high; j++){
            
            // If current element is smaller than or 
            // equal to pivot 
			if(arr[j] <= pivot){
				i++;
				swap(arr,i,j);
			}
		}
		
		swap(arr, i+1, high);
		
		return i+1;
		
    }
    
    /* The main function that implements QuickSort() 
      arr[] --> Array to be sorted, 
      low  --> Starting index, 
      high  --> Ending index */
	public void sort(int[] arr, int low, int high){
		
		if(low < high){
            
            /* p is partitioning index, arr[p] is  
              now at right place */
			int p = partition(arr, low, high);
			
			//sort recursively
			sort(arr, low, p-1);
			sort(arr, p+1, high);
			
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
        
        QuickSort ob = new QuickSort(); 
        ob.sort(arr,l,h); 
  
        System.out.println("Sorted array is:"); 
        printArray(arr); 
    } 
}
