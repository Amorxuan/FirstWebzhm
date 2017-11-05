package com.guoyasoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumguoyaruanjian {
public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","C:/software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	Thread.sleep(1500);
	
	driver.get("http://www.baidu.com");
	
	Thread.sleep(1500);
	
	boolean isSuccess = driver.getPageSource().contains("kw");
	System.out.println("isSuccess");
	
	
	WebElement username=driver.findElement(By.id("kw"));
	username.clear();
	username.sendKeys("果芽软件");
	
	Thread.sleep(1500);
	
	WebElement submit=driver.findElement(By.xpath("//input[@id='su']"));
	submit.click();
	
	Thread.sleep(1500);
	
	isSuccess=driver.getPageSource().contains("上海果芽软件科技有限公司");
	System.out.println(isSuccess);
	driver.quit();
	
	
	
	
}
}
