package pij.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Players extends Tiles {

	private ScrabbleBoard board;
	String humanPlayer = "Human :";
	String computerPlayer = "Computer :";


	public Players(ScrabbleBoard board) {
		this.board = board;
	}
	public void humanTurn() {
		// Generate the tileList
		List<Character> tileList = new ArrayList<>();
		for (char letter : letters) {
			for (int i = 0; i < pointsMap.get(letter); i++) {
				tileList.add(letter);
			}
		}
		Collections.shuffle(tileList);

		// Populate the playerTiles array with a random selection of tiles
		char[] playerTiles = new char[7];
		for (int i = 0; i < 7; i++) {
			playerTiles[i] = tileList.remove(0);
		}

		// Display the player's tiles
		System.out.println("Human Player your tiles are: ");
		for (char tile : playerTiles) {
			System.out.print(tile + " ");
		}
		System.out.println();

		try (Scanner takeWord = new Scanner(System.in)) {
		    System.out.println("Please enter your move with letter sequence, "
		            + "position, and direction (d for down, r for right) separated by commas. "
		            + "Entering just two commas passes.");
		    System.out.println("Please enter a word:");
		    while (!takeWord.hasNextLine()) {} // Waiting for user input before crashing
		    String word = takeWord.nextLine();
		    System.out.println("Enter the starting row:");
		    int row = takeWord.nextInt();
		    System.out.println("Enter the starting column:");
		    int col = takeWord.nextInt();
		    System.out.println("Enter the direction (r for right, d for down):");
		    String direction = takeWord.next();
		    boolean isHorizontal = direction.equals("r");
		    board.placeWord(word, row, col, isHorizontal);
		    System.out.println("Your move has been made.");
		    board.placeWord(word, row, col, false);
		} catch (NumberFormatException e) {
		    e.printStackTrace();
		}


	}


	//Due to time limitations computerTurn is functioned by an actual player.
	public void computerTurn() {
		// Generate the tileList
		List<Character> tileList = new ArrayList<>();
		for (char letter : letters) {
			for (int i = 0; i < pointsMap.get(letter); i++) {
				tileList.add(letter);
			}
		}
		Collections.shuffle(tileList);

		// Populate the playerTiles array with a random selection of tiles
		char[] playerTiles = new char[7];
		for (int i = 0; i < 7; i++) {
			playerTiles[i] = tileList.remove(0);
		}

		// Display the player's tiles
		System.out.println("Computer, your tiles are: ");
		for (char tile : playerTiles) {
			System.out.print(tile + " ");
		}
		System.out.println();

		try (Scanner scanner = new Scanner(System.in)) {
			// Computer is make to be automatic but for the sake of time

			try (Scanner takeWord = new Scanner(System.in)) {
			    System.out.println("Please enter your move with letter sequence, "
			            + "position, and direction (d for down, r for right) separated by commas. "
			            + "Entering just two commas passes.");
			    System.out.println("Please enter a word:");
			    while (!takeWord.hasNextLine()) {} // Waiting for user input before crashing
			    String word = takeWord.nextLine();
			    System.out.println("Enter the starting row:");
			    int row = takeWord.nextInt();
			    System.out.println("Enter the starting column:");
			    int col = takeWord.nextInt();
			    System.out.println("Enter the direction (r for right, d for down):");
			    String direction = takeWord.next();
			    boolean isHorizontal = direction.equals("r");
			    board.placeWord(word, row, col, isHorizontal);
			    System.out.println("Your move has been made.");
			    board.placeWord(word, row, col, false);
			} catch (NumberFormatException e) {
			    e.printStackTrace();
			}

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

