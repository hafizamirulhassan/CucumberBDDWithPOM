package com.crm.qa.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.crm.qa.base.Base;

public class TestUtils extends Base {

	public static int PAGELOAD=20;
	public static int IMPLICITWAIT=30;
	
	
	// Generic code of taking screenshots and this will be use in WebEventListner and "falied" method have to call in
	// WebEventListner Class in exception method.
	
	public static void failed() throws IOException {
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String currentDir = System.getProperty("C:/Users/Admin");
		FileUtils.copyFile(srcFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}
	

	
	
	
}
