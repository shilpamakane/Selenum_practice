package logicalProgram;

public class CheckNumPrimeOrNot {

	public static void main(String[] args) 
	{
      int a=123;
      int count=0;
      if(a>1)
      {
    	  for(int i=1;i<=a;i++)
    	  {
    		  if(a%i==0)
    		  count++;

    	  }
    	  if(count==2)
    	  {
    		  System.out.println("prime");
    	  }
    	  else
    	  {
    		  System.out.println("not prime");
    	  }
      }
	}

}
//all prime number in between 20 number
/*
 public static void main(String[] args)
	    {
		int count=0;
		
		for(int i=2;i<=20;i++)
		{
			boolean flag=true;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.println(i);
			}
		}
		}
	}
	    


 * */
