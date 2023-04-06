package Frame2;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class Capabilities2 {
	public static String deviceName;
	public static String appActivity;
	public static String appPackage;
	public static String platformName;
	public static String chromeDriver;
	
	public static AndroidDriver<AndroidElement> Capabilities3(String deviceName, String appActivity, String appPackage, String platformName, String chromeDriver) throws IOException{
		
	
	FileReader fr=new FileReader(System.getProperty("user.dir")+"//src//main//java//Frame2//global.properties");
	Properties pro= new Properties();
	pro.load(fr);
	deviceName= pro.getProperty("deviceName");
	appActivity= pro.getProperty("appActivity");
	appPackage= pro.getProperty("appPackage");
	platformName= pro.getProperty("platformName");
	chromeDriver= pro.getProperty("chromeDriver");
	
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
	dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, appPackage);
	dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, appActivity);
	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
	dc.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, chromeDriver);
	AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
	return driver;

}


}



