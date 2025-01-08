package logicalProgram;

public class ReverseEachWordInString {

	public static void main(String[] args) 
	{
		//way 1
		String a="i love ganesh";
		String[] word=a.split(" ");//will get each word (spliting string into word)
		String revString="";
		for(String w:word)
		{
			String revWord="";
			for(int i=w.length()-1;i>=0;i--)
			{
				revWord=revWord+w.charAt(i);
			}
			revString=revString+revWord+" ";
		}
		System.out.println(revString);
		
		//way 2
		String s="ganesh shilpa";
		String[] st=s.split(" ");
		String revWord1="";
		for(String words:st)
		{
			StringBuilder sb=new StringBuilder(words);
			sb.reverse();
			revWord1=revWord1+sb.toString()+" ";
		}
		System.out.println(revWord1);

	}

}
