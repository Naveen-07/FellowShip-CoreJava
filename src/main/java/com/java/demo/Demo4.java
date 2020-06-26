package com.java.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Demo4 {
	public static void main(String[] args) {
		try {
			Scanner fileReader = new Scanner(new FileInputStream("C:\\Users\\NAVEENKUMAR\\Downloads\\Sacramentorealestatetransactions.csv"));
			while (fileReader.hasNext()) {
				System.out.println(fileReader.next());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
