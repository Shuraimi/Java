//remove characrter of syring
import java.util.* ;
import java.io.*;
import java.util.Scanner;

class Solution {

	static String removeAllOccurrencesOfChar(String input, char c) {
		// Write your code here
		String removedStr = "";
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != c)
				removedStr += input.charAt(i);
		}
		return removedStr;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		char c = sc.next().charAt(0);
		String ans = removeAllOccurrencesOfChar(input, c);
		System.out.println(ans);
		if (ans.equals(input))
			System.out.println("Your string does not contain the specified character '" + c + "'\nTherefore your atring is " + ans);

		else
			System.out.println("Your string after removal of the specified character '" + c + "' is " + ans);

	}
}
