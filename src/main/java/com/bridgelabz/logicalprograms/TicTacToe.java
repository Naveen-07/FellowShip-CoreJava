package com.bridgelabz.logicalprograms;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.bridgelabz.basiccoreprograms.utils.Utility;

public class TicTacToe {
	static Scanner scan;
	static String[] board;
	static String turn;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		board = new String[9];
		turn = "X";
		String winner = null;
		
		for (int i = 0; i < 9; i++) {
			board[i] = String.valueOf(i + 1);
		}
		
		System.out.println("Welcome to Tic Tac Toe 2 Player Game");
		System.out.println("------------------------------------");
		Utility.printBoard(board,turn);
		System.out.println("X's will play first. Enter a slot number to place X in :");
		
		
		while (winner == null) {
			int numInput;
			try {
				numInput = scan.nextInt();
				if (!(numInput > 0 && numInput <= 9)) {
					System.out.println("Invalid Input :Re-enter the Input");
					continue;
				}
			} catch (InputMismatchException e) {
				continue;
			}
			if (board[numInput - 1].equals(String.valueOf(numInput))) {
				board[numInput - 1] = turn;
				if (turn.equals("X")) {
					turn = "O";
				}
				else {
					turn = "X";
				}
				Utility.printBoard(board,turn);
				winner = Utility.checkWinner(board,turn);
			} else {
				System.out.println("Slot Already Taken, Re-enter Slot Number");
				continue;
			}
		}
		if (winner.equalsIgnoreCase("draw")) {
			System.out.println("Its a Draw! Thanks For Playing.");
		} else {
			System.out.println("Congratulations " + winner + " Thanks For Playing.");
		}
	}
	

}
