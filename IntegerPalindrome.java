package week1_assignments_javaBasics;

import java.util.Arrays;

public class IntegerPalindrome {

	public static void main(String[] args) {
		int nNumber = 7;
		String sReversedNumber ;
		System.out.println(nNumber);
		IntegerPalindrome IP = new IntegerPalindrome();
		sReversedNumber = IP.countDigit(nNumber);
		if(Integer.toString(nNumber).equals(sReversedNumber) )
		{
			System.out.println("GivenNumber"+nNumber+"is Palindrome");
		}
		else {
			System.out.println("GivenNumber"+nNumber+ "is not a Palindrome");
		}
		
	}
	
	// To calculate number of digits
	
	public String countDigit(int nNumber)
	{
		String[] aReverseNumber = {};
		int count = 0;
		int nthNumber = 0;
		String nReverseNumber = "";
		
			while( nNumber >0)
			{
				count = count+ 1;
			    nthNumber = nNumber%10;
				nNumber = nNumber/10;
				
				//System.out.println(count+"th place"+nthNumber);
				Arrays.asList(aReverseNumber);
				
				//ArrayList<String> cars = new ArrayList<String>(Arrays.asList(aReverseNumber));
				//System.out.println(cars);
				nReverseNumber = nReverseNumber+nthNumber;
				
			}
			
				
			
			System.out.println(nReverseNumber);
					
		
		return nReverseNumber;
	}
	

}
