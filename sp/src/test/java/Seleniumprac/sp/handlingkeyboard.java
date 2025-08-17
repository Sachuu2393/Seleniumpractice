package Seleniumprac.sp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class handlingkeyboard {

	public static void main(String[] args) {
		//ChromeDriver driver = new ChromeDriver();
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		driver.findElement(By.id("input-firstname")).sendKeys("Sachin");
		
		
		
	}

}
