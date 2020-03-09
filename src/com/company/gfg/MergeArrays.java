package com.company.gfg;

import java.util.Arrays;

public class MergeArrays {

	public void merge(int[] arr1, int[] arr2) {

		int n = arr1.length;
		int m = arr2.length;

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		for (int i = m - 1; i >= 0; i--) {

			int j, last = arr1[m - 1];
			for (j = n - 2; j >=0 && arr1[j] > arr2[i]; j--) {
				arr1[j+1] = arr1[j];
			}

			if (j != n - 2 || last > arr2[i]) {
				arr1[j+1] = arr2[i];
				arr2[i] = last;
			}
		}

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));


	}
}

/*

arr1 = [1,3,5,7,9], 5

arr2 = [2,4,6,8,0], 5

i = 4
last = 9
j = 3

7 > 0
arr1 = [1,3,5,7,7]

j = 2
5 > 0
arr1 = [1,3,5,5,7]

j = 1
3 > 0
arr1 = [1,3,3,5,7]

j = 0
1 > 0
arr1 = [0,1,3,5,7]
arr2 = [2,4,6,8,9]

*/
