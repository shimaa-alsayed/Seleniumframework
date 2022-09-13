package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	
	static FileInputStream fis = null ;
	
	public FileInputStream getfileinputstream () 
	
	{
		String filepath = System.getProperty("user.dir")+"/src/test/java/data/UserData.xlsx";
		File srcfile = new File (filepath);
		try {
			fis = new FileInputStream (srcfile);
		} catch (FileNotFoundException e) {
			System.out.println("Error occured "+ e.getMessage());
				System.exit(0);
		}
		
		return fis;
	}
		
	public Object [][] getexceldata() throws IOException	
	{
		fis = getfileinputstream();
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet   sheet = wb.getSheetAt(0);
		int totalnumberofrow = (sheet.getLastRowNum()+1);
		
		int totalnumberofcoloms = 4;
		
		String [][] arrayofexceldata = new String [totalnumberofrow][totalnumberofcoloms];
		
		for(int i = 0; i< totalnumberofrow ; i++)
		{
			
			for (int j = 0 ; j <totalnumberofcoloms ; j++)
			{
				XSSFRow row = sheet.getRow(i);
				arrayofexceldata [i][j] = row.getCell(j).toString();
			}}
				
				
			wb.close();
				
			return arrayofexceldata;	
	}}
		
		
	

