package week3.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TamilMatrimony {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.tamilmatrimony.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("REGISTERED_BY")).sendKeys("Myself");
		driver.findElement(By.id("NAME")).sendKeys("Nithis");
		driver.findElement(By.id("gendermale")).click();
		driver.findElement(By.id("DOBDAY")).sendKeys("29");
		driver.findElement(By.id("DOBMONTH")).sendKeys("05");
		driver.findElement(By.id("DOBYEAR")).sendKeys("1999");
		driver.findElement(By.id("RELIGION")).sendKeys("Hindu");
		driver.findElement(By.id("MOTHERTONGUE")).sendKeys("Tamil");
		driver.findElement(By.id("COUNTRY")).sendKeys("India");
		driver.findElement(By.id("M_COUNTRYCODE")).sendKeys("+91");
		driver.findElement(By.id("MOBILENO")).sendKeys("7639054321");
		driver.findElement(By.id("EMAIL")).sendKeys("nithis1234@gmail.com");
		
		
		
		
		
	}
	
	
	
	
	
	

}
