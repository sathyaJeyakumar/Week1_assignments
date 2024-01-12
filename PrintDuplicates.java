package day2Assignments;

public class PrintDuplicates {

	public static void main(String[] args) {
		int[] num = {2, 5, 7, 7, 5, 9, 2, 3};
		
		PrintDuplicates PrintDeplicatesObj = new PrintDuplicates();
		PrintDeplicatesObj.FindDups(num);

	}
	
	public void FindDups(int numArray[])
	{
		System.out.println("List of Duplicates");
		for(int i=0;i<=numArray.length;i++ )
		{
			for(int j= i+1; j<numArray.length;j++)
			{
				if(numArray[i]==numArray[j])
				{
//					System.out.println("i="+i+"j="+j);
					System.out.println(numArray[i]);
				}
			}
		}
	}

}
