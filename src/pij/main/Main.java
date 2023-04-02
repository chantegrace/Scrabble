package pij.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		//Initialises scrabble game, requirement to ask to load from default board or not
		//not entirely sure what that means.
		
		
		//calls object from newGame Class
		
		// need to add a while loop somewhere 
		newGame scrabble = new newGame();
        scrabble.startGame();
        
        
        ///Board Print
        
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
        scrabbleTile.getPlayerTiles();
        
       
      // initialize the tileBag and playerTiles arrays
        char[] tileBag = {'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 
        		          'B', 'B', 'C', 'C', 'D', 'D', 'D', 'D', 
        		          'E', 'E', 'E', 'E', 'E', 'E', 'E', 'E', 'E', 'E', 'E', 'E', 
        		          'F', 'F', 'G', 'G', 'G', 'H', 'H', 
        		          'I', 'I', 'I', 'I', 'I', 'I', 'I', 'I', 'I', 
        		          'J', 'K', 'L', 'L', 'L', 'L', 
        		          'M', 'M', 'M', 'M', 'M', 
        		          'N', 'N', 'N', 'N', 'N', 'N', 
        		          'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 
        		          'P', 'P', 'Q', 
        		          'R', 'R', 'R', 'R', 'R', 'R', 
        		          'S', 'S', 'S', 'S', 
        		          'T', 'T', 'T', 'T', 'T', 'T', 
        		          'U', 'U', 'U', 'U', 
        		          'V', 'V', 'W', 'W', 'X', 'Y', 'Y', 'Z'};

        char[] playerTiles = new char[7];

        ArrayList<Character> tileList = new ArrayList<Character>();
        for (char c : tileBag) {
             tileList.add(c);
           }

        // shuffle the tileList to get a random order of tiles
        Collections.shuffle(tileList);

       // 7 tiles from the shuffled tileList
        for (int i = 0; i < 7; i++) {
        playerTiles[i] = tileList.get(i);
         }

        System.out.println("Your turn: Your tiles are: ");
        for (char c : playerTiles) {
        	 System.out.print(c + " ");
        		}
        
        
        	
	
	
	
	
	
	}
	
        }
