package com.company.dcp;

/***
 * A regular number in mathematics is defined as one which evenly divides some power of 60. Equivalently,
 *
 * we can say that a regular number is one whose only prime divisors are 2, 3, and 5.
 *
 * These numbers have had many applications, from helping ancient Babylonians keep time to tuning instruments according to the diatonic scale.
 *
 * Given an integer N, write a program that returns, in order, the first N regular numbers.
 */
public class DCP283 {

	public void firstNRegularNumbers(int n) {

		int[] arr = new int[n];
		int i2 = 0, i3 = 0, i5 = 0;
		int next_multiple_of_2 = 2;
		int next_multiple_of_3 = 3;
		int next_multiple_of_5 = 5;
		int next_ugly_no = 1;

		arr[0] = 1;

		for (int i = 1; i < n ; i++) {

			System.out.print(next_ugly_no + " ");

			next_ugly_no = Math.min(next_multiple_of_2,
					Math.min(next_multiple_of_3, next_multiple_of_5));

			arr[i] = next_ugly_no;
			if (next_ugly_no == next_multiple_of_2) {
				i2 = i2 + 1;
				next_multiple_of_2 = arr[i2] * 2;
			}

			if (next_ugly_no == next_multiple_of_3) {
				i3 = i3 + 1;
				next_multiple_of_3 = arr[i3] * 3;
			}

			if (next_ugly_no == next_multiple_of_5) {
				i5 = i5 + 1;
				next_multiple_of_5 = arr[i5] * 5;
			}
		}

	}
}
