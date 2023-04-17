import java.util.Scanner;

public class TicTacToe {

	public static void printPlane(String[][] board) {
		for(int i =0; i<board.length; i++) {
			for(int j = 0; j<board[i].length; j++) {
				System.out.print(board[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void takeInput(String[][] board, String[] pieces, int nTurns) {
		Scanner scanner = new Scanner(System.in);
		int row;
		int column;
		boolean overbound = false;
		boolean taken = false;
		do {
			printPlane(board);
			System.out.println("Player " + pieces[nTurns%2] + " enter position you'd like to play in. Rows and colummns start from 0 up to 2. Write the numbers"
					+ "one after the other with a space inbetween.");
			//System.out.println("Enter row:");
			row = scanner.nextInt();
			//System.out.println("Enter column:");
			column = scanner.nextInt();
			if(row > 2 || row <0 || column > 2 || column <0) {
				System.out.println("Place out of bounds. Please try again.");
				overbound = true;
				
				
			}
			else if(board[row][column] != "*") {
				System.out.println("Place already occupied. Please try again.");
				taken = true;
				
			}
			else {
				overbound = false;
				taken = false;
			}
			
		}
		while(taken || overbound );
		board[row][column] = pieces[nTurns%2];
		
	}

	public static void main(String[] args) {
		String[][] board = new String[3][3];
		String[] pieces = {"X","O"};
		
		for(int i =0; i<board.length; i++) {
			for(int j = 0; j<board[i].length; j++) {
				board[i][j] = "*";
			}
		}
		
		boolean[] players = {false, false}; //P1 with even indexes, P2 with odd indexes.
		int nTurns = 0;
		
		do {
			takeInput(board,pieces,nTurns);
			nTurns++;
			checkForWinner(board, pieces, players);
		}
		while(players[0] == false && players[1] == false && checkForRemainingEmpty(board));
		printPlane(board);
		if(players[0] == true) {
			System.out.println("Player X won.");
		}
		else if(players[1] == true) {
			System.out.println("Player O won.");
		}
		else {
			System.out.println("It is a tie.");
		}
		
		
	}

	private static boolean checkForRemainingEmpty(String[][] board) {
		boolean remainingSpace = false;
		for(int i = 0; i<=2; i++) {
			for(int j = 0; j<=2; j++) {
				if(board[i][j] == "*") {
					return !remainingSpace;
				}
			}
		}
		return remainingSpace;
	}

	public static void checkForWinner(String[][] board, String[] pieces, boolean[] players) {
		for(int i =0; i<board.length; i++) {
			if(board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
				String piece = board[i][0];
				if(piece == pieces[0]) {
					players[0] = true;
					return;
				}
				else if(piece ==pieces[1]) {
					players[1] = true;
					return;
				}
				
			}
		}
		
		for(int i =0; i<board[0].length; i++) {
			if(board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
				String piece = board[0][i];
				if(piece == pieces[0]) {
					players[0] = true;
					return;
				}
				else if(piece ==pieces[1]) {
					players[1] = true;
					return;
				}
				
			}
		}
		
		if((board[0][0] == board[1][1] && board[1][1] == board[2][2]) || (board[0][2] == board[1][1] && board[1][1] == board[2][0])) {
			String piece = board[1][1];
			if(piece == pieces[0]) {
				players[0] = true;
				return;
			}
			else if(piece ==pieces[1]) {
				players[1] = true;
				return;
			}
		}
		
	}
}