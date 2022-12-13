package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoCsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Zoho");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nithis");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Nithis");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("M");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("software Tester");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("15LPA");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("250");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("7452");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Software Test Engineer");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Having Knowledge Of Both Manual And Automation");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("$");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7639098866");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("04324");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("kumar");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("09443");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nithismurugesan29@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://www.facebook.com/login/");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Nithis");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Nithis");
		driver.findElement(By.name("generalAddress1")).sendKeys("19 sundrampalnagar");
		driver.findElement(By.name("generalAddress2")).sendKeys("velayuthampalayam");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("karur");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("639127");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("639128");
		driver.findElement(By.name("submitButton")).click();
	}

}
