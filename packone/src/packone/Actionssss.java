
		package packone;

		import org.openqa.selenium.By;
		import org.openqa.selenium.Keys;

		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.interactions.Actions;

		public class Actionssss
		{

			public static void main(String[] args) throws Exception{
			

				WebDriver driver=new FirefoxDriver();
						driver.get("https://www.naukri.com/");
						driver.manage().window().maximize();
						Actions a=new Actions(driver);
						/*creating webelement for companies
					 WebElement companies=driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[3]/a/div"));
						move cursor to companies
						a.moveToElement(companies).build().perform();
						click on about companies link
						driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[3]/div/ul/li[2]/a"));*/
						
						/*refresh page
						a.sendKeys(Keys.F5).build().perform();
						it opens new tab
						a.sendKeys(Keys.CONTROL+"t").build().perform();
						opens new window
						a.sendKeys(Keys.CONTROL+"n").build().perform();*/
						
						WebElement loginbutton=driver.findElement(By.id("login_Layer"));
						a.doubleClick(loginbutton).build().perform();
						
						
						
						WebElement email=driver.findElement(By.name("email"));
						a.contextClick(email).build().perform();
					
						/*	a.sendKeys(Keys.DOWN).build().perform();
						Thread.sleep(3000);
						a.sendKeys(Keys.DOWN).build().perform();
						Thread.sleep(3000);
						a.sendKeys(Keys.DOWN).build().perform();
						Thread.sleep(3000);
						a.sendKeys(Keys.DOWN).build().perform();
						Thread.sleep(3000);
						a.sendKeys(Keys.DOWN).build().perform();
						Thread.sleep(3000);
						a.sendKeys(Keys.DOWN).build().perform();
						Thread.sleep(3000);
						a.sendKeys(Keys.DOWN).build().perform();
						Thread.sleep(3000); (or)*/
						int i;
						for(i=1;i<9;i++)
						{
						
						a.sendKeys(Keys.DOWN).build().perform();
						Thread.sleep(3000);
						}
						a.sendKeys(Keys.ENTER).build().perform();
						
						
						
						
						
						
				
						
						
						
						
						
						
						
						

					}

				


			}



		

	


