package week3.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nithis");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("M");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("nithis234@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("nithis2345");
		WebElement birthdayDay = driver.findElement(By.id("day"));
		Select birthday=new Select(birthdayDay);
		birthday.selectByVisibleText("29");
		WebElement birthMonth = driver.findElement(By.id("month"));
		Select birthdayMonth=new Select(birthMonth);
		birthdayMonth.selectByVisibleText("May");
		WebElement birthYear = driver.findElement(By.id("year"));
		Select birthdayYear=new Select(birthYear);
		birthdayYear.selectByVisibleText("1999");
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		//driver.close();
		
		
		
		
	}
	
	

}
