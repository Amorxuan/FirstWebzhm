package com.guoyasoft;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class FirstTestNGTestTest {
	WebDriver driver;
  @BeforeClass
  public void openChrome() {
	  System.setProperty("webdriver.chrome.driver",
				"C:/software/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://127.0.0.1:8081/FirstWebzhm/MyHtml.html");
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }
  @Test
  public void testlogin() {
	  WebElement userName = driver.findElement(By.id("login"));
		userName.clear();
		userName.sendKeys("zhenghuimin");
		
		
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("123456");
		
		
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
		
		boolean isSucess=driver.getPageSource().contains("post sucess");
		
		Assert.assertEquals(true, isSucess);
  }
}
