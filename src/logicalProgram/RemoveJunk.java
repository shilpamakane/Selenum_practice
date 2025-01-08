package logicalProgram;

public class RemoveJunk {

	public static void main(String[] args) 
	{
		String a="@shilpa123%$makane!*^123ganesh";
		String b=a.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(b);
	}

}
