package logicalProgram;

public class RemoveSpaceFromString {

	public static void main(String[] args) 
	{
		String a="shilpa ganagdhar makane";
		System.out.println("string before space removal -->"+a);
		String noSpace=a.replaceAll("\\s","");
		System.out.println("string with sapce--> "+noSpace);

	}

}
