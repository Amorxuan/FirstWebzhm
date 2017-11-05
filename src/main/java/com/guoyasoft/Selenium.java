package com.guoyasoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	public static void main(String[] args)throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "C:/software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	Thread.sleep(3000);
	
	driver.get("http://127.0.0.1:8081/FirstWebzhm/MyHtml.html");
	
	Thread.sleep(3000);
	
	boolean isSucess = driver.getPageSource().contains("login");
	System.out.println(isSucess);
	
	WebElement userName = driver.findElement(By.id("login"));
	userName.clear();
	userName.sendKeys("zhenghuimin");
	
	Thread.sleep(3000);
	
	WebElement password = driver.findElement(By.id("password"));
	password.clear();
	password.sendKeys("123456");
	
	Thread.sleep(3000);
	
	WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
	submit.click();
	
	Thread.sleep(3000);
	
	isSucess=driver.getPageSource().contains("post sucess");
	System.out.println(isSucess);
	
	driver.quit();
	
	
	
}
}
