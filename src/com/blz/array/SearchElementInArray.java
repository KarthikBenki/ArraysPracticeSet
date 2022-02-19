package com.blz.array;

import java.util.Scanner;

/*
 * write a program to find out whether	
 * a given is present in a given array
 */
public class SearchElementInArray {

    public static void main(String[] args) {
	int n = 5;
	int search = 5;
	int[] arr = new int[n];
	int flag = 0;
	Scanner scanner = new Scanner(System.in);

	for (int i = 0; i < arr.length; i++) {
	    System.out.printf("enter the %d th element\n", i);
	    arr[i] = scanner.nextInt();
	}
	System.out.println("**********************");
	for (int i = 0; i < arr.length; i++) {
	    System.out.println(arr[i]);
	}

	for (int i = 0; i < arr.length; i++) {
	    if (arr[i] == search) {
		flag = 1;
		break;
	    }
	}
	if (flag == 1) {
	    System.out.println("present");
	} else {
	    System.out.println("Not present");
	}
	scanner.close();
    }
}
