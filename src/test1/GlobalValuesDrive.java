package test1;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {

	public static void main(String[] args) throws IOException {
		
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\rishavsri\\eclipse-workspace\\TestN\\data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		prop.setProperty("browser", "Firefox");
		System.out.println(prop.getProperty("browser"));

	}

}
