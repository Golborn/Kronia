package cl.entel.test;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
/***
 * Realiza capturas de pantalla en la automatizacion de pruebas con Selenium
 * WebDriver y deja las imagenes en un directorio especificado. Para un mejor
 * desempeño se recomienda la utilizacion de la libreria apache.commons.io.FileUtils
 * la cual permite trabajar mucho mejor con archivos, ejemplo copiando archivos
 * binarios como las imagenes
 *
 * ver : http://seleniumhq.org/docs/04_webdriver_advanced.html
 * ver : http://commons.apache.org/io/download_io.cgi
 * @author codesandtags
 *
 */
public class TakeScreenShotSelenium {
 
   public static void main(String[] args) {
 
      //Se utiliza un driver de Firefox
      WebDriver driver = new FirefoxDriver();
 
      //Pagina principal
      driver.navigate().to("http://google.com");
      takeScreenShotTest(driver, "Hola");
      //Pagina de Testing
      driver.findElement(By.linkText("Hola")).click();
      takeScreenShotTest(driver, "Hola");
 
      //Se finaliza el uso del driver
      driver.close();
   }
 
   /**
    * Toma una impresion de pantalla y la guarda en un directorio donde quedan
    * todas las evidencias de prueba
    *
    * @param driver
    * @throws IOException
    */
   public static void takeScreenShotTest(WebDriver driver, String imageName) {
      //Directorio donde quedaran las imagenes guardadas
      File directory = new File("C:\\Users\\hp-pc\\Desktop\\");
 
      try {
         if (directory.isDirectory()) {
            //Toma la captura de imagen
            File imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            //Mueve el archivo a la carga especificada con el respectivo nombre
            FileUtils.copyFile(imagen, new File(directory.getAbsolutePath()   + "C:\\Users\\hp-pc\\Desktop\\Personas_Web_Mobile\\" + imageName + ".png"));
         } else {
            //Se lanza la excepcion cuando no encuentre el directorio
            throw new IOException("ERROR : La ruta especificada no es un directorio!");
         }
      } catch (IOException e) {
         //Impresion de Excepciones
         e.printStackTrace();
      }
   }
 
}