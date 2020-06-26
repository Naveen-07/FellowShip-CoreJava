package com.bridgelabz.functionalprograms;

import java.util.Arrays;

import com.bridgelabz.basiccoreprograms.utils.Utility;
import com.bridgelabz.utils.InputUtility;

public class TwoDArray {
	public static void main(String[] args) {
		System.out.println("enter the rows");
		int rows = InputUtility.getInt();
		System.out.println("enter the columns");
		int columns = InputUtility.getInt();
		int[][] array = Utility.insertIntoArray(rows, columns);

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(array[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println(Arrays.deepToString(array));
	}
}
