
/*
 * Name: Jonah Miller
 * Class: Programming Fundamentals
 * Semester: Summer 2020
 * Assignment: Assignment 4 - Set ADT
 */

//Creates the set Data Structure, which consists of a single linked node which will always serve as the first or end of the set

public class Set {
	
	LinkedNode first;	//This node is the first in the set.
	
	//Default constructor
	Set() {
		first = null;
	}
	
	//This method creates a new LinkedNode and assigns it the given integer as it's x value
	//The next node in the new LinkedNode is then assigned as the current first node of the set
	//The first node of the set is then assigned as newNode, thus growing the set by one while maintaining the position of the first node
	void add(int x) {
			
			LinkedNode newNode = new LinkedNode(x);
			newNode.next = first;
			first = newNode;
	}
	
	//This method functions by first creating a LinkedNode which is a duplicate of the first linked node in the set (meaning it contains all other linked notes within the set)
	//An empty set named reverse set is created
	//A while loop then parses through each node in the duplicate, and if the input value is not equal to the integer value of the current node, it is assigned to the temporary set
	//Because this starts with the first node and runs forward, the temporary set will be in reverse order
	//To remedy this, the above process is run again, this time assigning each LinkedNode in the temporary set to the original
	//The first node of the real set is then set equal to the first node of the temporary set
	void delete(int x) {
		
		
		LinkedNode next = first;
		Set reverseSet = new Set();
		
		while (next!=null) {
			
			if (next.x != x) {
				reverseSet.add(next.x);
			}
			
			next = next.next;
		}
		
		next = reverseSet.first;
		first = null;
		
		while (next!=null) {
			
			add(next.x);
			next = next.next;
		}

	}
	
	//This method functions by first creating a LinkedNode which is a duplicate of the first linked node in the set (meaning it contains all other linked notes within the set)
	//A while loop parses through each node in the duplicate, and checks it's integer value against the input integer x.
	//If x exists within, the method returns true. Otherwise it returns true.
	boolean exists(int x) {
		
		boolean exists = false;
		
		LinkedNode next = first;
		
		while (next!=null) {
			
			if (next.x == x) {
				exists = true;
			}
			
			next = next.next;
		}
		
		return exists;
	}
	
	//This method functions by first creating a LinkedNode which is a duplicate of the first linked node in the set (meaning it contains all other linked notes within the set)
	//A while loop then parses through each LinkedNode in the duplicate, adding the integer of each node to the string which will be returned
	public String toString() {
		
		String string = "";
		LinkedNode next = first;
		
		while (next!=null) {
			string += next.x + " ";
			next = next.next;
		}		
		
		return string;
	}
	

}
