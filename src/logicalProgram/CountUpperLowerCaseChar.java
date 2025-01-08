package logicalProgram;

public class CountUpperLowerCaseChar {

	public static void main(String[] args) 
	{
		//print all uppercase and lowercase char in console
		String a="sHilPa";
		/*String upperCount="";
		String lowerCount="";
		for(int i=0;i<a.length();i++)
		{
			char ch=a.charAt(i);
			if(ch>=65 && ch<=90)
			{
				upperCount=upperCount+ch;
			}
			else
			{
				lowerCount=lowerCount+ch;
			}
		}
		System.out.println(upperCount);
System.out.println(lowerCount);*/
		int upper=0;
		int lower=0;
		for(int i=0;i<a.length();i++)
		{
			char ch=a.charAt(i);
			if(ch>=65 && ch<=90)
			{
				upper++;
			}
			else
			{
				lower++;
			}
			
		}
		System.out.println("upper = "+upper);
		System.out.println("lower = "+lower);
	}

}
