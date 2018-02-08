package Utilities1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class configuration1 {
	
	private static Properties prop;
	public static void configuration(){
	File file=new File("src/main/resources/project.properties");
	
    InputStream get1 = null;
    try{
 		
    	get1=new FileInputStream(file);
    
	} catch (FileNotFoundException e) {
		e.printStackTrace();
}
    
    prop = new Properties();
    
    try {
		prop.load(get1);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
    
    public static String getBrowser(){
    	
    	return prop.getProperty("browser");
    }
    

    public static String getURL(){
    	
    	return prop.getProperty("url");
    }
    
	}


