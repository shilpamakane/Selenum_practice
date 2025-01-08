package lengthOfNumber;

public class CountNumberOfDigit {

	public static void main(String[] args)
	{
		int a=12345;
		int count=0;
		while(a>0)
		{
			a=a/10;
			count=count+1; //or count++
		}
		System.out.println("number of digit : "+count);
	}

}
