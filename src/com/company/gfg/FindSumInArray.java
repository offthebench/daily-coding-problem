package com.company.gfg;

public class FindSumInArray {
	private int start = 0;
	private int end = 0;

	public void executeSimple(int[] arr, int len, int s) {

		for (int i=0; i<len; i++) {
			if (arr[i] == s) {
				System.out.println(i);
				return;
			}
			int sum = 0;
			sum = sum + arr[i];
			for (int j=i+1; j<len; j++) {
				sum = sum + arr[j];
				if (sum > s)
					continue;
				if (sum == s) {
					start = i;
					end = j;
					break;
				}
			}
		}

		if (start == 0 && end == 0)
		{
			System.out.println("Not Found.");
			return;
		}
		for (int i = start; i <= end; i++) {
			System.out.print(i + " ");
		}
	}

	public void executeEfficiently(int[] arr, int len, int s) {
		int sum = arr[0], start = 0;

		for (int i = 1; i <= len; i++) {

			while (sum > s && start < i - 1) {
				sum = sum - arr[start];
				start++;
			}

			if (sum == s) {
				System.out.println("Between " + start + " and " + (i-1));
			}

			if (i < len)
				sum = sum + arr[i];
		}
	}
}
