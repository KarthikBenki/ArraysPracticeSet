package com.blz.array;

public class ReverseArray {
    public static void main(String[] args) {
	int arr[] = { 10, 20, 30, 40, 50 };
	int temp;
	// print array
	System.out.println("before reversal");
	for (int element : arr) {
	    System.out.print(element + " ");
	}
	// reversing logic
	for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
	    temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
	System.out.println();
	// printing after reversal
	System.out.println("after reversal");
	for (int element : arr) {
	    System.out.print(element + " ");
	}

    }
}
