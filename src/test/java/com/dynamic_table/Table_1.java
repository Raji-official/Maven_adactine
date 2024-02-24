package com.dynamic_table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



    public class Table_1 {
	String name;
	String given_name="Bhavish Aggarwal";
    @Test
	private void findname() {
		
    	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
		 List<WebElement> findElements = driver. findElements(By.xpath("//table[@id='customers']//td"));
		
		  
		 for (int i = 0; i < findElements.size(); i++) {
			name = findElements.get(i).getText();
			System.out.println(name);
			if( name.contains(given_name)) {
				System.out.println(name);
				driver.findElement(By.xpath("//td[text()='"+given_name+"']//ancestor::tr//child::td//input")).click();
			}
		}
		 
		 
		 
	}
}
