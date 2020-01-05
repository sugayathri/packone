package packone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;


public class Page2ForOtherclass {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=royal_blue_bar");
		driver.manage().window().maximize();
		PageWorkOtherClass p2=PageFactory.initElements(driver, PageWorkOtherClass.class);
		p2.email.sendKeys("abcd");

	}

}
