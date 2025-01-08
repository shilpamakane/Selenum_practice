package logicalProgram;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CurrentDateAndTime {

	public static void main(String[] args) 
	{
		Date d=new Date();
		System.out.println(d.toString());
	System.out.println(d.getHours());
	System.out.println(d.getSeconds());
	System.out.println(d.getMinutes());
	System.out.println(d.getDate());
	System.out.println(d.getMonth());
	System.out.println(d.getYear());
	SimpleDateFormat sf=new SimpleDateFormat("dd/MM/yyyy");
	System.out.println(sf.format(d));
	Calendar cl=Calendar.getInstance();


	}

}
