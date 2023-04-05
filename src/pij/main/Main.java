package pij.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {
    	
    	String filename = "DictionaryUK.txt";
    	String directory = "Scrabble";
    	String filepath = directory + File.separator + filename;
    	File file = new File(filepath);

    	//Loads Board Screen
    	System.out.println("Welcome to Scrabble! My PiJ project.");
    	
    	NewGame start = new NewGame();
    	start.startGame();
    	   	
    	//Initialises Blank Board
    	ScrabbleBoard board;
		try {
			board = new ScrabbleBoard("defaultboard.txt");
			board.placeWord(" ", 0, 0, true);
	        board.printBoard();
	        //Method to write down plain text.
	        board.writeBoard();
		
       
        
        // 100 Tile Bags from Official Scrabble Game
        
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

        ArrayList<Character> tileList = new ArrayList<Character>();
        for (char c : tileBag) {
            tileList.add(c);
        }
      
     
        		
        //Time for the Players
        Players player1 = new Players(board);
        Players player2 = new Players(board);
        
        //while loop to start.

    

        player1.humanTurn();     
        player2.computerTurn();
        
        // get tiles for the human player
        char[] player1Tiles = player1.getPlayerTiles();
        char[] player2Tiles = player2.getPlayerTiles();

        //Game Manager
        ScrabbleManager game = new ScrabbleManager(15,15, player2);
        game.placeWord("TEST", 7, 7, true) ;

        //Score Manager
        ScrabbleScoreManager score = new ScrabbleScoreManager();
        score.calculateScore(player1Tiles);
        score.calculateComputerScore(player2Tiles);
      
        
        ///outer while loop
        
        //Final winner
        score.getWinner();
        
        
        
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
    
}
   