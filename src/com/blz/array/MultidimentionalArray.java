package com.blz.array;

import java.util.Random;

public class MultidimentionalArray {
    public static void main(String[] args) {
	int[][] arr = new int[2][3];
	Random random = new Random();

	for (int i = 0; i < arr.length; i++) {
	    for (int j = 0; j < arr[i].length; j++) {
		arr[i][j] = random.nextInt(25);
	    }
	}

	for (int i = 0; i < arr.length; i++) {
	    for (int j = 0; j < arr[i].length; j++) {
		System.out.printf("a[%d][%d] = %d ", i, j, arr[i][j]);
	    }
	    System.out.println();
	}
    }

}
