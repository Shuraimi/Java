//Octal to Hexadecimal after validating input
import java.util.*;
public class OctalToHexadecimal{
        //Function which is used to validate the input whether octal or not
	static boolean isOctal(int N) {
		int dig;
		while (N != 0) {
			dig = N % 10;
			if (dig > 7)
				return false;
			N = N / 10;
		}
		return true;
	}
    static int octalToDecimal(int n){
        int deci = 0;
		int i = 0;
		int dig;
		while (n != 0) {
			dig = n % 10;
			deci = deci + (dig * (int)Math.pow(8, i));
			n = n / 10;
			i++;
    }
    return deci;
}
    static String decimalToHexadecimal(int n){
        String rem="";//used string
		while(n!=0){
		    if(n%16==10)
		    rem='A'+rem;//remainder
		    else if(n%16==11)
		    rem='B'+rem;
		    else if(n%16==12)
		    rem='C'+rem;
		    else if(n%16==13)
		    rem='D'+rem;
		    else if(n%16==14)
		    rem='E'+rem;
		    else if(n%16==15)
		    rem='F'+rem;
		    else
		    rem=(n%16)+rem;
		    n=n/16;//quotient
	}
    return rem;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("Enter you number to be converted from Octal to Hexadecimal");
			n = sc.nextInt();
		} while (!(isOctal(n)));
        //Above do..while loop goes on untill the given input is a valid octal  
        int octDeci=octalToDecimal(n);
        String deciHex=decimalToHexadecimal(octDeci);
        System.out.println("Your Hexadecimal number after conversion is "+deciHex);
		
		}
		
	}

