package logicalProgram;

public class FactorialNumber {

	public static void main(String[] args)
	{
		int a=3;
		int fact=1;
		//Ascending order
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		/*Descending order
		 for(int i=a;i<=1;i--)
		 {
		 fact=fact*i;
		 }
		 */
		System.out.println("factorial number="+fact);

	}

}
