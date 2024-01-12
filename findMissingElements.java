package day2Assignments;

import java.util.Arrays;

/* find the missing elements*/
public class findMissingElements {

	public static void main(String[] args) {
		
		int[] a = {1, 4,3,2,8, 6, 7};
		Arrays.sort(a);
		
		for(int i=0; i<6; i++) 
		{
			System.out.println(a[i]+"änd"+(i+1));
			if(a[i]!=i+1)
			{
				System.out.println("Missing element is"+ (i+1));
				break;
			}
		}
		
		
	}

}
