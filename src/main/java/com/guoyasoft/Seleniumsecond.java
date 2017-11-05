package com.guoyasoft;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumsecond {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:/software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	Thread.sleep(1000);
	
	driver.get("http://test.haiziguo.cn/");
	
	Thread.sleep(1000);
	
	boolean isSuccess=driver.getPageSource().contains("username");
	System.out.println(isSuccess);
	
	WebElement username = driver.findElement(By.id("username"));
	username.clear();
	username.sendKeys("18501687001");
	
	Thread.sleep(1000);
	
	WebElement password = driver.findElement(By.id("password"));
	password.clear();
	password.sendKeys("12345678");
	
	Thread.sleep(1000);
	
	WebElement button = driver.findElement(By.xpath("//input[@id='confirm_landing']"));
	button.click();
	
	Thread.sleep(1000);
	
	isSuccess = driver.getPageSource().contains("陕西小帅幼儿园");
	System.out.println(isSuccess);
	
	driver.quit();
	
	
	
}
}
