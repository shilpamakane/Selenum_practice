package ArrayProgram;

import java.util.Arrays;
import java.util.Collections;

public class SortOfElement_BuiltinMethod {

	public static void main(String[] args) 
	{
		//way 1
		int a[]= {40,20,30,10,50};
		System.out.println("before sorting :"+Arrays.toString(a));
		Arrays.parallelSort(a);
		 
		System.out.println("After sorting"+Arrays.toString(a));
		//way 2
		System.out.println();
		 int b[]= {4,1,3,2,5};
		 System.out.println("Before sorting"+Arrays.toString(b));
		 Arrays.sort(b);
		 System.out.println("After sorting"+Arrays.toString(b));
		 //Descending order
		 System.out.println();
		 Integer c[]= {4,1,3,2,5};
		 System.out.println("Before sorting"+Arrays.toString(c));
		 Arrays.sort(c,Collections.reverseOrder());
		
		 System.out.println("After sorting"+Arrays.toString(c));
		 
	}

}
