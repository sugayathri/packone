package com.qshore;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.DefaultSelenium;

import jxl.Workbook;

public class Methods {
	public WebDriver driver;
	public FileInputStream filepath;
	public Workbook workbookobj;
	//Method Name : launchApp
	//Description : To launch application
	//Author      : kishore Kumar
	//Reviewed By : suma
	//Date created: 01042020
	//Arguments   : 
	//***************************************************

	public void launchApp(String url,String sspath) throws Exception
	{
		
	WebDriver driver=new FirefoxDriver();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	File fileobj=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	}
	

	//************************************************************
//Method Name : CloseApp
//Description : To close application
//Author      : kishore Kumar
//Reviewed By : suma
//Date created: 01042020
//Arguments   : NA
//***************************************************************************
public void closeApp()
{

driver.close();


}
//*************************************************************************************
/*public void elementPresent() throws Exception
{
	Boolean element=driver.findElement(By.xpath(locator)).i
}*/

DefaultSelenium s=new DefaultSelenium("localhost", 4444, "*firefox C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe","http://"));
s.sta