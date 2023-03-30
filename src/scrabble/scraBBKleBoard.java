package scrabble;


// Creating Board class for game
// Array is currently not working for me.
public class scraBBKleBoard {
	
	int [][] board;
	
	public void board (int, int)
		board = this.board;
	
	// requirements for board size is 26 x 12
	String[][] board = new int [26][12];
	
	//for loop to iterate through the board.
	
	for (int i = 0; i < 26; i++) {
	    for (int j = 0; j < 12; j++) {
	        board[i][j] = ' ';
	    }
	}
	
	System.out.println(board);

}
