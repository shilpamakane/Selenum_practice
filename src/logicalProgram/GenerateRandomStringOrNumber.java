package logicalProgram;

import java.util.Random;

public class GenerateRandomStringOrNumber {

	public static void main(String[] args) 
	{
		Random ran=new Random();
		//int num=ran.nextInt(10);//will give random number between 1-9
		double num=ran.nextDouble(15.25);
		System.out.println(num);

	}

}
