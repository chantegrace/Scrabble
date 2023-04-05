package pij.main;

import java.util.Scanner;

public class Players extends Tiles {
	
	private ScrabbleBoard board;
	String humanPlayer = "Human :";
	String computerPlayer = "Computer :";
	
	
	public Players(ScrabbleBoard board) {
	    this.board = board;
	}
	public void humanTurn() {
	    // Display the player's tiles
	    System.out.println(humanPlayer + "Your tiles: ");

	    // Get the player's tiles
	    char[] playerTiles = getPlayerTiles();

	    // Display the player's tiles
	    for (char tile : playerTiles) {
	        System.out.print(tile + " ");
	    }
	    System.out.println();

	    try (Scanner scanner = new Scanner(System.in)) {
	        // Ask the player to choose a word
	        System.out.println("Enter a word using your tiles: ");
	        String word = "";
	        if (scanner.hasNextLine()) {
	            word = scanner.nextLine();
	        }
	        System.out.println("You entered: " + word);

	        // Ask the player to choose a position to place the word
	        System.out.println("Enter the starting row and column of the word (e.g. A1): ");
	        String position = "";
	        if (scanner.hasNextLine()) {
	            position = scanner.nextLine();
	        }
	        System.out.println("You entered: " + position);

	        // Place the word on the board
	        int row = 0;
	        int col = 0;
	        if (position.length() >= 2) {
	            row = Character.toUpperCase(position.charAt(0));
	            col = Integer.parseInt(position.substring(1)) - 1;
	        }
	        board.placeWord(word, row, col, false);
	    } catch (NumberFormatException e) {
	        e.printStackTrace();
	    }
	}

	    
	    //Due to time limitations computerTurn is functioned by an actual player.
	    public void computerTurn() {
	    	    // Display the player's tiles
	    	    System.out.println(computerPlayer + "Your tiles: ");

	    	    // Get the player's tiles
	    	    char[] playerTiles = getPlayerTiles();

	    	    // Display the player's tiles
	    	    for (char tile : playerTiles) {
	    	        System.out.print(tile + " ");
	    	    }
	    	    System.out.println();

	    	    try (Scanner scanner = new Scanner(System.in)) {
	    	        // Ask the player to choose a word
	    	        System.out.println("Enter a word using your tiles: ");
	    	        String word = "";
	    	        if (scanner.hasNextLine()) {
	    	            word = scanner.nextLine();
	    	        }
	    	        System.out.println("You entered: " + word);

	    	        // Ask the player to choose a position to place the word
	    	        System.out.println("Enter the starting row and column of the word (e.g. A1): ");
	    	        String position = "";
	    	        if (scanner.hasNextLine()) {
	    	            position = scanner.nextLine();
	    	        }
	    	        System.out.println("You entered: " + position);

	    	        // Place the word on the board
	    	        int row = 0;
	    	        int col = 0;
	    	        if (position.length() >= 2) {
	    	            row = Character.toUpperCase(position.charAt(0));
	    	            col = Integer.parseInt(position.substring(1)) - 1;
	    	        }
	    	        board.placeWord(word, row, col, false);
	    	    } catch (NumberFormatException e) {
	    	        e.printStackTrace();
	    	       
	    	    }
	    	    
	    	    /* Original plan of computerTurn() public boolean isValidWord() throws IOException {
	    BufferedReader reader = new BufferedReader(new FileReader("/Users/chante/eclipse-workspace/Scrabble/DictionaryUK.txt"));
	    Set<String> dictionary = new HashSet<String>();
	    String line;
	    while ((line = reader.readLine()) != null) {
	        dictionary.add(line);
	    }
	    reader.close();
	    return dictionary.contains(word);
	}

	public String computerTurn(ScrabbleBoard board, char[] computerTiles) {
	    // Get all valid words from the computer's rack
	    try {
			boolean validWords = isValidWord();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    String word = toString();

	    return word;
	}
}

*/
}
}
