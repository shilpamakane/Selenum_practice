package ArrayProgram;

import java.util.Arrays;

public class CheckArraysEqual {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,4,5};
		Boolean equals=Arrays.equals(a,b);
		//method1
		/*
		 * 
		if(equals==true)
		{
			System.out.println("arrays are equals");
		}
		else
		{
			System.out.println("arrays are not equals");
		}
		*/
        //method 2
		if(a.length==b.length)
		{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=b[i])
			{
				equals=false;
			}
		}
		}
		else
		{
			equals=false;
		}
		if(equals==true)
		{
			System.out.println("arrays are equals");
		}
		else
		{
			System.out.println("arrays not equals");
		}
	}
	

}
