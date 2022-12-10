import java.util.Scanner;

class ReverseStringWordWise {

	static String ReverseStringWordWise(String input) {
		// Write your code here
		String reverse = "";
		int index = 0;
		input = input + " ";
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				reverse = input.substring(index, i) + " " + reverse;
				index = i + 1;
			}

		}
		return reverse;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String ans = reverseStringWordWise(input);
		System.out.println(ans);
	}
}
