package com.blz.array;

public class AddTwoMatrices {

    public static void main(String[] args) {

	int mat1[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
	int mat2[][] = { { 2, 6, 13 }, { 3, 7, 1 } };
	int mat3[][] = new int[2][3];
//adding two 2d array using for loop
	for (int i = 0; i < mat1.length; i++) {
	    for (int j = 0; j < mat1[i].length; j++) {
		mat3[i][j] = mat1[i][j] + mat2[i][j];
	    }
	}
//printing resultant 2d array
	for (int i = 0; i < mat1.length; i++) {
	    for (int j = 0; j < mat1[i].length; j++) {
		System.out.print(mat3[i][j] + "   ");
	    }
	    System.out.println();
	}
    }
}
