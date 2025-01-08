package ArrayProgram;

import java.util.HashSet;

public class DuplicateElementFromArray {

	public static void main(String[] args)
	{
		int a[]= {10,20,30,20,50,60,50};
		Boolean flag=false;
		/*
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("duplicate element= "+a[i]);
					flag=true;
				}
			}
		}
		if(flag==false)
		{
			System.out.println("no duplicate element");
		}
*/
		//method 2
		HashSet<Integer>  lan=new HashSet();
		for(int dup:a)
		{
			if(lan.add(dup)==false)
			{
				System.out.println("duplicate values = "+dup);
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("No duplicate");
		}
	}

}
