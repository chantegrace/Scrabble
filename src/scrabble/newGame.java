//new game class comes from the user requirement of project
//code is easier to digest of i used another class rather than having it in my main method.

package scrabble;

import java.util.Scanner;

public class newGame {
    String startGame;
    
    public void startGame() {
        Scanner input = new Scanner(System.in);
        String loadBoard;
        
        System.out.println("Would you like to _l_oad a board or use the _d_efault board?");
        System.out.println("Please enter your choice (l/d): ");
        
        loadBoard = input.nextLine();
        
        while (true) {
            if (loadBoard.equals("l")) {
                System.out.println("Please enter the file name of the board: ");
                //input some other code here. klkl
                
                
                
            }
            else if (loadBoard.equals("d")) {
                System.out.println("Using default board.");
            }
            else {
                System.out.println("This is not a valid choice. Please enter (l/d): ");
                loadBoard = input.nextLine();
                continue;
            }
            break;
        }
        
        input.close();
    }
}

