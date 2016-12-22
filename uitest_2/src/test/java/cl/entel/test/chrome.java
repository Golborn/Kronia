package cl.entel.test;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;*/

import org.junit.*;
public class chrome {
	public static void main(String[] args) throws Exception {
		/*private AppiumDriver<AndroidElement> driver;
		private WebDriverWait wait;*/

		WebDriver driver = new ChromeDriver();
		
		String ruta = "C:\\Users\\hp-pc\\Desktop\\fotos\\";
		driver.manage().window().maximize();
		driver.get("http://www.entel.cl/");
		driver.findElement(By.id("MovilVisible")).clear();
	    driver.findElement(By.id("MovilVisible")).sendKeys("981575687");
	    driver.findElement(By.id("Rut")).clear();
	    driver.findElement(By.id("Rut")).sendKeys("1.111.744-9");
	    driver.findElement(By.id("PIN")).clear();
	    driver.findElement(By.id("PIN")).sendKeys("9696");
	    driver.findElement(By.id("LB_btnLoginEntel")).click();
	    ScreenShot.captureScreen(ruta+"imagen1.png");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    ScreenShot.captureScreen(ruta+"imagen2.png");
	    driver.findElement(By.linkText("Tráfico")).click();
	    ScreenShot.captureScreen(ruta+"imagen2.png");
	    driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	    ScreenShot.captureScreen(ruta+"imagen3.png");
	    driver.findElement(By.linkText("Multi Smart")).click();
	}
	
}
