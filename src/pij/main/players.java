package pij.main;

import java.util.Scanner;

public class players extends Tiles, scrabbleBoard {
	
	String humanPlayer = "You";
	String computerPlayer = "Computer";


public void playerTurn() {
    // Display the player's tiles
    System.out.println("Your tiles: ");
    for(char tile : playerTiles) {
        System.out.print(tile + " ");
    }
    System.out.println();
    
    // Ask the player to choose a word
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a word using your tiles: ");
    String word = scanner.nextLine();
    
    // Ask the player to choose a position to place the word
    System.out.println("Enter the starting row and column of the word (e.g. A1): ");
    String position = scanner.nextLine();
    
    // Place the word on the board
    board.placeWord(word, position, playerTiles);
}
}