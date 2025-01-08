package logicalProgram;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTestFile {

	public static void main(String[] args) throws IOException 
	{

      FileWriter fw=new FileWriter("D:\\testing\\switch from infy preparation\\ganesh hurgule.txt");
      BufferedWriter bw=new BufferedWriter(fw);
      bw.write("selenium");
      bw.write("java");
      bw.write("python");
      bw.write("testNG");
      System.out.println("finished");
bw.close();
	}

}
