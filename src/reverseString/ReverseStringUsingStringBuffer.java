package reverseString;

public class ReverseStringUsingStringBuffer {

	public static void main(String[] args) 
	{
		String a="ABCD";
		String rev="";
		StringBuffer sb=new StringBuffer(a);
		System.out.println(sb.reverse());
		
	}

}
