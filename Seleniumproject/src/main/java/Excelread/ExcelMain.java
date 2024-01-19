package Excelread;

import java.io.IOException;

public class ExcelMain {
	
	
	
	
	public static void main(String[] args) throws IOException 
	
	{
		String s =Excelclass.readStringData(1,1);
		System.out.println(s);
		
		double p =Excelclass.readIntegerData(0, 0);
				System.out.println(p);
		
		
	}

}
