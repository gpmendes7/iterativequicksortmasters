package br.com.iterativequicksort.algorithm;

import java.util.Random;

import br.com.datastructures.stack.Stack;

public class RandomQuickSort {
	
	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	private static int partition(int[] array,int p, int r){
		int x = array[r];
		int i = p-1;
		
		for(int j=p; j<r; j++){
			if(array[j] <= x) {
				i++;
				swap(array, i, j);
			}
		}
		
		swap(array, i+1, r);
		
		return i+1;
	}
	
	private static int rpartition(int[] array, int p, int r) {
		Random rand = new Random(); 
        int i = rand.nextInt(r-p+1) + p; 
		swap(array, i, r);
		return partition(array, p, r);
	}
	
	public static void sort(int[] array, int p, int r){ 
        Stack<Integer> stack = new Stack<>();
 
        stack.push(p);
        stack.push(r);
  
        while (!stack.isEmpty()) { 
            r = stack.pop();
            p = stack.pop();
            
            int q = rpartition(array, p, r); 
  
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
