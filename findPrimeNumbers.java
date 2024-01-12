package day2Assignments;

/*Iterate through all numbers from 2 to n-1 (input) and for every number check if 
it divides n (input). 
If we find any number that divides, print non-prime. */
public class findPrimeNumbers {

	public static void main(String[] args) {
			int nEnteredNumber = 700;
			boolean bIsPrime = false;
			
			for (int i =2;i<=nEnteredNumber-1;i++)
			{
				if(nEnteredNumber%i == 0)
				{
					System.out.println("Entered number "+nEnteredNumber+" is not a prime number");
					break;
				}
				else
					bIsPrime = true;										
			}
			if(bIsPrime)
				System.out.println("Entered number "+nEnteredNumber+"ïs  Prime number");
	}
}
	
/* Method 2 - to find prime number or not
public static void main(String[] args) {
	int nNum = 100;
	int count = 0;
	for (int i=2;i<nNum/2;i++)
	{
		
		if(nNum%i == 0)
		{
			count = count+1;
			break;
		}
	}
	if(count > 1)
	{
		System.out.println(nNum+"is a not  prime");
	}
	else
	{
		System.out.println(nNum+"is a prime");
	}
} */
