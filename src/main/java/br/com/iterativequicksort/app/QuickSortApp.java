package br.com.iterativequicksort.app;

import java.io.IOException;
import java.util.Scanner;

import br.com.iterativequicksort.algorithm.QuickSort;

public class QuickSortApp {

	public static int[] build(int n) {
		int[] array =  new int[n];
		
		int i = n-1;

		while(i >= 0) {
			array[i] = n-i-1;
			i--;
		}

		return array;
	}

	public static void main(String[] args) throws IOException {	
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		int[] array = build(n);
		
		QuickSort.sort(array, 0, n-1);
		
		scanner.close();
	}

}
