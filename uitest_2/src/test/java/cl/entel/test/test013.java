package cl.entel.test;
import java.io.File;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class test013 {
	public static void main(String[] args) throws Exception {
		File directorio  = new File("C:\\Users\\hp-pc\\Desktop\\Personas_Web_Mobile");
		directorio.mkdirs();
		WebDriver driver = new FirefoxDriver();
		String fono ="982220871"; 
		String rut ="14.343.974-7";
		String pin ="8888";
		String ruta = "C:\\Users\\hp-pc\\Desktop\\Personas_Web_Mobile\\";
		driver.manage().window().maximize();
		driver.get("http://appswls.entel.cl/mientel/login.action");
		driver.findElement(By.id("msisdn")).clear();
	    driver.findElement(By.id("msisdn")).sendKeys(fono);
	    driver.findElement(By.id("rut")).clear();
	    driver.findElement(By.id("rut")).sendKeys(rut);
	    driver.findElement(By.id("pin")).clear();
	    driver.findElement(By.id("pin")).sendKeys(pin);
	    ScreenShot.captureScreen(ruta+"test13-1.png");
	    driver.findElement(By.id("entrar")).click();
	    Thread.sleep(5000);
	    ScreenShot.captureScreen(ruta+"test13-2.png");
	    driver.findElement(By.cssSelector("span.icon.icon-menu")).click();
	    Thread.sleep(5000);
	    ScreenShot.captureScreen(ruta+"test13-3.png");
	    driver.findElement(By.linkText("Mis Bolsas")).click();
	    Thread.sleep(5000);
	    ScreenShot.captureScreen(ruta+"test13-4.png");
	    driver.findElement(By.linkText("Contratar bolsas")).click();
	    Thread.sleep(5000);
	    ScreenShot.captureScreen(ruta+"test13-5.png");
	    Thread.sleep(5000);
	    driver.findElement(By.linkText("Bolsas de Voz")).click();
	    Thread.sleep(5000);
	    ScreenShot.captureScreen(ruta+"test13-6.png");
	    driver.findElement(By.cssSelector("b")).click();
	    Thread.sleep(5000);
	    ScreenShot.captureScreen(ruta+"test13-7.png");
	    driver.findElement(By.id("confirmaCompra")).click();
	    Thread.sleep(2000);
	    ScreenShot.captureScreen(ruta+"test13-8.png");
	    driver.findElement(By.id("confirmaCompra")).click();
	    Thread.sleep(2000);
	    driver.close();
	    JOptionPane.showMessageDialog(null,"Test realizado exitosamente");
	}
	
}
