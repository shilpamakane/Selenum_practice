package reverseString;

public class ReverseString {

	public static void main(String[] args)
	{
		String a="shilpa";
		String rev="";
		System.out.println("before revesr string="+a);
		for(int i=a.length()-1;i>=0;i--)//i=5(6-1)
		{
			rev=rev+a.charAt(i);//rev=(0+a)5th
		}
System.out.println("before revesr string="+rev);
	}

}
