package pij.main;

import java.util.HashMap;
import java.util.Map;

public class ScrabbleScoreManager {
    private Map<Character, Integer> letterValues;
    private int humanScore;
    private int computerScore;

    public ScrabbleScoreManager() {
        // Set up the letter values
        letterValues = new HashMap<>();
        letterValues.put('A', 1);
        letterValues.put('B', 3);
        letterValues.put('C', 3);
        letterValues.put('D', 2);
        letterValues.put('E', 1);
        letterValues.put('F', 4);
        letterValues.put('G', 2);
        letterValues.put('H', 4);
        letterValues.put('I', 1);
        letterValues.put('J', 8);
        letterValues.put('K', 5);
        letterValues.put('L', 1);
        letterValues.put('M', 3);
        letterValues.put('N', 1);
        letterValues.put('O', 1);
        letterValues.put('P', 3);
        letterValues.put('Q', 10);
        letterValues.put('R', 1);
        letterValues.put('S', 1);
        letterValues.put('T', 1);
        letterValues.put('U', 1);
        letterValues.put('V', 4);
        letterValues.put('W', 4);
        letterValues.put('X', 8);
        letterValues.put('Y', 4);
        letterValues.put('Z', 10);

        // Initialize the scores to 0
        humanScore = 0;
        computerScore = 0;
    }

    public void calculateScore(char[] tiles) {
        // Calculate the score for the tiles and add it to the human score
        for (char tile : tiles) {
            if (letterValues.containsKey(tile)) {
                humanScore += letterValues.get(tile);
            }
        }
        }
        
        

        // Calculate the score for the computer and add it to the computer score
     public void calculateComputerScore(char[] tiles) {
        for (char tile : tiles) {
            if (letterValues.containsKey(tile)) {
                computerScore += letterValues.get(tile);
            }
        }
    }

    public String getWinner() {
        if (humanScore > computerScore) {
            return "Human player wins!";
        } else if (humanScore < computerScore) {
            return "Computer player wins!";
        } else {
            return "It's a tie!";
        }
    }
}
