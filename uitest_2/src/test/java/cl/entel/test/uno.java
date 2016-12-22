package cl.entel.test;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class uno {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
			driver.get("https://mail.live.com/?mkt=es-us");
			driver.findElement(By.id("i0116")).clear();
		    driver.findElement(By.id("i0116")).sendKeys("eduardo.brizuela.santis@hotmail.com");
		    driver.findElement(By.id("i0118")).clear();
		    driver.findElement(By.id("i0118")).sendKeys("Princes@");
		    driver.findElement(By.id("idSIButton9")).click();
		    
		   
	}
}