package br.com.iterativequicksort.algorithm;

import java.util.Random;

public class RandomQuickSort extends QuickSort {
	
	public RandomQuickSort(int[] array) {
		super(array);
	}

	@Override
	protected int partition(int p, int r) {
		Random rand = new Random(); 
        int i = rand.nextInt(r-p+1) + p; 
		swap(i, r);
		return super.partition(p, r);
	}

}
