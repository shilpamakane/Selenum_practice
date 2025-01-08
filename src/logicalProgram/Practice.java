package logicalProgram;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Practice 
{
	public static void main(String[] args) throws IOException 
	{
		FileWriter fw=new FileWriter("D:\\testing\\switch from infy preparation\\ganesh hurgule.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(" shilpa ");
		bw.write(" ganesh ");
		bw.write(" hurgule ");
		System.out.println("finished");
		bw.close();
		    }
		

	}

