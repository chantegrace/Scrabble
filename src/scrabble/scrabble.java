package scrabble;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class scrabble {

	public static void main(String[] args) {
		
		//Initialises scrabble game, requirement to ask to load from default board or not
		//not entirely sure what that means.
		
		
		//calls object from newGame Class
		newGame scrabble = new newGame();
        scrabble.startGame();
        
        scrabbleBoard game = new scrabbleBoard();
        char[][] boardArray = game.getBoard();
        // print each row of the board
        for (int row = 0; row < boardArray.length; row++) {
            for (int col = 0; col < boardArray[row].length; col++) {
                System.out.print(boardArray[row][col] + "-");
            }
            System.out.println();
        
        }
		
        Tiles scrabbleTile = new Tiles();
        scrabbleTile.getPoints('A');
        System.out.println(scrabbleTile.getPoints('A'));
        scrabbleTile.getPlayerTiles();
       
 
 
		
		
		
		
		
		
		
		

	}

}
