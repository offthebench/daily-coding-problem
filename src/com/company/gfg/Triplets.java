package com.company.gfg;

import java.util.Arrays;

public class Triplets {

	private int[] arr;

	public Triplets(int[] arr) {
		this.arr = arr;
	}

	public void execute() {
		int count  = 0;
		Arrays.sort(arr);
		int l = arr.length;
		for (int i = l - 1; i >= 0; i--) {
			int j = 0;
			int k = i - 1;
			while (j < k) {
				if (arr[i] == arr[j] + arr[k]) {
					count++;
					j += 1;
					if(j == k-1) {
						j = 0;
						k -= 1;
					}
				}
				else if (arr[i] > arr[j] + arr[k]) {
					k -= 1;
				} else {
					j += 1;
				}
			}
		}

		System.out.println("Triplet count: " + count);
	}
}
