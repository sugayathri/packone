
	package packone;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	//import org.openqa.selenium.chrome.ChromeDriver;
	//import org.openqa.selenium.firefox.FirefoxDriver;

	public class ChromeBrowser {

		public static void main(String[] args) {
		//opens chrome browser and opens qshore
			/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rakesh\\Desktop\\seleniumwebdriver\\jars\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://qshore.com");
			driver.manage().window().maximize();*/
			
			//opens mozilla firefox with yahoo mail
			/*System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rakesh\\Desktop\\seleniumwebdriver\\jars\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("http://yahoomail.com");
			driver.manage().window().maximize();*/
			
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Rakesh\\Desktop\\seleniumwebdriver\\jars\\IEDriverServer.exe");
			WebDriver driver=new InternetExplorerDriver();
			driver.get("http://facebook.com");
			driver.manage().window().maximize();
			

		}

	}



