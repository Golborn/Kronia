package cl.entel.test;

import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cl.entel.test.util.Mobile;
import cl.entel.test.util.MyProperties;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TestAndroidA003 {

	private static final String HOST = "appium.host";
	private static final String PORT = "appium.port";

	private static final int TIMEOUT_SECONDS = 10;

	private static final String APK = "32ae5dfef03d903598da65266d131041.apk";
	private static final String PKG = "cl.entel.appswlsdesa";
	private static final String ACTIVITY = "cl.entel.appswlsdesa.SplashscreenActivity";

	private AppiumDriver<AndroidElement> driver;
	private WebDriverWait wait;

	private Logger log;
	private MyProperties my;
	
	public TestAndroidA003() {
		this.log = LogManager.getLogger(TestAndroidA003.class);
		this.my = new MyProperties(log);
	}

	@Before
	public void setUp() throws Exception {
		String url = "http://" + my.property(HOST, "localhost") + ":" + my.property(PORT, "4723") + "/wd/hub";
		log.info("Conectando con servidor Appium: " + url);
		driver = new AndroidDriver<AndroidElement>(new URL(url), Mobile.setup( APK, PKG, ACTIVITY));
		wait = new WebDriverWait(driver, TIMEOUT_SECONDS);
	}

	@Test
	public void testA003() throws Exception {
		// Parámetros
	
		//suscripcion
		String teléfono = "982220871";
		String rut = "143439747";
		String password = "8888";
//		
//		//Cuenta Controlada
//		String teléfono = "995709651";
//		String rut = "106255326";
//		String password = "8566";		
//		
//		//prepago
//		String teléfono = "981331660";
//		String rut = "73891353";
//		String password = "9822";
//		
//		//Sin datos excedidos
//		String teléfono = "942142558";
//		String rut = "7607210";
//		String password = "5946";

		// Saltar splash screen
		wait(By.xpath("//android.widget.Button"));
		tap(By.xpath("//android.widget.Button"));

		// Log in
		wait(By.id("cl.entel.appswlsdesa:id/et_phone"));
		wait(By.id("cl.entel.appswlsdesa:id/et_rut"));
		wait(By.id("cl.entel.appswlsdesa:id/et_key"));
		wait(By.id("cl.entel.appswlsdesa:id/btn_login"));

		typewrite(By.id("cl.entel.appswlsdesa:id/et_phone"), teléfono);
		typewrite(By.id("cl.entel.appswlsdesa:id/et_rut"), rut);
		typewrite(By.id("cl.entel.appswlsdesa:id/et_key"), password);

		tap(By.id("cl.entel.appswlsdesa:id/btn_login"));

		// Autorizar envío de información
		wait(By.xpath("//android.widget.Button[contains(@text,'Sí')]"));
		tap(By.xpath("//android.widget.Button[contains(@text,'Sí')]"));

		// Verificar que ingresamos al WebView de la página principal
		wait(By.id("cl.entel.appswlsdesa:id/entelWebView"));
		
		//programacion 

		Thread.sleep(7000);
		
		//	if(!By.xpath("//android.view.View[contains(@text,'Consulta de Tráfico')]").toString().isEmpty()){
		
//		//tap(By.xpath("//android.widget.TextView[contains(@text,'Mis Bolsas')]"));
//		tap(By.xpath("//android.widget.View[contains(@text,'Mi Plan')]"));
//		
//		System.out.println("1");
//
//		assertEquals(1,1);
//	}else{
//		System.out.println("error 1");
//		assertEquals(1,2);
//	}
//	Thread.sleep(7000);
	
	//segunda vuelta de prueba
	tap(By.xpath("//android.widget.ImageButton")); //inicio (menu lateral)
	Thread.sleep(7000);
	
	tap(By.xpath("//android.widget.TextView[contains(@text,'Consulta de Tráfico')]"));
	Thread.sleep(7000);
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
