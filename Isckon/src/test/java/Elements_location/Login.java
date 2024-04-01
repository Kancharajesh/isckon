package Elements_location;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login { 
	
	WebDriver driver;
		
	
	@FindBy(className  = "android.widget.EditText")
	private WebElement mobilenumber;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Continue\"]")
	 private WebElement mobilecontinue;
	
	@FindBy(className = "android.widget.EditText")
	private WebElement Otp;
	
	@FindBy(xpath = "	\r\n"+ "//android.view.ViewGroup[@content-desc=\"Continue\"]")
	private WebElement otpcontinue;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Please enter a valid otp\"]")
	private WebElement otperror;
	
	@FindBy(xpath ="\r\n"+ "//android.widget.TextView[@text=\"OTP resent successfully\"]")
	private WebElement otpresend; 
	
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView")
	private WebElement harekrishnavoiceunmute;
	
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView")
	private WebElement harekrishnavoicemute;
	
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ImageView[1]")
	private WebElement livedarshan;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"✕\"]")
	private WebElement livedarshanvideoclose;
	
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.ImageView")
	private WebElement clickonprofile;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Logout\"]")
	private WebElement logou;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Yes\"]")
	private WebElement logoutyes;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Spiritual Guidance - Today's Wisdom\"]")
	private WebElement spitualguidance;
	
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"\"]")
	private WebElement spitualguidancevideo;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"\"]")
	private WebElement spitualguidancevideopause;
	
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
	private WebElement spitualguidance_back;
	
	
	public Login(WebDriver driver) { 
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	public void clickonMobilenumber(String data) 
	{
	mobilenumber.sendKeys(data);
	} 
	//9994138380

	public void mobilescreencontinue() {
		mobilecontinue.click();
	}

	public void EnterOTP() { 
		Otp.click();
	} 
	
	public void Otpscreenscontinue() {
		otpcontinue.click();
	}
	
	public boolean OTPerrormessage() {
		return otperror.isDisplayed();	
	}
	
	public boolean otpresendmessage() {
	return	otpresend.isDisplayed();
	}
	
	public void hare_krishna_mute() {
		harekrishnavoiceunmute.click();
	}
	
	public void hare_krishna_unmute() {
		harekrishnavoicemute.click();
	}
	
	public void live_Darshan_video() {
		livedarshan.click(); 
	}
	
	public void live_darshan_video_close() {
		livedarshanvideoclose.click();
	}
	
	public void clickon_profile() {
		clickonprofile.click();
	}
	
	public void Logout() {
	logou.click();
	}
	
	public void Logout_Yes() {
		logoutyes.click();
	}
	
	public void spitual_Guidance() {
		spitualguidance.click();
	}
	
	public void spitual_Guidance_videoplay() {
		spitualguidancevideo.click();
	}
	
	public void spitual_Guidance_videopause() {
		spitualguidancevideopause.click();
	}
	
	public void spitualguidance_backbutton() {
		spitualguidance_back.click();
	}



}