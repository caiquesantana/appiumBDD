package br.com.rsinet.hub_bdd.appium.suporte;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class DriverWeb {
	private static DesiredCapabilities capabilities;
	public static WebDriver driver;

	@SuppressWarnings("rawtypes")
	public static WebDriver creatDriver() throws MalformedURLException {
		if (driver == null) {

			capabilities = new DesiredCapabilities();
			capabilities.setCapability("deviceName", "AOSP on IA Emulator");
			capabilities.setCapability("platformVersion", "9.0");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("appPackage", "com.Advantage.aShopping");
			capabilities.setCapability("appActivity", "com.Advantage.aShopping.SplashActivity");
			capabilities.setCapability("unicodeKeyboard", true);
			capabilities.setCapability("resetKeyBoard", true);
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		return driver;

	}

	public static WebDriver fecharDriver() {
		if (driver != null)
			driver.quit();
		return driver = null;
	}
}