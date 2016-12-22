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

public class test003 {

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
	    ScreenShot.captureScreen(ruta+"test3-1.png");
	    driver.findElement(By.id("entrar")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.linkText("Estado de cuenta_")).click();
	    Thread.sleep(5000);
	    ScreenShot.captureScreen(ruta+"test3-2.png"); 
	    Thread.sleep(9000);
	    driver.close();
	    JOptionPane.showMessageDialog(null,"Test realizado exitosamente"); 

	}

}
