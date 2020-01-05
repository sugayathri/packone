/*using webelement create object uid and we can directly access commands like sendkeys(),clear()etc*/
package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Findelement {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rakesh\\Desktop\\seleniumwebdriver\\jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("suman");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("suman");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("u_0_b")).click();

		WebElement uid=driver.findElement(By.id("email"));
		uid.sendKeys("suman");
		uid.clear();
		uid.sendKeys("sundar");
		WebElement pwd=driver.findElement(By.id("pass"));
		pwd.sendKeys("abcd");
	
		
		

	}

}
