package week3.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UIBank {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://uibank.uipath.com/register-account");
		driver.manage().window().maximize();
		driver.findElement(By.id("firstName")).sendKeys("Nithis");
		driver.findElement(By.id("title")).sendKeys("Mr");
		driver.findElement(By.id("middleName")).sendKeys("M");
		driver.findElement(By.id("lastName")).sendKeys("Murugesan");
		driver.findElement(By.id("sex")).sendKeys("Male");
		driver.findElement(By.id("employmentStatus")).sendKeys("full-time");
		driver.findElement(By.id("age")).sendKeys("05/29/99");
		driver.findElement(By.id("username")).sendKeys("Nithis1999");
		driver.findElement(By.id("email")).sendKeys("nithis2905@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456789");
		
		
		
		
		
	}
	
	
	
	

}
