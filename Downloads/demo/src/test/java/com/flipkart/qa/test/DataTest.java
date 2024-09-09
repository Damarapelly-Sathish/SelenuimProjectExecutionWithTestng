 package com.flipkart.qa.test;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.collections.ArrayIterator;

import com.excel.amazon.util.XlsReader;
import com.flipkart.qa.base.BaseClass;
import com.flipkart.qa.pages.LoginPage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class DataTest extends BaseClass {
	LoginPage login;
	public DataTest() throws IOException  {
		super();
	}
	
	@BeforeMethod
	public void setUpWeb() throws IOException {
		intialData();
		 login=new LoginPage();
	}
	
    @DataProvider
    public static Iterator<Object[]>  getFileData() throws InvalidFormatException, IOException{
    	ArrayList<Object[]> obj2=getTestData.getdata();
         return obj2.iterator();

    }   
    @Test(dataProvider="getFileData")
    public void dataTest(String firstName,String lastname,String job) {
			login.login(firstName,lastname,job);
    }

}
