package swapeOfTwoNumber;

public class SwipetwonumbersWithoutThirdVeriable {

	public static void main(String[] args) 
	{
		//logic 1(addition and subtraction)
		int a=10;
		int b=20;
		System.out.println("before swapping of two numbers  "+a+"          "+b);
		a=a+b;//a=30
		b=a-b;//b=10
		a=a-b;//a=20
		/*
		 using logical operator
		 a=a^b;
		b=a^b;
		a=a^b;
		*/
		System.out.println("after swapping of two numbers   "+a+"          "+b);
		
		//logic2(multiplication and division)
		//here c and d values should not be 0
		int c=100;
		int d=200;
		System.out.println("before swapping of two numbers  "+c+"         "+d);
		c=c*d;//c=300
		d=c/d;//d=100
		c=c/d;//c=200
		System.out.println("after swapping of two numbers   "+c+"         "+d);
		
		//logic 3(single statement)
		int x=25;
		int y=35;
		System.out.println("before swapping of two numbers  "+x+"          "+y);
		y=x+y-(x=y);
		System.out.println("After swapping of two numbers   "+x+"          "+y);
	}

}
