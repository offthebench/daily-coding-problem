package com.company.dcp;

/***
 * Given an array of integers, determine whether it contains a Pythagorean triplet.
 *
 * Recall that a Pythagorean triplet (a, b, c) is defined by the equation a2+ b2= c2.
 */
public class DCP282 {

	public void containsPythagoreanTriplet(int[] n) {

		int maximum = findMax(n);

		if(isTriplet(n, maximum)){
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

	private boolean isTriplet(int[] n, int maximum) {
		int[] hash = new int[maximum + 1];

		for (int value : n) {
			hash[value]++;
		}

		for (int i = 1; i < maximum + 1; i++) {

			if (hash[i] == 0)
				continue;

			for (int j = 1; j < maximum + 1; j++) {

				if (i == j && hash[i] == 1 || hash[j] == 0)
					continue;

				int val = (int) Math.sqrt( i * i + j * j);

				if ((val * val) !=  ( i * i + j * j))
					continue;

				if (val > maximum)
					continue;

				if (hash[val] == 1)
					return true;
			}
		}
		return false;
	}

	private int findMax(int[] n) {
		var max = 0;
		for (int value : n) {
			max = Math.max(max, value);
		}
		return max;
	}
}
