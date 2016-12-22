package cl.entel.test;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;  
import javax.swing.JOptionPane;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Test;
import org.junit.Before;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_Maus_Mobile 
{
	WebDriver driver;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private WebDriverWait wait;
@Before
	public void setUp() throws MalformedURLException 
	{
	DesiredCapabilities capabilities= new DesiredCapabilities();
	capabilities.setCapability(CapabilityType.BROWSER_NAME,"browser");
	capabilities.setCapability(CapabilityType.VERSION,"5.0.1");
	//capabilities.setCapability(CapabilityType.PLATFORM,"windows");
	capabilities.setCapability("platformName","Android");
	//capabilities.setCapability("devices","Android");
	//capabilities.setCapability("avd","nexus");
	capabilities.setCapability("deviceName","");
	capabilities.setCapability("appPackage", "com.android.browser");
	capabilities.setCapability("appActivity",    "com.android.browser.BrowserActivity");
	capabilities.setCapability("deviceName","Android Emulator");
	capabilities.setCapability("platformVersion", "5.0.1");
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
	    driver.findElement(By.id("msisdn")).sendKeys("969196923");
	    driver.findElement(By.id("rut")).clear();
	    driver.findElement(By.id("rut")).sendKeys("16.653.307-4");
	    driver.findElement(By.id("pin")).clear();
	    driver.findElement(By.id("pin")).sendKeys("4758");
	    Thread.sleep(5000);
	    WebDriver driver1 = new Augmenter().augment(driver);
	    File file  = ((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(file, new File("test-02-01.jpg")); 
	    driver.findElement(By.id("entrar")).click();
	    driver.findElement(By.linkText("Consideraciones")).click();   
	}
	
	@Test
	public void testA() throws Exception {
		Personas_Web_Mobile02 a=new Personas_Web_Mobile02();
	a.setUp();
	a.cal();           
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	private void wait(By element) {
		wait.until(ExpectedConditions.presenceOfElementLocated(element));
	}

	private void typewrite(By element, String text) {
		driver.findElement(element).sendKeys(text);
	}

	private void tap(By element) {
		driver.findElement(element).click();
	}
	
	
}

