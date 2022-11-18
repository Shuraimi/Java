//function to validate hexadecimal and return true if true
import java.util.*;
public class ValidateHexadecimal {
	static boolean isHexa(String s) {
		int j;
		char ch;
		boolean flag = false;
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			j = ch;
			if (Character.isDigit(ch)) {

				flag = true;
			} else if (j >= 65 && j <= 70) {

				flag = true;
			} else {
				flag = false;
			}

		}
		return flag;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		boolean Hexa;
		do {
			System.out.println("Enter your string");
			s = sc.nextLine();
			Hexa = isHexa(s);
		} while (!Hexa);
		System.out.println(Hexa);

	}
}
