package com.blz.array;

import java.util.Random;
/*
 * maximum and minimu in the given array
 */

public class MaxMinInArray {

    public static void main(String[] args) {
	float[] arr = new float[5];
	Random random = new Random();
	float sum = 0f;

	// taking random as input
	for (int i = 0; i < arr.length; i++)
	    arr[i] = random.nextFloat(89.0f) + 10;

	// printing elements
	for (float element : arr) {
	    System.out.println(element);
	}
	float max = arr[0];
	float min = arr[0];

	// calculating min and max value in given array

	for (int i = 1; i < arr.length; i++) {
	    if (arr[i] > max)// check for max in array
		max = arr[i];
	    if (arr[i] < min)// check for min in array
		min = arr[i];
	}
	// printing min and max in given array
	System.out.println("max = " + max + "\nmin = " + min);

    }

}
