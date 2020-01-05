//validation commands in webdriver

package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Validation {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("gireeja");
		WebElement pwd=driver.findElement(By.id("pass"));
		pwd.sendKeys("abcd");
		boolean b=driver.findElement(By.id("pass")).isDisplayed();
		
		if(b==true)
			System.out.println("pass");
		else
			System.out.println("fail");
		boolean c=driver.findElement(By.id("email")).isEnabled();
		
		if(c==true)
System.out.println("pass");	
		else
			System.out.println("fail");
		
		String a=pwd.getAttribute("class");//<input type="email" class="inputtext login">
		System.out.println("class value is:" +a);
		System.out.println("tagname is:" +pwd.getTagName());
		System.out.println("width and height is:" +pwd.getSize());
		System.out.println("location is:" +pwd.getLocation());
		
		System.out.println("source of the page:" +driver.getPageSource());
		System.out.println("title of facebook is:" +driver.getTitle());
		System.out.println("address of facebook:" +driver.getCurrentUrl());
		System.out.println("window handle is:" +driver.getWindowHandle());
		
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("");
	    driver.close();
		driver.manage().window().fullscreen();
		driver.manage().window().getSize();
		
		
		
		
	}

}
