package br.com.iterativequicksort.app;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import br.com.iterativequicksort.algorithm.QuickSort;
import br.com.iterativequicksort.util.ArrayUtil;

public class QuickSortApp {

	private static int[] array;

	private static FileWriter arq;
	private static PrintWriter gravarArq;
	
	public static void quickSort(int n) {
		array = ArrayUtil.makeUnsorted(n);
		QuickSort quickSort = new QuickSort(array);
		quickSort.sort(0, array.length - 1);
	}

	public static void main(String[] args) throws IOException {	
		arq = new FileWriter("quicksort.txt");
		gravarArq = new PrintWriter(arq);

		for (int i = 40000; i <= 150000; i+=10000) {
			long startTime = System.currentTimeMillis();
			quickSort(i);
			long endTime = System.currentTimeMillis();
			long totalTime = endTime - startTime;
			gravarArq.printf(i + "," + totalTime + "\n");
		}
		
		arq.close();
	}

}
