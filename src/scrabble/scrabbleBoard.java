package scrabble;


// Creating Board class for game
// Scrabble Class for the Board
// plain 26 x 12 Scrabble board as required.
// will need to figure out how to make the the col and row say the 

    public class scrabbleBoard {
    char[][] board;

    public scrabbleBoard() {
        board = new char[26][12];
        // initialise board with blank tiles
        for (int row = 0; row < 26; row++) {
                for (int col = 0; col < 12; col++) {
                    board[row][col] = ' ';
                }
            }
        } 
        
        public char[][] getBoard() {
            return board;
        }  
    }