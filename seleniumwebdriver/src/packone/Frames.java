package packone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
				driver.manage().window().maximize();
				//creating webelement for frame
				/*WebElement f1=driver.findElement(By.name("packageListFrame"));
				//switch to frame1 and click on link
				driver.switchTo().frame(f1).findElement(By.xpath("/html/body/div[2]/ul/li[1]/a")).click();*/
				//create webelement for frame2
			driver.switchTo().parentFrame();
				//WebElement f2=driver.findElement(By.name("packageFrame"));
				//switch to frame2 and click on link
				//driver.switchTo().frame(f2).findElement(By.xpath("/html/body/div/ul[1]/li[2]/a")).click();
			//count no. of frames	
			//List<WebElement>f=driver.findElements(By.tagName("frame"));
				//System.out.println(f.size());
				List<WebElement>f=driver.findElements(By.xpath("/html/frameset"));
				System.out.println(f.size());
				
				
				 
		

	}

}
