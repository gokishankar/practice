package org.redbus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class eregistration {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.etravel.com/");
		
		WebElement Account =driver.findElement(By.xpath("//button[@id='menumyaccount']"));
		Account.click();
		WebElement  register=driver.findElement(By.xpath("//a[text()='Register']"));
		register.click();
		WebElement Firstname=driver.findElement(By.xpath("(//input[@placeholder='First Name'])[2]"));
		Firstname.sendKeys("gokila");
			
}
}