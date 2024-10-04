package screenshotpackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class ScreenShot {
	static WebDriver driver;
 public static void main(String[] args) throws IOException {
	 driver=new ChromeDriver();
	 driver.get("https://www.swiggy.com/");
	 getScreenshot1();;
 }
 public static void getScreenshot1() throws IOException {
	 File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(screenshot,new File("D:\\SelenuimProjectExecutionWithTestng\\Downloads\\demo\\ScreenShots\\screenshot.png"));
 }
}
