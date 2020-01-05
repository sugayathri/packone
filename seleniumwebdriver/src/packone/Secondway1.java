package packone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class Secondway1 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
driver.manage().window().maximize();
SecondWayOfPageObject p=PageFactory.initElements(driver, SecondWayOfPageObject.class);
p.uid.sendKeys("happy family");
p.pwd.sendKeys("Home");
	}

}
