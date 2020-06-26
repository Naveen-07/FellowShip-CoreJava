package com.bridgelabz.algorithmprograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.basiccoreprograms.utils.Utility;

public class BinarySearchWord {
	public static void main(String[] args) {
		Scanner scan1;
		try {
			scan1 = new Scanner(new File("C:\\Users\\NAVEENKUMAR\\Desktop\\naveen.txt"));
			ArrayList<String> arrayList = new ArrayList<String>();
			while (scan1.hasNext()) {
				arrayList.add(scan1.next());
			}
			String[] arr = new String[arrayList.size()];
			arrayList.toArray(arr);
			Arrays.sort(arr);

			System.out.println(Arrays.toString(arr));

			Scanner scan2 = new Scanner(System.in);
			String search = scan2.next();
			scan2.close();
			int location = Utility.binary(arr, 0, arr.length - 1, search);
			if (location != -1) {
				System.out.println("Element found at : " + location);
			} else {
				System.out.println("Element Not found");
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
