//OTP genarator
import java.util.*;
public class OTPgenerator {
	public static void main(String[] args) {
		String otp = "";
		int length = 4;
		for (int i = 1; i <= length; i++) {
			int r = (int)Math.floor(Math.random() * 10);
			otp = otp + r;
		}
		System.out.println("Dear user your  OTP is " + otp);
		//	System.out.println(Math.floor(2.6));
	}
}
