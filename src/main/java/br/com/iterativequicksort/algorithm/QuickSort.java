package br.com.iterativequicksort.algorithm;

import br.com.datastructures.stack.Stack;

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
        Stack<Integer> stack = new Stack<>();
 
        stack.push(p);
        stack.push(r);
  
        while (!stack.isEmpty()) { 
            r = stack.pop();
            p = stack.pop();
            
            int q = partition(p, r); 
  
            if (q - 1 > p) { 
                stack.push(p);
                stack.push(q-1);
            } 
  
            if (q + 1 < r) { 
            	stack.push(q+1);
            	stack.push(r);
            } 
        } 
	}

}
