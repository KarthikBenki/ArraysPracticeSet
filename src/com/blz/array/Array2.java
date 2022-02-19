package com.blz.array;

public class Array2 {
    public static void main(String[] args) {

//	float[] marks = { 100.2f, 200.3f };
//	String[] students = { "kila", "akila", "kilakila", "lokesh" };
	int[] marks = { 100, 70, 30, 42, 60 };
	System.out.println(marks[0]);
	System.out.println("Marks array length = " + marks.length);
	// to print in reverse order
	for (int i = marks.length - 1; i >= 0; i--) {
	    System.out.println(marks[i]);
	}

	// displaying usin for-each
	for (int elements : marks)
	    System.out.print(elements + " ");

    }

}
