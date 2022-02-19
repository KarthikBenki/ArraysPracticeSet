package com.blz.array;

import java.util.Random;

public class ThreeDimentionalArray {

    public static void main(String[] args) {
	int[][][] arr = new int[2][3][4];
	Random random = new Random();

	for (int i = 0; i < arr.length; i++) {
	    for (int j = 0; j < arr[i].length; j++) {
		for (int k = 0; k < arr[i][j].length; k++) {
		    arr[i][j][k] = random.nextInt(10);
		}
	    }

	    for (int i1 = 0; i1 < arr.length; i1++) {
		for (int j = 0; j < arr[i1].length; j++) {
		    for (int k = 0; k < arr[i1][j].length; k++) {
			System.out.printf("arr[%d][%d][%d] = %d", i1, j, k, arr[i1][j][k]);
			System.out.print(" ");
		    }
		    System.err.println();
		}
		System.err.println();
	    }

	}

    }
}
