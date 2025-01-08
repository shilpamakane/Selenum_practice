package logicalProgram;

public class ArmstrongNumber {

	public static void main(String[] args)
	{
		/*********check if given number is Armstrong number or not ************/
		/*int a=1634;
		int rev=0;
		int temp;
		int arm=a;
		while(a>0)
		{
			temp=a%10;
			rev=rev+temp*temp*temp*temp;
			a=a/10;
		}
		if(arm==rev)
		{
			System.out.println("arms number");
		}
		else
		{
			System.out.println("not arms number");
		}
	}*/
	/*********Print all Armstrong number between 1to 1000 ************/
	 for(int i=0;i<=10000;i++)
	 {
		 int temp=0;
		 int rev=0;
		 int a=i;
		 while(a>0)
		 {
			 temp=a%10;
			 rev=rev+(temp*temp*temp);
			 a=a/10;
		 }
		 if(i==rev)
		 {
			 System.out.println(i);
		 }
		 }
	 }

}
