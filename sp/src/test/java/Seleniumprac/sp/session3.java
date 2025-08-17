package Seleniumprac.sp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class session3 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	
	WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	
	Select select = new Select(dropdown);
	
	select.selectByVisibleText("Baby");
	Thread.sleep(5000);
	select.selectByIndex(12);
	Thread.sleep(5000);
	select.selectByValue("search-alias=fashion");
	Thread.sleep(5000);
	System.out.println(select.isMultiple());
	
	List<WebElement> options = select.getOptions();
	System.out.println(options.size());
	
	for(WebElement opt:options) {
System.out.println(opt.getText());



	}
	


	}
	}

