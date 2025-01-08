package reverseNumber;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		int a=123;
		int rev=0;
		int temp;
		System.out.println("number before reverse= "+a);
		while(a>0)
		{
			temp=a%10;//123%10=3...2...1
			rev=rev*10+temp;//0+3=3,30+2,320+1
			a=a/10;//12...1...0
			
		}
		System.out.println("number after reverse= "+rev);

	}

}
