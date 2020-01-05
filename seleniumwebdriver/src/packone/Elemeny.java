/*its our choice to use system.setproperty gecko driver if version doesn't support for firefox then we have to use
 * system.setproperty, geckodriver is only for firefox
 */
package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Elemeny {
	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rakesh\\Desktop\\seleniumwebdriver\\jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys("suman");

		driver.findElement(By.id("pass")).sendKeys("hello");
		driver.findElement(By.id("day")).sendKeys("24");
		driver.findElement(By.id("month")).sendKeys("Apr");
		driver.findElement(By.id("year")).sendKeys("1980");
		//driver.close();
		driver.findElement(By.id("email")).clear();
		
				
				
		
		
	}

}
