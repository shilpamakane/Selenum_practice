package ArrayProgram;

public class SearchElement_LinearSearch {

	public static void main(String[] args)
	{
		int a[]= {10,20,30,50,40};
		boolean flag=true;
		int search=30;
		for(int i=0;i<a.length;i++)
		{
			if(search==a[i])
			{
				System.out.println("element at"+i);
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("element not fount");
		}
	}

}
