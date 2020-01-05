package packone;



import java.util.ArrayList;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import com.sun.java.swing.plaf.windows.resources.windows;

public class Multplewindowsssssss {

	public static void main(String[] args) {
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
//driver.findElement(By.xpath("//*[@id=\"pageFooterChildren\"]/ul/li[23]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"pageFooterChildren\"]/ul/li[24]/a")).click();


driver.findElement(By.id("privacy-link")).click();

driver.findElement(By.id("cookie-use-link")).click();


Set<String>a=driver.getWindowHandles();
ArrayList<String>window=new ArrayList<String>(a);
/* or
 * ArrayList<String>b=new ArrayList<String>(driver.getWindowHandles());
 * 
 */

System.out.println(window.size());



	}

}
