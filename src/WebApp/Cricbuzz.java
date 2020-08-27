package WebApp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Cricbuzz {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "sunilbhatra");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        cap.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "C:\\SDET -Full Stack Tester\\Selenium\\Selenium Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver= new WebDriver();
		AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.cricbuzz.com/");
		
		driver.findElement(By.xpath("//span[@class='ui-btn-text']")).click();
		driver.findElement(By.xpath("//a[@title='Cricbuzz Home']")).click();
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.findElement(By.xpath("//span[contains(text(),'After a solid summer, England')]")).click();
	}
}
