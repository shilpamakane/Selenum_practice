package ArrayProgram;

public class CountEvenOddNumberInArray {

	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5,6};
		int evenCount=0;
		int oddCount=0;
		//for(int i=0;i<a.length;i++)
		for(int b:a)
		{
			if(b%2==0)
			{
				System.out.println(b);
				evenCount++;
				
			}
			
			
		}
		System.out.println("Odd numbers:");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
				oddCount++;
			}
		}
		System.out.println("even:"+evenCount);
		System.out.println("odd"+oddCount);
	}

}
