package br.com.iterativequicksort.algorithm;

public class QuickSort {
	
	protected int[] array;
	
	public QuickSort(int[] array) {
		this.array = array;
	}
	
	protected void swap(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	protected int partition(int p, int r){
		int x = array[r];
		int i = p-1;
		
		for(int j=p; j<r; j++){
			if(array[j] <= x) {
				i++;
				swap(i, j);
			}
		}
		
		swap(i+1, r);
		
		return i+1;
	}
	
	public void sort(int p, int r){ 
        int[] stack = new int[r - p + 1]; 
  
        int top = -1; 
   
        stack[++top] = p; 
        stack[++top] = r; 
  
        while (top >= 0) { 
            r = stack[top--]; 
            p = stack[top--]; 

            int q = partition(p, r); 
  
            if (q - 1 > p) { 
                stack[++top] = p; 
                stack[++top] = q - 1; 
            } 
  
            if (q + 1 < r) { 
                stack[++top] = q + 1; 
                stack[++top] = r; 
            } 
        } 
	}

}
