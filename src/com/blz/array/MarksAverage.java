package com.blz.array;

import java.util.Random;
/*
 *
 */

public class MarksAverage {

    public static void main(String[] args) {
	float[] arr = new float[5];
	Random random = new Random();
	float sum = 0f;
	// taking random as input
	for (int i = 0; i < arr.length; i++)
	    arr[i] = random.nextFloat(50.0f) + 10;

	// printing elements and their sum
	for (float element : arr) {
	    System.out.println(element);
	    sum = sum + element;
	}
	// printing avg
	System.out.println("sum is " + sum);
	System.out.println("avg of marks is is " + sum / arr.length);

    }

}
