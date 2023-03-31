package scrabble;


// Creating Board class for game
// Scrabble Class for the Board

    public class scrabbleBoard {
    char[][] board;

    public scrabbleBoard() {
        board = new char[26][12];
        
        // initialise board with blank tiles
        for (int row = 0; row < 26; row++) {
            for (int col = 0; col < 12; col++) {
                board[row][col] = ' ';
            }
            // printing the board
            //have not tried because my main class is a flop
            System.out.println(board);
        }
    }
   
    
}

