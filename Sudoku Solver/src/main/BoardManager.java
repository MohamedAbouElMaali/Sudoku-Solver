package main;
import java.util.Scanner;

class BoardManager {
	Scanner scan = new Scanner(System.in);
	int[][] board;
	int[][] boardTemp = new int[9][9];
	boolean isSolved = false;

	public void setBoard(int[][] board) {
		this.board = board;
		boardTemp = board;
	}

	public void printBoard() {
		for (int row = 0; row < board.length; row++) {
			System.out.println();
			if (row % 3 == 0 && row != 0) {
				System.out.println("------------");
			}
			for (int column = 0; column < board[row].length; column++) {
				if (column % 3 == 0 && column != 0) {
					System.out.print("|");
				}
				System.out.print(board[row][column]);
				if (column == board[row].length - 1 && row == board.length - 1)
					System.out.println("");
			}
		}
	}

	public void test() {
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[row].length; col++) {
				if (board[row][col] == 0) {
					for (int i = 1; i < 10; i++) {
						if (isPossible(row, col, board, i)) {
							boardTemp[row][col] = i;
							test();
						}
					}
					return; 
					
				}

			}
		}
		isSolved = true;
	}

	public boolean isPossible(int row, int column, int[][] board, int place) {
		return checkRow(row, board, place) && checkColumn(column, board, place)
				&& checkSquare(row, column, board, place);
	}

	private boolean checkRow(int row, int[][] board, int place) {
		for (int i = 0; i < board[row].length; i++) {
			if (board[row][i] == place) {
				return false;
			}
		}
		return true;
	}

	private boolean checkColumn(int column, int[][] board, int place) {
		for (int i = 0; i < board.length; i++) {
			if (board[i][column] == place) {
				return false;
			}
		}
		return true;
	}

	private boolean checkSquare(int row, int column, int[][] board, int place) {
		int squareRow = row - row % 3;
		int squareColumn = column - column % 3;

		for (int rowOfSquare = 0; rowOfSquare < 3; rowOfSquare++) {
			for (int columnofSquare = 0; columnofSquare < 3; columnofSquare++) {
				if (board[squareRow + rowOfSquare][squareColumn + columnofSquare] == place) {
					return false;
				}
			}
		}
		return true;
	}

}