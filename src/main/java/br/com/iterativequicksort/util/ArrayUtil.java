package br.com.iterativequicksort.util;

public class ArrayUtil {
	
	public static int[] makeUnsorted(int n) {
		int[] array =  new int[n];
		
		int i = n-1;
		int j = 0;
		
		while(i >= 0) {
			array[j] = i;
			j++;
			i--;
		}

		return array;
	}
	
	public static void print(int[] array) {
		for(int i=0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}

}
