package main;

public class SudukoSolver {

	public static void main(String[] args) {

		int[][] board = { { 0, 0, 7, 0, 3, 0, 0, 9, 6 }, 
						  { 0, 0, 4, 1, 0, 0, 0, 5, 0 }, 
						  { 3, 0, 0, 0, 0, 5, 0, 0, 0 },
						  { 0, 0, 0, 0, 7, 8, 9, 0, 0 }, 
						  { 0, 0, 0, 0, 0, 0, 1, 0, 0 }, 
						  { 0, 0, 0, 0, 6, 0, 3, 0, 4 },
						  { 6, 0, 2, 0, 0, 4, 0, 0, 0 }, 
						  { 0, 0, 1, 0, 0, 7, 0, 0, 0 }, 
						  { 5, 0, 0, 0, 0, 0, 8, 0, 0 } };

		BoardManager board1 = new BoardManager();

		board1.setBoard(board);

		board1.printBoard();

		board1.test();
		
		//board1.test();

		System.out.println("\n \n");

		board1.printBoard();

	}

}
