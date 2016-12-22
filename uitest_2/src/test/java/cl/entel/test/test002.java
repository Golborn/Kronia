package cl.entel.test;
import java.io.File;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.jna.platform.FileUtils;
public class test002 {
	public static void main(String[] args) throws Exception {
		File directorio  = new File("C:\\Users\\hp-pc\\Desktop\\Personas_Web_Mobile");
		directorio.mkdirs();
		WebDriver driver = new FirefoxDriver();	
		String ruta = "C:\\Users\\hp-pc\\Desktop\\Personas_Web_Mobile\\";
		driver.manage().window().maximize();
		driver.get("http://appswls.entel.cl/mientel/login.action");
		driver.findElement(By.id("msisdn")).clear();
	    driver.findElement(By.id("msisdn")).sendKeys("969196923");
	    driver.findElement(By.id("rut")).clear();
	    driver.findElement(By.id("rut")).sendKeys("16.653.307-4");
	    driver.findElement(By.id("pin")).clear();
	    driver.findElement(By.id("pin")).sendKeys("4758");
	    ScreenShot.captureScreen(ruta+"test2-1.png");
	    driver.findElement(By.id("entrar")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.linkText("Consideraciones")).click();
	    Thread.sleep(5000);
	    ScreenShot.captureScreen(ruta+"test2-2.png"); 
	    Thread.sleep(9000);
	    driver.close();
	    JOptionPane.showMessageDialog(null,"Test realizado exitosamente"); 
	}
}
