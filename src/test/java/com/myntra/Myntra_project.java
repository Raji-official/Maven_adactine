package com.myntra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra_project {


public static void  main(String[] args) {
	

//	Maven_Myntra Maven_Myntra = new Maven_Myntra();
//	Maven_Myntra.WebElement();	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK_New&gclid=CjwKCAiAs6-sBhBmEiwA1Nl8szwqW3W_KE9NnPzHFlwyulrmdxO9-BJLs6p8CrjnZSBmtUM2TCJoTxoC09gQAvD_BwE");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	Actions action=new Actions(driver);
	
	WebElement findElement = driver.findElement(By.xpath("(//a[@class='desktop-main'])[1]"));
	action.moveToElement(findElement).build().perform();
	
	driver.findElement(By.xpath("(//a[text()='T-Shirts'])[1]")).click();
	
	
	List<WebElement> findElements = driver.findElements(By.xpath("//ul[@class='results-base']"));
	List<WebElement> product_name = driver.findElements(By.xpath("	//h3[@class='product-brand']"));
	List<WebElement> product_price = driver.findElements(By.xpath("//span[@class='product-discountedPrice']"));
	

	
//	for (WebElement webElement : findElements) {
//		System.out.println(webElement.getText());
//	}
	
	 String name;
	 String priceString;
	 int price;
	 
	 HashMap<Integer, String> arr=new HashMap<Integer, String>();
	 
	 for (int i = 0; i < product_name.size(); i++) {
		 name=product_name.get(i).getText();
		 priceString=product_price.get(i).getText().replace("Rs.", "").trim();
		 System.out.println(priceString);
		 price = Integer.parseInt(priceString);
		 System.out.println(price);
		 arr.put(price, name);
		
	}
	 System.out.println(arr);
	 Set<Integer> keySet = arr.keySet();
	 ArrayList<Integer> pri =new ArrayList<Integer>(keySet);
	 
	 Collections.sort(pri);
	 Integer min = pri.get(0);
	 
	 Integer max = pri.get(pri.size()-1);
	 
	 
	 System.out.println("min :"+min);
	 System.out.println("max :"+max);
	 System.out.println("min :"+min   +"  product name   : "+ arr.get(min));
	 System.out.println("max :"+max   +"  product name   :"+ arr.get(max));
	 
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}




}
