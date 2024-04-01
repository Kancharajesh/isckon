package Tests;

import java.awt.RadialGradientPaint;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


import Elements_location.Login;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.bys.builder.AppiumByBuilder;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class Login_Test extends Baseclass
{ 

	 Login_Test() throws IOException {
		super();
		 
	 } 
	 
	 @BeforeMethod
		public void setup() throws IOException
		{
			

			FileReader fr = new FileReader("C:\\Users\\DELL\\eclipse-workspace\\Isckon\\src\\test\\java\\MyData\\Data");		
			prop.load(fr);
			
			
			try {
			
			DesiredCapabilities capabilitie = new DesiredCapabilities();
			capabilitie.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
			capabilitie.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
			capabilitie.setCapability(MobileCapabilityType.DEVICE_NAME, "962959539700161");
			//capabilitie.setCapability(MobileCapabilityType.APP, fs.getAbsoluteFile());
			capabilitie.setCapability("autoGrantPermissions", "true");
			capabilitie.setCapability(MobileCapabilityType.NO_RESET,false);
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
			System.out.println("close the application...");
		
		
			
		}
		


	@Test(priority = 1,enabled = true,retryAnalyzer =Retry.class)
	 public void Tc_spitual_Guidance() throws Exception  
	 {
		
		ExtentTest test = extent.createTest("this steps shows", "spitual_video");
		 Login main = new Login(driver);
//		 main.clickonMobilenumber(prop.getProperty("Randommobilenumber")+Baseclass.Random_MobileNumber());
//		 main.mobilescreencontinue();
//		 main.Otpscreenscontinue();
//		 main.OTPerrormessage();
		 
		 test.log(Status.PASS, "open spitual guidance started");
		 main.spitual_Guidance();
		 
		 test.log(Status.PASS, "clickon_videoplay");
		 Thread.sleep(2500);
		 main.spitual_Guidance_videoplay();
		 
		 test.log(Status.PASS, "clickon_Backbutton");
		 main.spitualguidance_backbutton();
		
		 
		
		  
		 	
	 }
	 
//		@Test(priority = 2,enabled = false,retryAnalyzer =Retry.class)
//		public void Logout() 
//		{
//			ExtentTest test = extent.createTest("this steps shows", "spitual_video");
//			 Login main = new Login(driver);
//		
//			 test.log(Status.PASS, "Clickon_Profile");
//			 main.clickon_profile();
//			 test.log(Status.PASS, "Slect the Logout option");
//			 main.Logout();
//			 test.log(Status.PASS, "click on the logout_yes");
//			 main.Logout_Yes();
//			 
//			 
//	}
		
		@Test
		(priority = 3,enabled = true,retryAnalyzer =Retry.class)
		public void Tc_live_Darshan_video() throws Exception
		{
			Login main = new Login(driver);
			ExtentTest test = extent.createTest("this steps shows", "spitual_video");
			
			test.log(Status.PASS, "clickon_liveDarshan");
			main.live_Darshan_video();
			Thread.sleep(2000);
			test.log(Status.PASS, "closethe_liveDarshan");
			main.live_darshan_video_close();
//			TouchAction touchaction = new  TouchAction(driver);
//			 PointOption swipe = new PointOption();
//			 swipe.withCoordinates(-10, 0);
//			 
//			 WebElement element = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"₹ 5001, Annadan Seva, Serving prasadam to all visitors in temple\"]/android.view.ViewGroup/android.view.View"));
//			 touchaction.press(ElementOption.element(element)).moveTo(swipe).release().perform();

			 
			 
			
		}
	
		@Test(priority = 4,enabled = true,retryAnalyzer =Retry.class)
		public void swipe1() throws Exception
		{
			Login main = new Login(driver);
			ExtentTest test = extent.createTest("this steps shows", "spitual_video");
			
//			test.log(Status.PASS, "Harakrishna_Voiceunmute");
//			 main.hare_krishna_mute();
//			 test.log(Status.PASS, "Harakrishna_Voicemute");
//			 main.hare_krishna_unmute();
					 
			 
//			 driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
//			 		+ "new UiSelector().descrition(\"Your Daily Darshan\"));"));
			
//			driver.findElementsById("00000000-0000-11f5-ffff-ffff0000006d").get(27);
//			
//			//scrolling
//			 MobileElement elementToClick = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Your Daily Darshan\").instance(0))"));
//				elementToClick.click();
//				
//			AndroidElement list = (AndroidElement)driver.findElementByXPath("//android.widget.TextView[@text=\"Coming Soon to you\"]");
		
			
			MobileElement listitem = (MobileElement) driver.findElement(
					MobileBy.AndroidUIAutomator(
							"new uiScrollable(new UiSelector()).Scrollintoview("
								+"new UiSelector().description(\"View All\"));"));
		}
}