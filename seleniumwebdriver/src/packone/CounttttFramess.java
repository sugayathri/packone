package packone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CounttttFramess {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
				driver.manage().window().maximize();
			//It prints no. of frames
			//	List<WebElement>frames=driver.findElements(By.tagName("frame"));
				//System.out.println(frames.size());
				
				//it prints no. of links in page by using size method 
				 WebElement frame1=driver.findElement(By.tagName("frame"));
				List<WebElement>links=driver.switchTo().frame(frame1).findElements(By.tagName("a"));
				System.out.println("no. of links:" +links.size());
				int i;
				for(i=0;i<links.size();i++)
				{
					//it prints no. of links in frame1 and also prints text by using gettext method
					System.out.println(links.get(i).getText());
		
				}
				
				//create parentframe for frame2
				driver.switchTo().parentFrame();
				//it switches to frame2 and prints no. of links in frame2
				WebElement frame2=driver.findElement(By.name("packageFrame"));
				List<WebElement>links_frame2=driver.switchTo().frame(frame2).findElements(By.tagName("a"));
				System.out.println("no.of links in frame2 are:" +links_frame2.size());
				int j;
				for(j=0;j<links_frame2.size();j++)
				{
					//it prints all links in frame2
					System.out.println(links_frame2.get(j).getText());
				}
				driver.switchTo().parentFrame();
				WebElement frame3=driver.findElement(By.name("classFrame"));
				List<WebElement>links_frame3=driver.switchTo().frame(frame3).findElements(By.tagName("a"));
				System.out.println("no.of links in frame3 are:" +links_frame3.size());
				int k;
				for(k=0;k<links_frame3.size();k++)
				{
					System.out.println(links_frame3.get(k).getText());
				}
				
				driver.close();
				
	

	}

}
