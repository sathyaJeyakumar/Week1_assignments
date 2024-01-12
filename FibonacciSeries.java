package day2Assignments;
/* Fibonacci series 0 1 1 2 3 5 8 13*/

public class FibonacciSeries {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c;
		int count = 5;
        System.out.print(a+"\t"+b+"\t");//printing 0 and 1    
       //index starts from 2 to count-1 as first two numbers r printed above     
		 for(int i=2;i<count;++i) 
		 {    
		  c = a+b;    
		  System.out.print(c+"\t");    
		  a = b;    
		  b = c;    
		 } 
	}

}
