package reverseString;

public class ReveseStringUsingCharArray {

	public static void main(String[] args)
	{
		String str="makane";
		String rev="";
		int len=str.length();
		System.out.println("before reverse="+str);
		char a[]=str.toCharArray();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		
		System.out.println(rev);
	}

}
