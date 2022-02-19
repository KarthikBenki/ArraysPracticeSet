package com.blz.array;

import java.util.Random;
/*
 * create an array of five floats and calculate their sum
 */

public class FiveFloatSum {

    public static void main(String[] args) {
	float[] arr = new float[5];
	Random random = new Random();
	float sum = 0f;
	// taking random as input
	for (int i = 0; i < arr.length; i++)
	    arr[i] = random.nextFloat(10.0f);

	// printing elements and their sum
	for (float element : arr) {
	    System.out.println(element);
	    sum = sum + element;
	}
	// printing sum
	System.out.println("sum of five float numbers is " + sum);

    }

}
