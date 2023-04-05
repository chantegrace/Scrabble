package pij.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

    public class ScrabbleBoard {
        private char[][] board;

        public ScrabbleBoard(int numRows, int numCols) {
            board = new char[numRows][numCols];
            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j < numCols; j++) {
                    if (i == 0 && j == 0) {
                        board[i][j] = '*'; // Starting point
                    } else if ((i == 0 || i == numRows - 1) && (j == 3 || j == numCols - 4)) {
                        board[i][j] = 't'; // Triple word score
                    } else if ((i == 0 || i == numRows - 1) && (j == 0 || j == numCols - 1)) {
                        board[i][j] = 'd'; // Double word score
                    } else if ((i == 1 || i == numRows - 2) && (j == 2 || j == numCols - 3)) {
                        board[i][j] = 'T'; // Triple letter score
                    } else if ((i == 1 || i == numRows - 2) && (j == 1 || j == numCols - 2)) {
                        board[i][j] = 'D'; // Double letter score
                    } else {
                        board[i][j] = '-'; // Blank tile
                    }
                }
            }
        }

        public char[][] getBoard() {
            return board;
        }
   
    String filename = "scrabble_board.txt";
	String directory = "Scrabble";
	String filepath = directory + File.separator + filename;
	File file = new File(filepath);

public boolean isValidWord(String word) throws IOException {
    BufferedReader reader = new BufferedReader(new FileReader("/Users/chante/eclipse-workspace/Scrabble/DictionaryUK.txt"));
    Set<String> dictionary = new HashSet<String>();
    String line;
    while ((line = reader.readLine()) != null) {
        dictionary.add(line);
    }
    reader.close();
    return dictionary.contains(word);
}

    public boolean placeWord(String word, int startRow, int startCol, boolean isHorizontal) {
        int wordLength = word.length();
        int rowChange = isHorizontal ? 0 : 1;
        int colChange = isHorizontal ? 1 : 0;
        int endRow = startRow + rowChange * (wordLength - 1);
        int endCol = startCol + colChange * (wordLength - 1);

        if (endRow >= board.length || endCol >= board[0].length) {
            return false;
        }

        for (int i = 0; i < wordLength; i++) {
            char tile = word.charAt(i);
            int row = startRow + i * rowChange;
            int col = startCol + i * colChange;
            if (board[row][col] != ' ' && board[row][col] != tile) {
                return false;
            }
        }

        for (int i = 0; i < wordLength; i++) {
            char tile = word.charAt(i);
            int row = startRow + i * rowChange;
            int col = startCol + i * colChange;
            board[row][col] = tile;
        }

        return true;
    }

    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public void writeBoard() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("scrabble_board.txt"));

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    writer.write(board[i][j]);
                    writer.write(" ");
                }
                writer.newLine();
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}