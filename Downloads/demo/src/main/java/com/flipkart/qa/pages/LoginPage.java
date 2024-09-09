package com.flipkart.qa.pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipkart.qa.base.BaseClass;

public class LoginPage extends BaseClass {
	 WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	
	public LoginPage() throws IOException {
		PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}
//   WebElement FirstName=driver.findElement(By.id("first-name"));
	@FindBy(how=How.ID, using="first-name")
	WebElement Firstname;
//	@FindBy(id="last-name")
//	WebElement lastName;
//    
//	@FindBy(id="job-title")
//	WebElement jobTitle;
	
	public void login(String ema,String pass,String job) {
		System.out.println(Firstname);
		Firstname.sendKeys(ema);
//		lastName.sendKeys(pass);
//		jobTitle.sendKeys(job);
	}
	
}
