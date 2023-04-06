package Frame2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Testcase extends Capabilities2{
	AndroidDriver<AndroidElement> driver;
	@BeforeTest
	public void tc1() throws IOException {
		driver=Capabilities3(deviceName,appActivity,appPackage,platformName,chromeDriver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
	}
	@Test
	public void tc2() throws InterruptedException {
		driver.findElement(MobileBy.className("android.widget.Button")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.id("com.forbinary.banjararide:id/imageView_arrow")).click();
		Thread.sleep(2000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India (IN)\"))").click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.id("com.forbinary.banjararide:id/edtMobileNumber")).sendKeys("7875359923");
		Thread.sleep(2000);
		driver.findElement(MobileBy.id("com.forbinary.banjararide:id/imgNext")).click();
		Thread.sleep(10000);
		driver.findElement(MobileBy.id("com.forbinary.banjararide:id/llEditTextContainer")).sendKeys("6459");
		
	 
	}

}
