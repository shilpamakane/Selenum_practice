package ArrayProgram;

import java.util.ArrayList;

public class CountofAllNumbersInArray {

	public static void main(String[] args)
	{
		int a[]= {1,2,3,1,4,5,5,2,3,3};
		ArrayList<Integer> al=new ArrayList<>();//
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			if(!al.contains(a[i]))
			{
				al.add(a[i]);
				count++;
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			
			System.out.println(a[i]+":"+count);
			//if(k==1)
				//System.out.println(a[i]+":unique number");
		}

	}
	}
}

		