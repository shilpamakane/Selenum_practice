package ArrayProgram;

public class MinMaxFromArray {

	public static void main(String[] args)
	{
		int a[]= {20,90,50,70,10,60};
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("max element ="+max);
        int b[]= {10,50,40,05,100,02};
        int min=b[0];
        for(int j=1;j<a.length;j++)
        {
        	if(b[j]<min)
        	{
        		min=b[j];
        	}
        }
        System.out.println("min element ="+min);
        		
	}

}
