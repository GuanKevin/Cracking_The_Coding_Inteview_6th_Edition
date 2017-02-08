package Chapter_01_Arrays_And_Strings;

import java.util.Scanner;

/**
 * Is Unique
 * Implement an algorithm to determine if a string has all unique characters. 
 * What if you cannot use additional data structures?
 * 
 * 02/
 * @author kevgu
 *
 */

public class PE_1_1_Is_Unqiue 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter string: ");
		Scanner input = new Scanner(System.in);
		
		if (isUnique(input.nextLine()))
			System.out.println("String contains only unique chracters");
		else
			System.out.println("String does not contain only unique characters");
		
		input.close();
	}
	
	/**
	 * Uses the ASCII table to check if the string contains only unique values
	 * by creating a boolean table that initially stores false value and set index to true
	 * on each character read. If an index is already true, the string does not contain only unique values 
	 * 
	 * @param string
	 * @return
	 */
	public static boolean isUnique(String string)
	{
		boolean [] tracker = new boolean[256];
		
		for(int i = 0; i < string.length(); i++)
		{
			if(tracker[(int)string.charAt(i)] == false)
				tracker[(int)string.charAt(i)] = true;
			else
				return false;
		}
		return true;
	}
}
