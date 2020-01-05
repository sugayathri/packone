//Reusable methods in webdriver
package packone;

public class Methods1 {
	public static void main(String[] args) {
		Methods m=new Methods();
		m.launchApp("http://facebook.com");
		m.elementAvailable("email", true);
		m.elementAvailable("pass", true);
		m.elementAvailable("day", false);
		m.closeApp();
		
		
		m.launchApp("http://yahoomail.com");
		
		m.closeApp();
		
	}

}
