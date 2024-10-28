package org.redbus;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbus {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		//to find webeleement
		WebElement account=driver.findElement(By.xpath("//span[text()='Account']"));
		account.click();
		
		WebElement login=driver.findElement(By.xpath("//span[text()='Login/ Sign Up']"));
		login.click();
		//implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//to fetch frame parent webelement
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		
		//to switch into frame
		driver.switchTo().frame(frame);
		
		//to fetch signin frame
		WebElement signin=driver.findElement(By.xpath("//iframe[@title='Sign in with Google Button']"));
		driver.switchTo().frame(signin);
		
		WebElement google=driver.findElement(By.xpath("(//span[text()='Sign in with Google'])[1]"));
		System.out.println(google.getText());
		
		//switch to parent frame
		driver.switchTo().parentFrame();
		
		WebElement phone=driver.findElement(By.xpath("//div[@class='mobileInput clearfix']"));
		phone.sendKeys("8976543270l");
	}

}
