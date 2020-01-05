package packone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//it opens facebook application
public class Example {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		driver.close();
		

	}

}
