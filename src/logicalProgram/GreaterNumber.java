package logicalProgram;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args)
	{
		//method 1
	 /*Scanner sc=new Scanner(System.in);
	 System.out.println("enter 1st number");
	 int a=sc.nextInt();
	 System.out.println("enter 2nd number");
	 int b=sc.nextInt();
	 System.out.println("enter 3rd number");
	 int c=sc.nextInt();
     if(a>b && a>c)
     {
    	 System.out.println("a is greater number");
     }
     else if (b>a && b>c)
     {
    	 System.out.println("b is greater number");
     }
     else
     {
    	 System.out.println("c is greater number");
     }
     */
		//method 2 //using teranary operator
		int a=10;
		int b=50;
		int larg=a>b?a:b;
		System.out.println(larg);
	}

}
