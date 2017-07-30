package Assignment2;

import java.util.Scanner;
/**
 * 
 * @author Vishwas
 * crating a class ExceptionDemo as mentioned in question
 */
public class ExceptionDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Enter 5 string or name");
		/**
		 * Initializing the string array of size 5 as mentioned in question
		 */  
		String[] name = new String[5];
		
		/*
		 * taking input from the user as mentioned in question
		 */
		Scanner scanner = new Scanner(System.in);
		
		for (int k = 0; k < name.length; k++) { 
	/*
	 * Enter one string
	 */
		System.out.print("Enter " + (k + 1) + ": ");
		name[k] = scanner.next();
		}
	
		String string;
		System.out.print("\nEnter string or name to search: ");
		string = scanner.next();
		/*
		 * In here calling the method to search string in array
		 */
		String callStr = searchString(name, string);
		/*
		 * In  here taking a condition if the method returned null
		 * than it's means string not found
		 */
		if (callStr == null) {
			// window console
		System.out.println("String or name not found.");
		/*
		 * else string will be founded and result will be print
		 */
		} else {
			// window console
		System.out.println("String or name found");
		}
		}

		/*
		 * here we take the method to search the string
		 */
		private static String searchString(String[] name, String str) {
		try {
		int k;
		/*
		 * In here taking for loop to search the string in array
		 */
		for (k = 0; k < name.length; k++) {
		/*
		 * If string found than stop the loop
		 */
		if (name[k].equals(str)) {
		break;
		}
		}
		/*
		 * Here if the value of i is equal to array length
		 * then whole array traversed but
		 * string will not found
		 */
		
		if (k == name.length) {
		// In here exception will thrown
		throw new ValueNotFoundException();
		} else {
		/*
		 *  if i is less than array length, it means the value  will 
		 *  found so string will return
		 */
		
		return str;
		}
		} catch (ValueNotFoundException e) {
		
		return null;
		}
		}
	

}
