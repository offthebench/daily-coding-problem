package com.company.gfg;

import java.util.Arrays;

public class CustomSort {

	public void execute(int[] arr) {
		int length = arr.length;
		int[] temp = new int[length];
		int start = 0; int last = length - 1;
		boolean flag = true;

		for (int i = 0; i < length; i++) {
			if (flag) {
				temp[i] = arr[last--];
			} else {
				temp[i] = arr[start++];
			}
			flag = !flag;
		}

		arr = temp.clone();
		System.out.println(Arrays.toString(arr));
	}
}
