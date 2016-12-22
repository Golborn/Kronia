package cl.entel.test;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;  
import javax.swing.JOptionPane;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.firefox.FirefoxDriver;  
import org.openqa.selenium.firefox.FirefoxProfile;  
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;  
import org.junit.Test;
public class Personas_Web_Mobile_22 {
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
	public void cal(){
		String fono ="997166644"; 
		String rut ="12.820.809-7";
		String pin ="2708";
		driver.get("http://appswls.entel.cl/mientel/login.action");
		driver.findElement(By.id("msisdn")).clear();
	    driver.findElement(By.id("msisdn")).sendKeys(fono);
	    driver.findElement(By.id("rut")).clear();
	    driver.findElement(By.id("rut")).sendKeys(rut);
	    driver.findElement(By.id("pin")).clear();
	    driver.findElement(By.id("pin")).sendKeys(pin);
	    driver.findElement(By.id("entrar")).click();
	}
@Test
	public void testA() throws Exception {
		Personas_Web_Mobile_22 a=new Personas_Web_Mobile_22();
	a.setUp();
	a.cal();           
	}
}
