package cl.entel.test;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import cl.entel.test.util.*;

public class TestWebA000 {

	private static final String HOST = "selenium.host";
	private static final String PORT = "selenium.port";

	private static final int TIMEOUT_SECONDS = 10;

	private WebDriver driver;
	private String url;
	private String baseUrl = "http://www.entel.cl";
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	private org.apache.logging.log4j.Logger log;
	private MyProperties my;

	public TestWebA000() {
		this.log = LogManager.getLogger(TestWebA000.class);
		this.my = new MyProperties(log);
	}

	@Before
	public void setUp() throws Exception {
		url = "http://" + my.property(HOST, "localhost") + ":" + my.property(PORT, "4444") + "/wd/hub";
	}

	@Test
	public void testA000() throws Exception {
		log.info("Conectando con servidor Selenium: " + url);
	//	testH004For(new RemoteWebDriver(new URL(url), DesiredCapabilities.internetExplorer()));
		//testH004For(new RemoteWebDriver(new URL(url), DesiredCapabilities.chrome()));
		testH004For(new RemoteWebDriver(new URL(url), DesiredCapabilities.firefox()));
	}

	public void testH004For(WebDriver driver) throws Exception {
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(TIMEOUT_SECONDS, TimeUnit.SECONDS);


		// // Login
		// open | / | 
		driver.get(baseUrl + "/");
		 	driver.findElement(By.xpath("(//a[contains(text(),'Ingresar a Mi entel')])[2]")).click();
		    driver.findElement(By.id("MovilVisible")).clear();
		    driver.findElement(By.id("MovilVisible")).sendKeys("989932435");
		    driver.findElement(By.id("Rut")).clear();
		    driver.findElement(By.id("Rut")).sendKeys("164949257");
		    driver.findElement(By.id("PIN")).clear();
		    driver.findElement(By.id("PIN")).sendKeys("1387");
		    driver.findElement(By.id("LB_btnLoginEntel")).click();
		    driver.findElement(By.xpath("//div[@id='menu_vertical']/div[4]/div[2]/h3")).click();
		    driver.findElement(By.linkText("Mis Boletas")).click();
		    driver.findElement(By.xpath("//div[@id='centro']/div[4]/a/span")).click();
		try {
			assertEquals("Mi Entel", driver.findElement(By.xpath("//div[@id='cabecera_mientel']/table/tbody/tr/td[2]")).getText());
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}

		driver.quit();
	}

	@After
	public void tearDown() throws Exception {
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch(NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch(NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if(acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
}
