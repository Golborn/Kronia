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
import org.openqa.selenium.support.ui.Select;
public class test020 {
	public static void main(String[] args) throws Exception {
		File directorio  = new File("C:\\Users\\hp-pc\\Desktop\\Personas_Web_Mobile");
		directorio.mkdirs();
		WebDriver driver = new FirefoxDriver();
		String fono ="981331660"; 
		String rut ="7.389.135-3";
		String pin ="9822";
		String ruta = "C:\\Users\\hp-pc\\Desktop\\Personas_Web_Mobile\\";
		driver.manage().window().maximize();
		driver.get("http://appswls.entel.cl/mientel/login.action");
		driver.findElement(By.id("msisdn")).clear();
	    driver.findElement(By.id("msisdn")).sendKeys(fono);
	    driver.findElement(By.id("rut")).clear();
	    driver.findElement(By.id("rut")).sendKeys(rut);
	    driver.findElement(By.id("pin")).clear();
	    driver.findElement(By.id("pin")).sendKeys(pin);
	    ScreenShot.captureScreen(ruta+"test20-1.png");
	    driver.findElement(By.id("entrar")).click();
	    Thread.sleep(5000);
	    ScreenShot.captureScreen(ruta+"test20-2.png");
	    driver.findElement(By.cssSelector("span.icon.icon-menu")).click();
	    Thread.sleep(5000);
	    ScreenShot.captureScreen(ruta+"test20-3.png");
	    driver.findElement(By.linkText("Recargas")).click();
	    Thread.sleep(5000);
	    ScreenShot.captureScreen(ruta+"test20-4.png");
	    new Select(driver.findElement(By.id("producto"))).selectByVisibleText("Telefon�a Hogar");
	    Thread.sleep(5000);
	    ScreenShot.captureScreen(ruta+"test20-5.png");
	    driver.findElement(By.id("numero")).clear();
	    driver.findElement(By.id("numero")).sendKeys("981331660");
	    Thread.sleep(3000);
	    ScreenShot.captureScreen(ruta+"test20-6.png");
	    driver.findElement(By.id("monto")).click();
	    Thread.sleep(3000);
	    ScreenShot.captureScreen(ruta+"test20-7.png");
	    new Select(driver.findElement(By.id("monto"))).selectByVisibleText("$3.500");
	    Thread.sleep(3000);
	    ScreenShot.captureScreen(ruta+"test20-8.png");
	    driver.findElement(By.cssSelector("option[value=\"03500\"]")).click();
	    Thread.sleep(3000);
	    ScreenShot.captureScreen(ruta+"test20-9.png");
	    driver.findElement(By.id("btn_continuar")).click();
	    Thread.sleep(5000);
	    ScreenShot.captureScreen(ruta+"test20-10.png");
	    Thread.sleep(10000);
	    driver.close();
	    JOptionPane.showMessageDialog(null,"Test realizado exitosamente");
	}
}