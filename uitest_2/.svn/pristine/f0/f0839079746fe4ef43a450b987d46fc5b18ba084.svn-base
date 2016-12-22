package cl.entel.test.util;

import java.io.File;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Mobile {

	public static DesiredCapabilities setup(String apk, String pkg, String activity) {
		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "apk");
		File app = new File(appDir, apk);

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName","Android Emulator");
		capabilities.setCapability("platformVersion", "4.4");
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appPackage", pkg);
		// capabilities.setCapability("appActivity", activity);  // FIXME

		return capabilities;
	}
}
