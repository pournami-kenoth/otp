import java.util.*; 

public class Otp
{ 
	static char[] OTP(int len) 
	{ 
		System.out.println("Generating OTP: "); 
		System.out.print("You OTP is : "); 

		String numbers = "0123456789"; 

    Random rand = new Random(); 

		char[] otp = new char[len]; 
		
		for (int i = 0; i < len; i++) 
		    otp[i] = numbers.charAt(rand.nextInt(10)); 
		return otp; 
	} 
	public static void main(String[] args) 
	{ 
		int length = 7; 
		System.out.println(OTP(length)); 
	} 
} 
