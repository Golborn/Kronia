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
import org.openqa.selenium.support.ui.Select; 
import org.junit.Test;
public class Personas_Web_Mobile_20 {
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
		String fono ="981331660"; 
		String rut ="7.389.135-3";
		String pin ="9822";
		driver.get("http://appswls.entel.cl/mientel/login.action");
		driver.findElement(By.id("msisdn")).clear();
	    driver.findElement(By.id("msisdn")).sendKeys(fono);
	    driver.findElement(By.id("rut")).clear();
	    driver.findElement(By.id("rut")).sendKeys(rut);
	    driver.findElement(By.id("pin")).clear();
	    driver.findElement(By.id("pin")).sendKeys(pin);
	    driver.findElement(By.id("entrar")).click();
	    driver.findElement(By.cssSelector("span.icon.icon-menu")).click();
	    driver.findElement(By.linkText("Recargas")).click();
	    new Select(driver.findElement(By.id("producto"))).selectByVisibleText("Telefon�a Hogar");
	    driver.findElement(By.id("numero")).clear();
	    driver.findElement(By.id("numero")).sendKeys("981331660");
	    driver.findElement(By.id("monto")).click();
	    new Select(driver.findElement(By.id("monto"))).selectByVisibleText("$3.500");
	    driver.findElement(By.cssSelector("option[value=\"03500\"]")).click();
	    driver.findElement(By.id("btn_continuar")).click();
	}

	@Test
	public void testA() throws Exception {
		Personas_Web_Mobile_20 a=new Personas_Web_Mobile_20();
	a.setUp();
	a.cal();           
	}
	
}//Personas_Web_Mobile_20
