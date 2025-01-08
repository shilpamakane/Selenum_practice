
package lengthOfNumber;

public class CountEvenOddDigit {

	public static void main(String[] args)
	{
		int a=123456789;
		int even_count=0;
		int Odd_count=0;
		while(a>0)//0>0
		{
			int reminder=a%10;//1%10=1
			if(reminder%2==0)//1%2==0
			{
				even_count++;
			}
			else
			{
				Odd_count++;
			}
			a=a/10;//1/10=0
			
		}
		System.out.println("even number count= "+even_count);
		System.out.println("even number count= "+Odd_count);
	}

}
