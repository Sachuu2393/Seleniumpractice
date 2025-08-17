package Seleniumprac.sp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class session5 {
public static void main(String[] args) {
	ChromeOptions Option=new ChromeOptions();
	Option.addArguments("--disable-notifications");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hdfcbank.com/");
	
	
	driver.findElement(By.xpath("//a[text()='Select Product Type']")).click();
	
	driver.findElement(By.xpath("//li[text()='Deposits']")).click();
	
	driver.findElement(By.xpath("//a[text()='Select Product']")).click();
	
	driver.findElement(By.xpath("//li[text()='Current Accounts']")).click();
	
	driver.findElement(By.xpath("//a[text()='Apply online']")).click();
}
}
