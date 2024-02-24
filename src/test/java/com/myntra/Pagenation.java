package com.myntra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.baseclass.Base_Class;
import com.sdp.Myntra_Home_Container;

public class Pagenation extends Base_Class {

	public static void getallname() throws Throwable {
		browerLaunch("chrome");
		Myntra_Home_Container pom = new Myntra_Home_Container(driver);
		getUrl("https://www.myntra.com/");
		movetoElement(pom.getNames().getClick_kids());
		movetoelement_click(pom.getNames().getKids_Tshirt());

		scrollUpandDownusingCoordinates(0, 4000);
		Thread.sleep(1000);

		List<WebElement> pagesize = pom.getNames().getPagesize();

		ArrayList<String> Product_N = new ArrayList<String>();
		ArrayList<Integer> productprices = new ArrayList<Integer>();
		int size = size(pagesize);

		for (int i = 0; i < size; i++) {
//     	 WebElement pages = pagesize.get(i);
//     	 pages.click();

			List<WebElement> allprice = pom.getNames().getAllprice();
			List<WebElement> allname = pom.getNames().getAllname();

			parseint(allprice, productprices);
			Thread.sleep(1000);
			getElementTexts(allname, Product_N);

			WebElement next_button = pom.getNames().getNext_button();
			String elementTextAttribute = getElementTextAttribute(next_button);
			if (!elementTextAttribute.contains("disabled")) {
				next_button.click();

			} else {
				System.out.println("no pagenation");
			}

		}

		for (Integer integer : productprices) {
			System.out.println("all product price   :" + integer);

		}
		for (String s : Product_N) {
			System.out.println("names   :" + s);
		}

	}

	public static void main(String[] args) throws Throwable {

		getallname();

	}
}
