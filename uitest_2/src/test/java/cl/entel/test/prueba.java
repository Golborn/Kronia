package cl.entel.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cl.entel.test.util.Mobile;
import cl.entel.test.util.MyProperties;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class prueba {
	
	private static final String HOST = "appium.host";
	private static final String PORT = "appium.port";

	private static final int TIMEOUT_SECONDS = 10;

	private AndroidDriver driver;
	private String url;
	private String baseUrl = "http://entel.cl/";
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	private org.apache.logging.log4j.Logger log;
	private MyProperties my;
	private WebDriverWait wait;
	
	public prueba() {
		this.log = LogManager.getLogger(prueba.class);
		this.my = new MyProperties(log);
	}


	@Before
	public void setUp() throws Exception {
		String url = "http://" + my.property(HOST, "localhost") + ":" + my.property(PORT, "4723") + "/wd/hub";
		log.info("Conectando con servidor Appium: " + url);
		driver = new AndroidDriver<AndroidElement>(new URL(url), null);
		wait = new WebDriverWait(driver, TIMEOUT_SECONDS);
	}

	

	@SuppressWarnings("static-access")
	@Test
	public void main() throws Exception {
		log.info("Conectando con servidor appium: " + url);
		
		// testH004For(new RemoteWebDriver(new URL(url), DesiredCapabilities.internetExplorer()));
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName","Android Emulator");
		capabilities.setCapability("platformVersion", "4.4");
		
		System.out.println( DesiredCapabilities.android().firefox());
		
		//testH004For(new RemoteWebDriver(new URL(url), DesiredCapabilities.firefox()));

		
		testH004For(new URL(url),(DesiredCapabilities.android().firefox()));
	}



	private void testH004For(URL url2, DesiredCapabilities desiredCapabilities) {
		// TODO Auto-generated method stub
				this.driver = driver;
				driver.manage().timeouts().implicitlyWait(TIMEOUT_SECONDS, TimeUnit.SECONDS);


				// // Login
				// open | / | 
				driver.get(baseUrl + "/");
				// click | id=MovilVisible | 
				driver.findElement(By.id("MovilVisible")).click();
				// type | id=MovilVisible | 965827579
				driver.findElement(By.id("MovilVisible")).clear();
				driver.findElement(By.id("MovilVisible")).sendKeys("965827579");
				// type | id=Rut | 5002451
				driver.findElement(By.id("Rut")).clear();
				driver.findElement(By.id("Rut")).sendKeys("5002451");
				// type | id=PIN | 4297
				driver.findElement(By.id("PIN")).clear();
				driver.findElement(By.id("PIN")).sendKeys("4297");
				// click | id=LB_btnLoginEntel | 
				driver.findElement(By.id("LB_btnLoginEntel")).click();
				// // A000 Verificar que estamos en página principal
				// verifyText | //div[@id='cabecera_mientel']/table/tbody/tr/td[2] | Mi Entel
				try {
					assertEquals("Mi Entel", driver.findElement(By.xpath("//div[@id='cabecera_mientel']/table/tbody/tr/td[2]")).getText());
				} catch (Error e) {
					verificationErrors.append(e.toString());
				}

				driver.quit();
	}



//	public void testH004For(AndroidDriver driver) throws Exception {
//		this.driver = driver;
//		driver.manage().timeouts().implicitlyWait(TIMEOUT_SECONDS, TimeUnit.SECONDS);
//
//
//		// // Login
//		// open | / | 
//		driver.get(baseUrl + "/");
//		// click | id=MovilVisible | 
//		driver.findElement(By.id("MovilVisible")).click();
//		// type | id=MovilVisible | 965827579
//		driver.findElement(By.id("MovilVisible")).clear();
//		driver.findElement(By.id("MovilVisible")).sendKeys("965827579");
//		// type | id=Rut | 5002451
//		driver.findElement(By.id("Rut")).clear();
//		driver.findElement(By.id("Rut")).sendKeys("5002451");
//		// type | id=PIN | 4297
//		driver.findElement(By.id("PIN")).clear();
//		driver.findElement(By.id("PIN")).sendKeys("4297");
//		// click | id=LB_btnLoginEntel | 
//		driver.findElement(By.id("LB_btnLoginEntel")).click();
//		// // A000 Verificar que estamos en página principal
//		// verifyText | //div[@id='cabecera_mientel']/table/tbody/tr/td[2] | Mi Entel
//		try {
//			assertEquals("Mi Entel", driver.findElement(By.xpath("//div[@id='cabecera_mientel']/table/tbody/tr/td[2]")).getText());
//		} catch (Error e) {
//			verificationErrors.append(e.toString());
//		}
//
//		driver.quit();
//	}

	@After
	public void tearDown() throws Exception {
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}


	private void wait(By element) {
		wait.until(ExpectedConditions.presenceOfElementLocated(element));
	}



}
