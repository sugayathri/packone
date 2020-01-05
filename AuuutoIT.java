package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AuuutoIT {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://transfer.pcloud.com/");
		driver.manage().window().maximize();
		//click on upload image
		driver.findElement(By.xpath("//*[@id='upload-form']/div/div[2]/div/div[1]/a/img[3]"));
		//Execute AutoIT exe file
		Runtime.getRuntime().exec("‪C:\\Users\\Rakesh\\Desktop\\AutoIT\\Hello.exe");
		driver.findElement(By.xpath("//*[@id='recipients']/div/div/div[1]/div[3]/input")).sendKeys("sugayathri100@gmail.com");
		driver.findElement(By.xpath("//*[@id='sendermail']")).sendKeys("sugayathr100@gmail.com");
		driver.findElement(By.xpath("//*[@id='message']")).sendKeys("hi how are you?");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='ppaccepted']")).click();
		driver.findElement(By.xpath("//*[@id='begin-transfer']")).click();
		

	}

}
