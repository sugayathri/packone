package packone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CallPo {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		Pageobjectmodelllll po=new Pageobjectmodelllll();
		driver.findElement(po.uid).sendKeys("hello");
		driver.findElement(po.pwd).sendKeys("abcd");

	}

}
