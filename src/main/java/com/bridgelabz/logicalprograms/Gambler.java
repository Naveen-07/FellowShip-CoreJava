package com.bridgelabz.logicalprograms;

import com.bridgelabz.basiccoreprograms.utils.Utility;
import com.bridgelabz.utils.InputUtility;

public class Gambler {
	public static void main(String[] args) {
		int stake = InputUtility.getInt();
		int goal = InputUtility.getInt();
		int trials = InputUtility.getInt();
		
		Utility.gamblingSimulate(stake, goal, trials);
	}
}
