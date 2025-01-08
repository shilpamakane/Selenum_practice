package palindrome;

public class PalindromeNumber {

	public static void main(String[] args)
	{
		int a=1221;
		int temp;
		int rev=0;
		int original_no=a;
		
		while(a>0)
		{
			temp=a%10;
			rev=rev*10+temp;
			a=a/10;
		}
		System.out.println(rev);
		if(rev==original_no)
		{
			System.out.println("number is palindrome number");
		}
		else
		{
			System.out.println("number is not palindrome number");
		}
	}

}
