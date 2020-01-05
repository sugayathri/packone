		
	package packone;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

	public class CallingRC {

		@SuppressWarnings("deprecation")
		public static void main(String[] args) {
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rakesh\\Desktop\\seleniumwebdriver\\jars\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("http://facebook.com");
			driver.manage().window().maximize();
			//enter email using webdriver
			driver.findElement(By.id("email")).sendKeys("teja");
			//using webdriverbackedselenium can access RC commands
			WebDriverBackedSelenium s=new WebDriverBackedSelenium(driver, "http://");
			//enter pwd using Rc
			s.type("id=pass", "qshore");
			//select day using webdriver
			driver.findElement(By.id("day")).sendKeys("24");
			//select month using RC
			s.select("id=month", "Apr");
			

		}

	}

	

