package cl.entel.test;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;  
import javax.swing.JOptionPane;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.firefox.FirefoxDriver;  
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;  
public class Personas_Web_Mobile {
	WebDriver driver;

	public void setUp() throws MalformedURLException 
	{
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
	public void cal() throws InterruptedException, IOException{
		@SuppressWarnings("unused")
		final String FILE;
		driver.get("http://appswls.entel.cl/mientel/login.action");
		driver.findElement(By.id("msisdn")).clear();
	    driver.findElement(By.id("msisdn")).sendKeys("982220871");
	    driver.findElement(By.id("rut")).clear();
	    driver.findElement(By.id("rut")).sendKeys("14.343.974-7");
	    driver.findElement(By.id("pin")).clear();
	    driver.findElement(By.id("pin")).sendKeys("8888");  
	    driver.findElement(By.id("entrar")).click();
	    Thread.sleep(10000);
	    WebDriver driver1 = new Augmenter().augment(driver);
	    File file  = ((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(file, new File("test-01-02.jpg")); 
	}
	@Test
	public void testA() throws Exception {
		Personas_Web_Mobile a=new Personas_Web_Mobile();
	a.setUp();
	a.cal();           
	}
}
