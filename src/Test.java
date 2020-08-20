/*
 * Name: Jonah Miller
 * Class: Programming Fundamentals
 * Semester: Summer 2020
 * Assignment: Assignment 4 - Set ADT
 */

import java.util.Scanner;


public class Test {
	
		public static void main(String[] args) {
			
			//Display identifier
			System.out.println("Programming Fundamentals Summer 2020");
			System.out.println("NAME: Jonah Miller");
			System.out.println("PROGRAMMING ASSIGNMENT 4");
			System.out.println();
			
			Set set = new Set();						//This is the set ADT which the program will call methods on
			Scanner userInput = new Scanner(System.in);	//This scanner will be used to scan for user commands
			String command;								//This is the string which user input will first be written to
			String[] commandArray = new String[2];		//This is the array which the user command will be split into
			int inputNumber;							//This is the integer which will be taken from commandArray[1]
			
			//This loop will always run.
			while (true == true) {
				
				//At the start of each loop, the user is prompted to enter their command. Expected format is "[command] [number]"
				//User input is then assigned to the command string, which is split into the commandArray using the split command
				System.out.print("Enter command: ");
				command = userInput.nextLine();
				commandArray = command.split(" ");
				
				//This try block is used to make sure the user entered an integer at commandArray[1].
				//If not, the program will ask for a valid input and restart the loop.
				try {
					
					//Converts the string at commandArray[1] to an integer
					inputNumber = Integer.parseInt(commandArray[1]);
					
					//The switch command is used to compare the first part of the user input to the list of valid methods
					//If the input is valid, the set method of the same name is called using the input number (if needed)
					//If the input is not valid, the default case is to ask for a valid command and restart the loop
					switch (commandArray[0]) {
					
					//The add method will be run if the input number does not already exist in the set
					//The return of the toString method is then printed
					case "add":
						if(!set.exists(inputNumber)) {
							set.add(inputNumber);
						}
						System.out.println(set.toString());
						break;
						
					//The del method is run
						//The return of the toString method is then printed
					case "del":
						set.delete(inputNumber);
						System.out.println(set.toString());
						break;
						
					//The boolean return of the exists method is printed
					case "exists":
						System.out.println(set.exists(inputNumber));
						break;
					
					default:
						System.out.println("Please enter a valid command.");
						}
					
				} catch (Exception e) {
					System.out.println("Please enter a valid number.");
				}	
				
			}
			
	}
		
}
