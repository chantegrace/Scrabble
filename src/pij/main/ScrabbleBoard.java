package pij.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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
                board[i][j] = '-';
            }
        }
    }

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