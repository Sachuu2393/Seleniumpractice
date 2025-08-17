package Seleniumprac.sp;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Session1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("vidhatesachin@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("RATWO2");
		driver.findElement(By.name("login")).click();
		
TakesScreenshot ts=((TakesScreenshot)driver);
File src = ts.getScreenshotAs(OutputType.FILE);
FileHandler.copy(src, new File("ScreenShot\\\\test1.png"));



	}

}
