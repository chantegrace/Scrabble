package pij.main;
    
public class ScrabbleManager {
    private char[][] board;

    public ScrabbleManager(int numRows, int numCols) {
        board = new char[numRows][numCols];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                board[i][j] = '-';
            }
        }
    }    
                
	public void placeWord(String word, int row, int col, char[] playerTiles) {
        // Check if the word can be placed on the board
        if (!canPlaceWord(word, row, col)) {
            System.out.println("The word can't be placed there.");
            return;
        }

        // Place the word on the board
        for (int i = 0; i < word.length(); i++) {
            board[row][col + i] = word.charAt(i);
        }

        // Remove the tiles used from the player's tiles
        for (int i = 0; i < word.length(); i++) {
            char tile = word.charAt(i);
            for (int j = 0; j < playerTiles.length; j++) {
                if (playerTiles[j] == tile) {
                    playerTiles[j] = '-';
                    break;
                }
            }
        }
    }

	private boolean canPlaceWord(String word, int row, int col) {
	    if (this.board == null) {
	        System.out.println("board is null");
	    }
	    // Check if word fits on the board
	    else if (col + word.length() > 15) {
	        return false;
	    }

	    // Check if the word overlaps with any existing letters
	    for (int i = 0; i < word.length(); i++) {
	        if (board[row][col + i] != '-') {
	            return false;
	        }
	    }

	    return true;
	}


    public void placeWordVertically(String word, int row, int col, char[] playerTiles) {
        // Check if the word can be placed on the board
        if (!canPlaceWordVertically(word, row, col)) {
            System.out.println("The word can't be placed there.");
            return;
        }

        // Place the word on the board
        for (int i = 0; i < word.length(); i++) {
            board[row + i][col] = word.charAt(i);
        }

        // Remove the tiles used from the player's tiles
        for (int i = 0; i < word.length(); i++) {
            char tile = word.charAt(i);
            for (int j = 0; j < playerTiles.length; j++) {
                if (playerTiles[j] == tile) {
                    playerTiles[j] = '-';
                    break;
                }
            }
        }
    }

    private boolean canPlaceWordVertically(String word, int row, int col) {
        // Check if word fits on the board
        if (row + word.length() > 15) {
            return false;
        }

        // Check if the word overlaps with any existing letters
        for (int i = 0; i < word.length(); i++) {
            if (board[row + i][col] != '-') {
                return false;
            }
        }

        return true;
    }
}
    