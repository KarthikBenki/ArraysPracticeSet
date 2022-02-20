package com.blz.array;

public class SortingOfArray {

    public static void main(String[] args) {
	int arr[] = { 1, 2, 3, 12, 26, 44 };
	boolean isSorted = true;

	for (int i = 0; i < arr.length - 1; i++) {
	    if (arr[i] > arr[i + 1]) {
		isSorted = false;
		break;
	    }
	}
	if (isSorted)
	    System.out.println("sorted");
	else
	    System.out.println("not sorted");

    }

}
