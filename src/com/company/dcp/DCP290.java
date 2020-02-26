package com.company.dcp;

/***
 * This problem was asked by Facebook.
 *
 * On a mysterious island there are creatures known as Quxes which come in three colors: red, green, and blue.
 *
 * One power of the Qux is that if two of them are standing next to each other, they can transform into a single creature of the third color.
 *
 * Given N Quxes standing in a line, determine the smallest number of them remaining after any possible sequence of such transformations.
 *
 * For example, given the input ['R', 'G', 'B', 'G', 'B'], it is possible to end up with a single Qux through the following steps:
 */

public class DCP290 {

	public void findMinimumSeq(char[] quexes) {
		System.out.println(minLeft(quexes));
	}

	int minLeft(char[] quxes) {
		int red = 0, green = 0, blue = 0;
		for(char c : quxes) {
			switch (c) {
				case 'R':
					red++;
					break;
				case 'G':
					green++;
					break;
				case 'B':
					blue++;
					break;
			}
		}
		if(red == quxes.length || green == quxes.length || blue == quxes.length) {
			return quxes.length;
		}
		if(red % 2 == green % 2 && red % 2 == blue % 2) {
			return 2;
		}
		return 1;
	}
}
