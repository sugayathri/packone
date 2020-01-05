package packone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickEachFrame {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
				driver.manage().window().maximize();
				 WebElement frame1=driver.findElement(By.name("packageListFrame"));
					List<WebElement>links=driver.switchTo().frame(frame1).findElements(By.tagName("a"));
					System.out.println("no. of links:" +links.size());
					int i;
					for(i=2;i<5;i++)
					{
						
						//it clicks each link in frame1 and prints other frame2 classes and interfaces
						links.get(i).click(); 
						Thread.sleep(1000);
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
					
					for(j=0;j<5;j++)
					{
						
					
						
						links_frame2.get(j).click();
						
						//it prints all links in frame2
						System.out.println(links_frame2.get(j).getText());
						
						
						
					}
					
					//driver.close();
		

					
								
	
	}
	
	

}
