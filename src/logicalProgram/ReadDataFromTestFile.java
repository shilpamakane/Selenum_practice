package logicalProgram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTestFile {

	public static void main(String[] args) throws IOException
	{
		/*
		//way1:fileReader bufferReader
		FileReader f=new FileReader("D:\\testing\\switch from infy preparation\\ganesh hurgule.txt");
		BufferedReader br=new BufferedReader(f);
		String str;
		while((str=br.readLine())!= null)
		{
			System.out.println(str);
		}
		br.close();*/
//way2
		 System.out.println("\nReading file using Scanner:");
	        File fl = new File("D:\\testing\\switch from infy preparation\\ganesh hurgule.txt");
	        Scanner sc = new Scanner(fl);
	        while (sc.hasNextLine()) {
	            System.out.println(sc.nextLine()); // Corrected to read and print the line
	        }
	        sc.close();
	}

}
