//this program converts first letter of each word in a given string to uppeecase

import java.util.*;

public class EachWordCapitalised {

	static String capitalise(String s) {		String finalAns = "";

		String firstLetter = s.charAt(0) + "";

		//use this if you wanna convert char to string (very useful)

		firstLetter = firstLetter.toUpperCase();

		finalAns = firstLetter + s.substring(1, s.length());

		return finalAns;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your string to capitalise first letter ");

		String s = sc.nextLine() + " ";

		String ans = "";

		String finalAns = "";

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) != ' ')

				ans += s.charAt(i);

			else {

				finalAns = finalAns + " " + capitalise(ans);

				ans = "";

			}

		}

		System.out.println("Your string is " + finalAns);

	}

}
