//program to convert hexaDecimal to decimal after validating input
import java.util.*;
public class Main {
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
                //Above loop goes on untill the given input is a valid hexadecimal
		char ch;
		int j = 0;
		int k = 0;
		int dig = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			ch = s.charAt(i);
			j = ch;
			int above9;
			if (Character.isDigit(ch)) {
				j = ch - '0';
				dig = dig + (j * (int)Math.pow(16, k));
			} else if (j >= 65 && j <= 70) {
				if (j == 65)
					above9 = 10;
				else if (j == 66)
					above9 = 11;
				else if (j == 67)
					above9 = 12;
				else if (j == 68)
					above9 = 13;
				else if (j == 69)
					above9 = 14;
				else
					above9 = 15;
				dig = dig + (above9 * (int)Math.pow(16, k));
				//System.out.println("Character");
			}

			k++;

		}
		System.out.println(dig);

	}
}
