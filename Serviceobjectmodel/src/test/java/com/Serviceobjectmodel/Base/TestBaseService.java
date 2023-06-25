package com.Serviceobjectmodel.Base;



import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import java.io.File;
import org.openqa.selenium.TakesScreenshot;



public class TestBaseService {
	public static Properties prop =null; //first will pass null in prop
	public static WebDriver driver;
 
  public void testBase() throws IOException {
	  
	  try
	  {
	  prop=new Properties();
	  FileInputStream ip= new FileInputStream  //file input stream for path loading
	 (System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties"); //user.dir means current projectilu varan vendi
	  prop.load(ip);    //to load the data inside ip in prop                                                                           // '.' dot idunnath eppozhum foldernu akathekk pokan vendi
	  }
	  
	  catch(FileNotFoundException e)
	  {
		  e.printStackTrace();
	  }
	  catch(IOException e)
	  {
		  e.printStackTrace();
	  }
  }
  @AfterMethod
  public void takeScreenShotOnFailure(ITestResult iTestResult) throws IOException
  {
	  if(iTestResult.getStatus()== iTestResult.FAILURE)
	  {
		  takeScreenShotOnFailure(iTestResult.getName());
	  }
  }
  
  //Screenshot only takes when test fails
  public String takeScreenShotOnFailure(String name) throws IOException 
  {
	 String dateName=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date()); //"yearmonthdayhourminuteseconds" testcase runs at this date and time
	 File source=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	 String destination= System.getProperty("user.dir")+ "\\target\\"+ name + dateName + ".jpeg"; //already target folder created so no need to create once more for screenshot
	 File finalDestination=new File(destination);
	 FileUtils.copyFile(source, finalDestination);
	 return destination;
  }
  @BeforeTest()
  @Parameters({"browser"})
  public void beforeTest(String browser) throws IOException {
	  testBase() ;
	  if(browser.equals("chrome"))
	  {
		  WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
	  }
	  else if(browser.equals("edge"))
	  {
		  WebDriverManager.edgedriver().setup();
		  driver=new EdgeDriver();
	  }
	  else if (browser.equals("gecko"))
	  {
		  WebDriverManager.firefoxdriver().setup();
		  driver=new FirefoxDriver();
	  }
	  driver.manage().window().maximize();
	  String baseUrl=prop.getProperty("url"); //this "url" is copy paste from config.properties file
	  driver.get(baseUrl);
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
}