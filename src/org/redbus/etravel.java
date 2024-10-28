package org.redbus;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class etravel {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.busbud.com/");
		
		
		
		WebElement Account =driver.findElement(By.xpath("//span[text()='Sign in']"));
		Account.click();
		WebElement login=driver.findElement(By.cssSelector("t-8pzsp8-label"));
		login.click();
		
		String id=driver.getWindowHandle();
		System.out.println(id);
		driver.switchTo().window(id);
		
		
		// TEXT STARTS WITH
		WebElement register=driver.findElement(By.xpath("//a[starts-with(text(),'New User?')]"));
		register.click();
		// contains withouttagname  and and operator
		WebElement fname=driver.findElement(By.xpath("//*[contains(@name,'txt') and @id='txtFName']"));
		fname.sendKeys("gokila");
		
		// contains withtagname  and and operator
			WebElement lname=driver.findElement(By.xpath("//input[contains(@id,'LastName') and @name='txtLastName']"));
				lname.sendKeys("shankar");
				
			Alert a=	driver.switchTo().alert();
			a.accept();
				
				
		//starts with attribute
		
		WebElement mobile =driver.findElement(By.xpath("//input[starts-with(@name,'txtMo')]"));
		mobile.sendKeys("9876543210l");
		

		WebElement pass=driver.findElement(By.cssSelector("input#txtLoginPassword[type=password]"));
		pass.sendKeys("12345");
		driver.quit();
		
		WebElement loginbt=driver.findElement(By.xpath("a[id^=A1]"));
		loginbt.click();

}
}
