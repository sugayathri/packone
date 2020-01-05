package packone;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserStackGrid {

	public static void main(String[] args) throws Exception{
		URL u=new URL("https://sugayathri1:x4GpxqQGmcppUtjBmaPm@hub-cloud.browserstack.com/wd/hub");
		DesiredCapabilities caps=new DesiredCapabilities();
		//desiredcapabilities is having four arguments platform,platform version,browser,browser version
		caps.setCapability("os", "WINDOWS");
		caps.setCapability("os_version", "10");
		caps.setCapability("browser", "Firefox");
		caps.setCapability("browser_version", "33");
//browserstack.debug takes screenshot 
		caps.setCapability("browserstack.debug", true);
		RemoteWebDriver r=new RemoteWebDriver(u, caps);
		WebDriver driver=r;
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
	}

}
