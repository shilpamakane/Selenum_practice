package reverseNumber;

import java.util.Scanner;

public class ReverseNumberUsingStringBufferClass {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int num=s.nextInt();
		StringBuffer sc=new StringBuffer(String.valueOf(num));
		StringBuffer rev=sc.reverse();
		System.out.println(rev);
	}

}
