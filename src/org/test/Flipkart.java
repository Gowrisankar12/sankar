package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Seleniumday1\\chrome2\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		Thread.sleep(3000);
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
	//	driver.navigate().back();
		Thread.sleep(3000);
	//	driver.navigate().forward();
	//	driver.navigate().refresh();
		
		WebElement loginbtn= driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		loginbtn.click();
		Thread.sleep(5000);
		
		WebElement textusername = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		textusername.sendKeys("9095548326");
		
	//	WebElement textpwd= driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
	//	textpwd.sendKeys("123456789");
		
		
		

}}
