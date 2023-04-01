package scrabble;

// What I am hoping to achieve is getting the char and int to become an array when scoring,
// I tried using a HashMap in the earlier version, but I don't have the skills for that yet.

public class Tiles {
	
	char [] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 
						'H', 'I','J','K','L', 'M', 'N', 'O', 'P', 
						'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y','Z'};
	
	int [] points = {1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};
	
	
	// There are 100 tiles in the Scrabble. 9 A tiles, 2 B tiles and so forth... this will be picked in random.
	char [] tileBag = 
	{'A','A','A','A','A','A','A','A','A',
	 'B','B','C','C','D','D','D','D',
	 'E','E','E','E','E','E','E','E','E','E','E','E',
	 'F','F',
	 'G','G','G',
	 'H','H',
	 'I','I','I','I','I','I','I','I','I',
	 'J','K',
	 'L','L','L','L',
	 'M','M','M','M','M',
	 'N','N','N','N','N','N',
	 'O','O','O','O','O','O','O','O','O',
	 'P','P', 'Q',
	 'R','R','R','R','R','R',
	 'S','S','S','S',
	 'T','T','T','T','T','T',
	 'U','U','U','U',
	 'V','V',
	 'W','W',
	 'X',
	 'Y','Y',
	 'Z'};
	
	char[] playerTiles = new char[7];

	 
	}

