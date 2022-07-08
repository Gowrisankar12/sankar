package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Selennium Redbus\\chrome\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		
		driver.get("https://www.redbus.in/");
		
		
		
	 WebElement TextFrom = driver.findElement(By.id("src"));
	 TextFrom.sendKeys("chennai");
	 String attribute2 = TextFrom.getAttribute("value");
	 System.out.println(attribute2);
		
		WebElement TextTo = driver.findElement(By.id("dest"));
		TextTo.sendKeys("Erode");
		
		String attribute = TextTo.getAttribute("value");
		System.out.println(attribute);
		driver.manage().window().maximize();
		WebElement Textsgn = driver.findElement(By.id("signin-block"));
	    Textsgn.click();
	    WebElement Textsgn1 = driver.findElement(By.id("mobileNoInp"));
	    Textsgn1.sendKeys("9095548326");
		
		
		
		
	}

}
