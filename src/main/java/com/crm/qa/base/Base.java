package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.utility.TestUtils;


public class Base {

	public static WebDriver driver;
	public static Properties prop;	
	

	public Base() {

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"C:\\Users\\Admin\\eclipse-workspace\\E2E_CRMProject\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

	public void browser_intialization() {

		String BrowserName = prop.getProperty("browser");

		if (BrowserName.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Admin\\eclipse-workspace\\E2E_CRMProject\\Resouces\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (BrowserName.equalsIgnoreCase("FF")) {

			System.setProperty("webdriver.geckodriver.driver",
					"C:\\Users\\Admin\\eclipse-workspace\\E2E_CRMProject\\Resouces\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("Browser does not exist");
		}

	
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGELOAD, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICITWAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

}
