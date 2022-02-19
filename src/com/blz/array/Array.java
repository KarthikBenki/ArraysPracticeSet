package com.blz.array;

public class Array {
    public static void main(String[] args) {
	/*
	 * class room of 500 students-you have to store marks of these 500 students you
	 * have two options 1.create 500 variables 2.use array method
	 */
//	int[] marks = new int[5];// array syntax
	/*
	 * 1) int [] marks;//declaration marks = new int[5];//memory allocation
	 * 
	 * 2)int [] marks = new int[5];//declaration+memory allocation
	 * 
	 * 3)int [] marks = {100,70,30,42,60};//declare +initialize
	 */

//	marks[0] = 100;
//	marks[1] = 200;
//	marks[2] = 300;
//	marks[3] = 400;
//	marks[4] = 500;

	int[] marks = { 100, 70, 30, 42, 60 };
	System.out.println("marks = " + marks[4]);
	// to print all array
	for (int i = 0; i < marks.length; i++)
	    System.out.print(marks[i] + " ");

    }

}
