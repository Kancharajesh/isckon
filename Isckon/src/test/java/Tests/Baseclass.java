package Tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.PublicKey;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.devtools.v111.database.Database;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Elements_location.Login;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Baseclass extends Extentreports 
{
	
	AppiumDriver<MobileElement> driver;
	public static Properties prop = new Properties();
	public static FileInputStream fr;
	
	
//	public Baseclass() throws IOException
//	{
//		
//		FileReader fr = new FileReader("C:\\Users\\DELL\\eclipse-workspace\\Isckon\\src\\test\\java\\MyData\\Data");		
//		prop.load(fr);
//		
//	}
//	
//	File f = new File("src/test/resources");
//	File fs = new File("sprint_3_0_dev.apk");
	
	
	
	@BeforeMethod 
	public void setup() throws IOException
	{
		

		FileReader fr = new FileReader("C:\\Users\\DELL\\eclipse-workspace\\Isckon\\src\\test\\java\\MyData\\Data");		
		prop.load(fr);
		
 		try {
		
		DesiredCapabilities capabilitie = new DesiredCapabilities();
		capabilitie.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
//		UiAutomator2
		capabilitie.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		capabilitie.setCapability(MobileCapabilityType.DEVICE_NAME, "962959539700161");
	//	capabilitie.setCapability(MobileCapabilityType.APP,"C:\\Apk file\\sprint_3_0_dev.apk");
		capabilitie.setCapability("autoGrantPermissions", "true");
		capabilitie.setCapability(MobileCapabilityType.NO_RESET,true); 
		capabilitie.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		capabilitie.setCapability("appPackage","com.iskcon_app");
		capabilitie.setCapability("appActivity","com.iskcon_app.MainActivity");
			
		URL url = new URL("http://127.0.0.1:4723");
		driver = new AppiumDriver<MobileElement>(url,capabilitie);
		Login main = new Login(driver);	
		
		
		}catch (Exception exp) {
			System.out.println("cause is : "+exp.getCause());
			System.out.println("message is :"+exp.getMessage());
			exp.printStackTrace();
		} 
		
	}	
	
	   
	
	@AfterMethod
	public void teardown() 
	{
		 
		driver.quit();
	
		
	}
	
	public static int Random_MobileNumber() throws Exception {
		 Random generator = new Random();
		   generator.setSeed(System.currentTimeMillis());
		     
		   int num = generator.nextInt(99999) + 99999;
		   if (num < 100000 || num > 999999) {
		   num = generator.nextInt(99999) + 99999;
		   if (num < 100000 || num > 999999) { 
		   throw new Exception("Unable to generate PIN at this time..");}}
		   return num;
		}
	
	/*
  		public static String RandomText() throws Exception
	   {
		    String alphabet = "abcdefghijklmnopqrstuvwxyz";
		    StringBuilder sb = new StringBuilder();
		    Random random = new Random(); 
		    int length = 7;
		    for(int i = 0; i < length; i++) {
		      int index = random.nextInt(alphabet.length());
		      char randomChar = alphabet.charAt(index);
		      sb.append(randomChar);
		    }
		    String randomString = sb.toString();
		    return randomString;
		  }
		  
		*/  
	
	
}
