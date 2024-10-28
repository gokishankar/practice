package org.redbus;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tourtravel {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://legacytourtravel.com/Secure/User/Login");
		
		WebElement login=driver.findElement(By.xpath("//a[@id='LoginLink']"));
		login.click();
		WebElement register=driver.findElement(By.xpath("//a[@id='RegisterUserLink']"));
		register.click();
		WebElement email=driver.findElement(By.xpath("//input[@name='Email']"));
		//fluent wait 
				FluentWait<WebDriver> w=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofNanos(45)).
						pollingEvery(Duration.ofNanos(10));
				w.until(ExpectedConditions.alertIsPresent());
		
		email.sendKeys("dhruva@123");
		

		WebElement pass=driver.findElement(By.xpath("//input[@name='Password']"));
		pass.sendKeys("12345");
		
		WebElement loginbt=driver.findElement(By.xpath("/input[@class='LoginButton']"));
		loginbt.click();
		
}
	
}