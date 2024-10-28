package org.redbus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facecss {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	
	WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
	String attribute=login.getCssValue("font-size");
	System.out.println(attribute);
	boolean result= login.isEnabled();
	System.out.println(result);

}
}
