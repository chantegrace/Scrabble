package pij.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tiles {
    private Map<Character, Integer> pointsMap = new HashMap<>();
    private char[] letters;
    private int[] points;
    private char[] playerTiles;

    public Tiles() {
        letters = new char[] 
                 {'A', 'B', 'C', 'D', 'E', 'F', 'G', 
                  'H', 'I', 'J', 'K', 'L', 'M', 'N', 
                  'O', 'P', 'Q', 'R', 'S', 'T', 'U', 
                  'V', 'W', 'X', 'Y', 'Z'};
        
        points = new int[] {1, 3, 3, 2, 1, 4, 2, 
                            4, 1, 8, 5, 1, 3, 1, 
                            1, 3, 10, 1, 1, 1, 1,
                            4, 4, 8, 4, 10};
        
        for (int i = 0; i < letters.length; i++) {
            pointsMap.put(letters[i], points[i]);
        }
        
        // Populate the playerTiles array with a random selection of tiles
        playerTiles = new char[7];
        List<Character> letterList = new ArrayList<>();
        for (char letter : letters) {
            for (int i = 0; i < pointsMap.get(letter); i++) {
                letterList.add(letter);
            }
        }
        Collections.shuffle(letterList);
        for (int i = 0; i < 7; i++) {
            playerTiles[i] = letterList.get(i);
        }
    }

    public int getPoints(char letter) {
        return pointsMap.get(Character.toUpperCase(letter));
    }
    
    public char[] getPlayerTiles() {
        return playerTiles;
    }
    
}
