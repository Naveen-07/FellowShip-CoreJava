package com.bridgelabz.logicalprograms;

import com.bridgelabz.utils.InputUtility;

public class StopWatch {
	public static void main(String[] args) {
		boolean status = true;
		long startTime = 0;
		
		do {
			System.out.println("Type 'start' to START Timer");
			if (InputUtility.getString().equalsIgnoreCase("start")) {
				startTime = System.currentTimeMillis();
				System.out.println("Stop Watch started");			
				System.out.println("Type 'Stop' to STOP Timer");
				status = false;
			}
			else {
				System.out.println("Enter proper Input");
			}
		} while (status);

		do {
			
			if (InputUtility.getString().equalsIgnoreCase("stop")) {
				long elapsedTime = (System.currentTimeMillis() - startTime) / 1000;
				System.out.println(elapsedTime);
				status = false;
			}
			else {
				System.out.println("Enter proper Input");
			}
		} while (status);
	}
}
