package packone;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
 

public class SeleniumGrid {

	public static void main(String[] args) throws Exception{
		URL u=new URL("http://localhost:5555/wd/hub");
		new DesiredCapabilities();
		//setup Desired capabilities class (required configuration)
		DesiredCapabilities d=DesiredCapabilities.firefox();
		//connecting to node machine
		RemoteWebDriver r=new RemoteWebDriver(u, d);
		   /*        or
		 RemoteWebDriver r=new RemoteWebDriver(new URL(""), new DesiredCapabilities().firefox());*/
		WebDriver driver=r;
		
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.close();
		 
		 
		
		
		
		

	}

}
