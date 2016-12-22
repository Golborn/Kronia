package cl.entel.test;
/*
import static org.junit.Assert.assertEquals;

import java.net.URL;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.internal.runners.statements.Fail;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cl.entel.test.util.Mobile;
import cl.entel.test.util.MyProperties;

public class TestAndroidA001 {

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
	
	public TestAndroidA001() {
		this.log = LogManager.getLogger(TestAndroidA001.class);
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
	public void TestAndroid001() throws Exception {
		// Parámetros
		
		//suscripcion
		String teléfono = "982220871";
		String rut = "143439747";
		String password = "8888";
		
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
		
	//	tap(By.xpath("//android.widget.ImageButton")); //inicio (menu lateral)
		Thread.sleep(12000);
		
		
			
		

     


		if(!By.xpath("//android.widget.TextView[contains(@text,'Consulta de Tráfico')]").toString().isEmpty()){
	
			//tap(By.xpath("//android.widget.TextView[contains(@text,'Mis Bolsas')]"));
			System.out.println("1");
			//ScreenCapture.getInstanceCount();

			assertEquals(1,1);
		}else{
			System.out.println("error 1");
			assertEquals(1,2);
		}
		
		if(null!=By.xpath("//android.widget.TextView[contains(@text,'Estado de Cuenta')]")){
			System.out.println("2");
		}else{
			System.out.println("error 2");
			assertEquals("OK","NOK");
		}
		if(null!=By.xpath("//android.widget.TextView[contains(@text,'Mi Plan')]")){
			System.out.println("3");
		}else{
			System.out.println("error 3");
			assertEquals("OK","NOK");
		}
		if(null!=By.xpath("//android.widget.TextView[contains(@text,'Mis Bolsas')]")){
			System.out.println("4");
		}else{
			System.out.println("error 4");
			assertEquals("OK","NOK");
		}
		
		if(null!=By.xpath("//android.widget.TextView[contains(@text,'Descuentos zona')]")){
			System.out.println("5");
		}else{
			System.out.println("error 5");
			assertEquals("OK","NOK");
		}
		
		
		
		
		Thread.sleep(12000);
		
		tap(By.xpath("//android.widget.ImageButton")); //inicio (menu lateral)
		Thread.sleep(7000);
		
		
		if(null!=By.xpath("//android.widget.TextView[contains(@text,'Inicio')]")){
			System.out.println("1a");
		}else{
			System.out.println("error 1a");
		}
		
		if(null!=By.xpath("//android.widget.TextView[contains(@text,'Consulta de Tráfico')]")){
			System.out.println("2a");
		}else{
			System.out.println("error 2a");
		}
		
		if(null!=By.xpath("//android.widget.TextView[contains(@text,'Estado de Cuenta')]")){
			System.out.println("3a");
		}else{
			System.out.println("error 3a");
		}
		
		if(null!=By.xpath("//android.widget.TextView[contains(@text,'Mi Plan')]")){
			System.out.println("4a");
		}else{
			System.out.println("error 4a");
		}
		
		if(null!=By.xpath("//android.widget.TextView[contains(@text,'Mis Bolsas')]")){
			System.out.println("5a");
		}else{
			System.out.println("error 5a");
		}
		
		if(null!=By.xpath("//android.widget.TextView[contains(@text,'Planes y Tarifa')]")){
			System.out.println("6a");
		}else{
			System.out.println("error 6a");
		}
		
		if(null!=By.xpath("//android.widget.TextView[contains(@text,'Ayuda y Soporte')]")){
			System.out.println("7a");
		}else{
			System.out.println("error 7a");
		}
		
		if(null!=By.xpath("//android.widget.TextView[contains(@text,'Tiendas')]")){
			System.out.println("8a");
		}else{
			System.out.println("error 8a");
		}
		
		if(null!=By.xpath("//android.widget.TextView[contains(@text,'Descuentos zOna')]")){
			System.out.println("9a");
		}else{
			System.out.println("error 9a");
		}
		
		


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
	
	
}*/