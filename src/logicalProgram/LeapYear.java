package logicalProgram;

public class LeapYear {

	public static void main(String[] args)
	{
		int year=2017;
		if(year%4==0 && year%100!=0)
		{
			System.out.println("leap");
		}
		else
		{
			System.out.println("not");
		}
	}

}
