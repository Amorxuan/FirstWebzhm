package com.guoyasoft;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.thoughtworks.selenium.Wait;

public class TwoTestNG   {
	WebDriver driver;
  @BeforeClass
  public void openchorme() {
	  System.setProperty("webdriver.chrome.driver", "c:/software/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.baidu.com");	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }
  @Test
  public void testbaidu() throws InterruptedException {
	  WebElement username=driver.findElement(By.id("kw"));
	  username.sendKeys("果芽软件");
	  
	  Thread.sleep(2000);
	  
		WebElement submit=driver.findElement(By.xpath("//input[@id='su']"));
		submit.click();
		
	  Thread.sleep(2000);
	  
	  boolean result=driver.getPageSource().contains("上海果芽软件科技有限公司");
	  
	  Assert.assertEquals(true, result);
  }
}
