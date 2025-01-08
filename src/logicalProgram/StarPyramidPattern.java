package logicalProgram;

public class StarPyramidPattern {

	public static void main(String[] args)
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		System.out.println();
		for(int a=4;a>=1;a--)
		{
			for(int b=4;b>=a;b--)
			{
				System.out.print(" ");
			}
			for(int c=1;c<=a;c++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}


	}

}
