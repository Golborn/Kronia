package cl.entel.test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class conexion {
	WebDriver driver;

	public void setUp() throws MalformedURLException {
	DesiredCapabilities capabilities= new DesiredCapabilities();
	capabilities.setCapability(CapabilityType.BROWSER_NAME,"browser");
	capabilities.setCapability(CapabilityType.VERSION,"4.4");
	//capabilities.setCapability(CapabilityType.PLATFORM,"windows");
	capabilities.setCapability("platformName","Android");
	//capabilities.setCapability("devices","Android");
	//capabilities.setCapability("avd","nexus");
	capabilities.setCapability("deviceName","");
	capabilities.setCapability("appPackage", "com.android.browser");
	capabilities.setCapability("appActivity",    "com.android.browser.BrowserActivity");
	capabilities.setCapability("deviceName","Android Emulator");
	capabilities.setCapability("platformVersion", "4.4");
	File classpathRoot = new File(System.getProperty("user.dir"));
	File appDir = new File(classpathRoot, "apk");
	File app = new File(appDir, "");

	capabilities.setCapability("app", app.getAbsolutePath());

	driver=new RemoteWebDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
	}
	
	
	public void Screenshot ()throws InterruptedException, IOException{
	@SuppressWarnings("unused")
	final String FILE;
	WebDriver driver1 = new Augmenter().augment(driver);
    File file  = ((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(file, new File("test-00-00.jpg")); 
	}
	
	
	public static void main(String[] args) throws InterruptedException, IOException
	{
		conexion a=new conexion();
	a.setUp();
	//a.cal(); 
	a.Screenshot();
	}
	
	
	
	
	
}
