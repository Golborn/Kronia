package cl.entel.test;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;  
import javax.swing.JOptionPane;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.firefox.FirefoxDriver;  
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.junit.Test;

import com.sun.jna.platform.FileUtils;  
public class Personas_Web_Mobile_24 {
	//conexion.setUp();
	public void cal(){
		/*
		String fono ="993593983"; 
		String rut ="13.766.442-9";
		String pin ="5541";
		String ruta = "C:\\Users\\hp-pc\\Desktop\\Personas_Web_Mobile\\";
		driver.get("http://appswls.entel.cl/mientel/login.action");
		driver.findElement(By.id("msisdn")).clear();
	    driver.findElement(By.id("msisdn")).sendKeys(fono);
	    driver.findElement(By.id("rut")).clear();
	    driver.findElement(By.id("rut")).sendKeys(rut);
	    driver.findElement(By.id("pin")).clear();
	    driver.findElement(By.id("pin")).sendKeys(pin);
	    driver.findElement(By.id("entrar")).click();
	    driver.findElement(By.cssSelector("span.icon.icon-menu")).click();
	    driver.findElement(By.linkText("Mis Bolsas")).click();
	    driver.findElement(By.linkText("Contratar bolsas")).click();
	    
	    */
	}
@Test
	public void testA() throws Exception {
		Personas_Web_Mobile_24 a=new Personas_Web_Mobile_24();
	//a.setUp();
	a.cal();           
	}
	

}
