package ArrayProgram;

import java.util.Arrays;

public class SortOfElement_BubbleSort {

	public static void main(String[] args) 
	{
	 int a[]= {4,1,3,2,5};
	 System.out.println("Before sorting"+Arrays.toString(a));
	 int n=a.length;
	 for(int i=0;i<n-1;i++)//number of passes
	 {
		 for(int j=0;j<n-1;j++) //iterations in passes
		 {
			 if(a[j]>a[j+1])
			 {
				 int temp=a[j];
				 a[j]=a[j+1];
				 a[j+1]=temp;
			 }
		 }
	 }
	 System.out.println("After sorting"+Arrays.toString(a));
	}
	
	/*
	 * public static void main(String[] args) 
    {
       int a[]={2,1,5,4,3};//1,2,4,3,5//12,3,4,5
       for(int i=0;i<a.length;i++)
       {
           int temp;
           for(int j=i+1;j<a.length;j++)
           {
               if(a[i]<a[j])
               {
                   temp=a[j];
                   a[j]=a[i];
                   a[i]=temp;
               }
           }
       }
       System.out.println(Arrays.toString(a));
    }
	 */

}
