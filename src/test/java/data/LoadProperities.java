package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProperities {

	// load data from folder 
	public static Properties userdata = loadProperities(System.getProperty("user.dir")+"\\src\\main\\java\\Properities\\Userdata.properities");
	
	// (System.getProperty(("user.dir")+"\\src\\main\\java\\Properities\\Userdata.properities"));
	private static Properties loadProperities (String path)
	
	{
		
		Properties pro = new Properties ();
		try {
	FileInputStream stream = new FileInputStream(path);
	pro.load(stream);
		} catch (FileNotFoundException e) {
         System.out.println("error occured" + e.getMessage());
		}catch (IOException e) {
             System.out.println("error occured" + e.getMessage());
		}
		 return pro ;
	}
	
	
}
