/*
 * Name: Jonah Miller
 * Class: Programming Fundamentals
 * Semester: Summer 2020
 * Assignment: Assignment 4 - Set ADT
 */

//NOTE: This code is taken from the example given in lecture.

// This class encapsulates an int value as a linked node
public class LinkedNode {
	int x;            // The data value
	LinkedNode next;  // Reference to the next LinkedNode
	
	// Default constructor
	LinkedNode() {
		next = null;
	}
	
	// Constructor that initializes the data value
	LinkedNode(int x) {
		this.x = x;
	}
	
}