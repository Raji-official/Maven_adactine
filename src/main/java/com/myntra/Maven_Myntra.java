package com.myntra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maven_Myntra {

	public void WebElement() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK_New&gclid=CjwKCAiAs6-sBhBmEiwA1Nl8szwqW3W_KE9NnPzHFlwyulrmdxO9-BJLs6p8CrjnZSBmtUM2TCJoTxoC09gQAvD_BwE");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

	
}
