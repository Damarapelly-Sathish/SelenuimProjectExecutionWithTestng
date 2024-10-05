package com.flipkart.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CrossBrowsing {
  WebDriver driver;
  @BeforeMethod
  @DataProvider(name="browser")
  public Object[] browser() 
  {
	  return new Object[] {"chrome","firefox"};
  }
  
  @Test(dataProvider="browser") 
  public void launch(String browser) {
	  if(browser=="chrome")
		  driver=new ChromeDriver();
	  else if(browser=="firefox")
		  driver=new FirefoxDriver();
  }
  @AfterMethod
  public void tearUp() {
	  driver.quit();
  }
}
