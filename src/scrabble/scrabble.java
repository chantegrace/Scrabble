package scrabble;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class scrabble {
	
	
}
	
	public static void main(String[] args){
		/*
		Scanner String input = new Scanner(System.in);  
		
		System.out.println("Would you like to _l_oad a board or use the _d_efault board?");
		System.out.println("Please enter your choice (l/d): ");
		
		loadBoard = System.in;
		
		while(true) {
	
		if (loadBoard == "l") {
			System.out.println("Please enter the file name of the board: ");
		}
		
		else if (loadBaord == "d"){
			System.out.println("");
		}
		
		else {
			(loadBoard != "l" && "d"; {
			System.out.println("This is not a valid file. Please enter the file name of the board: ");
		}
		
	}
		}
*/
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("defaultboard.txt"));
			writer.write("Scrabble Board");
			writer.write("Hello");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
			
		try {
			BufferedReader reader = new BufferedReader(new FileReader ("defaultboard.txt")) {
			String line;{
			while((line = reader.readLine()) != null);
				System.out.println(line);
				reader.close();
		catch (IOException e) {
			e.printStackTrace();
		}
			}
		
		
			
		
}


