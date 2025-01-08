package logicalProgram;

public class PrintPrimeNumber {

	public static void main(String[] args)
	{
		int count=0;
		for(int i=1;i<=20;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.print(" "+i);
			}
			else
			{
				count=0;
			}
			
		}

	}

}
