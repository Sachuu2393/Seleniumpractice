package Seleniumprac.sp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class session4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphones");
		Thread.sleep(5000);
		List<WebElement> dynoption = driver.findElements(By.xpath("//div[@id='nav-flyout-searchAjax']"));
		System.out.println(dynoption.size());
		for(WebElement option:dynoption) {
			System.out.println(option.getText());
		}
	}

}
