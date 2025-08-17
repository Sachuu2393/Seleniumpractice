package FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session3 {

	public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://omayo.blogspot.com/");
			
			List<WebElement> links = driver.findElements(By.xpath("//div[@id='LinkList1']//li"));
			
			
			for(int i=1;i<=links.size();i++) {
				String Xpathexp="(//div[@id='LinkList1']//a)["+ i +"]";
				driver.findElement(By.xpath(Xpathexp)).click();
				System.out.println(driver.getCurrentUrl());
				driver.navigate().back();
				
			}
			
//			for(WebElement lnk : links) {
//				lnk.click();
//				
//				System.out.println(driver.getCurrentUrl());
//				
//				driver.navigate().back();
//				
//			}

			driver.quit();
			}

		}

	


