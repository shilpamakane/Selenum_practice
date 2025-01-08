package palindrome;

public class PalindromeString {

	public static void main(String[] args) {
		String a="abc";
		String rev="";
		String ori_String=a;
		int len=a.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
		}
		System.out.println(rev);
		if(ori_String.equals(rev))
		{
			System.out.println("string palindrome");
		}
		else
		{
			System.out.println("string not palindrome");
		}
	}

}
