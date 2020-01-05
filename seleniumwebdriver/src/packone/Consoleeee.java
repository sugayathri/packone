package packone;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Consoleeee {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("enter A value");
		int a=s.nextInt();
		System.out.println("enter B value");
		int b=s.nextInt();
		System.out.println(a*b);
		WebDriver driver=new FirefoxDriver();
		System.out.println("enter URL");
		String u=s.next();
		driver.get(u);
		System.out.println("enter email value");
		String emailvalue=s.next();
		driver.findElement(By.id("email")).sendKeys(emailvalue);
		System.out.println("enter password value");
		String passwordvalue=s.next();
		driver.findElement(By.id("pass")).sendKeys(passwordvalue);

	}

	}
