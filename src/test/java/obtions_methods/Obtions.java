package obtions_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Obtions {
	
	
	public static void main(String[] args) {
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		options.addArguments("--disable-infobars");
		options.addArguments("--disable-popup-blocking");
		WebDriver driver =new ChromeDriver(options);
//		driver.get("http://wordpressdemo.webkul.com/wordpress-latest-tweets/");
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel  ']")).click();

	

		
		
		
		
		
	}
	

}
