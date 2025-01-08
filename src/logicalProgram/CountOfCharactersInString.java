package logicalProgram;

public class CountOfCharactersInString {

	public static void main(String[] args) 
	{
		String a="shilpa ganesh hurgule";
		int totalCount=a.length();
		System.out.println(totalCount);
		int CountAfterRemoval=a.replace("h","").length();
		System.out.println(CountAfterRemoval);
		int countOfA=totalCount-CountAfterRemoval;
		System.out.println("Toatal count of h:"+countOfA);
		
	}

}
