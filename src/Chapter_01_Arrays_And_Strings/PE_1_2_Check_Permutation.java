package Chapter_01_Arrays_And_Strings;

import java.util.Scanner;

/**
 * Check Permutation 
 * Given two strings, write a method to decide if one is a permutation of the other.
 * 
 * 02/
 * @author kevgu
 *
 */

public class PE_1_2_Check_Permutation 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter string 1: ");
		String s1 = input.nextLine();
		System.out.print("Enter string 2: ");
		String s2 = input.nextLine();
		
		if (isPermutation(s1, s2))
			System.out.println(s1 + " is a permutation of " + s2);
		else
			System.out.println(s1 + " is not a permutation of " + s2);
		
		input.close();
	}
	
	/**
	 * If the two strings are not the same length, they are not permutations of one another
	 * Uses ascii table to match decimal values. By default, an array of integers are set to 0.
	 * Each characters in s1 increment the specific index of the array by 1.
	 * Each characters in s2 decrement the specific index of the array by 1.
	 * Return true if all indexes in the array are only 0.
	 * 
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static boolean isPermutation(String s1, String s2)
	{
		if (s1.length() != s2.length())
			return false;
		
		int[] asciiArr = new int[256];
		
		for (int i = 0; i < s1.length(); i++)
		{	
			asciiArr[s1.charAt(i)]++;
			asciiArr[s2.charAt(i)]--;
		}
		
		for (int i = 0; i < asciiArr.length; i++)
			if (asciiArr[i] != 0)
				return false;
		
		return true;
	}
}
