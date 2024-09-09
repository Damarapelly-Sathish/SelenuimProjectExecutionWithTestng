package com.flipkart.qa.base;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
     public static  WebDriver driver=new ChromeDriver(); ;
     public static Properties pro=new Properties();
      
     
	public BaseClass() throws IOException {
    	  BufferedReader reader;
    	  reader=new BufferedReader(new FileReader("C:\\Users\\Ashok\\Downloads\\demo\\src\\main\\java\\com\\flipkart\\config\\propertites"));
    	  pro.load(reader);
      }
    
    @SuppressWarnings("deprecation")
	public static void  intialData() {
    	if(pro.getProperty("browser")=="chrome") {
//    		((Properties) driver).setProperty("driver.chrome.driver","E:\\SelemiumProject\\chromedriver-win64");
    	}
    	driver.get(pro.getProperty("url"));
    	driver.manage().deleteAllCookies();
    	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); // / * depreated -*  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);*/
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
}
