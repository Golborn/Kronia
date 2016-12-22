package cl.entel.test;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
public class ScreenShot {

    public static void captureScreen(String fileName) throws Exception {
    Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    Rectangle screenRectangle = new Rectangle(screenSize);
    Robot robot = new Robot();
    BufferedImage image = robot.createScreenCapture(screenRectangle);
    ImageIO.write(image, "png", new File(fileName));
    }

}
