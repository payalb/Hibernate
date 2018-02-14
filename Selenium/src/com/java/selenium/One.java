package com.java.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class One {
	WebDriver driver;
	JavascriptExecutor executor;
	public void invokeBrowser(){
		System.setProperty("webdriver.firefox.marionette","E:\\java\\jar\\geckodriver-v0.17.0-win64\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		//To go to url
		driver.get("http://www.google.com");
	}
	public static void main(String args[]){
		One obj= new One();
		obj.invokeBrowser();
		obj.searchText();
	}
	
	public void searchText(){
		driver.findElement(By.id("searchText")).sendKeys("Java");
		driver.findElement(By.id("searchSubmit")).click();
		executor= (JavascriptExecutor) driver;
		executor.executeScript("scroll(0, 1000)");
		//scroll vertically down
		driver.findElement(By.xpath("xpathExpression"));
	}
}
