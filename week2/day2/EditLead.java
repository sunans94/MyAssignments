package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");
		
		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");
		
		WebElement elementLogin =driver.findElement(By.className("decorativeSubmit"));
		elementLogin.click();
		
		WebElement elementCRMFSA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMFSA.click();
		
		WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		elementLeads.click();
		
		WebElement elementEmpId = driver.findElement(By.linkText("10111"));
		elementEmpId.click();
		
		WebElement elementEditButton = driver.findElement(By.className("subMenuButton"));
		elementEditButton.click();
		
		WebElement elementCompanyName = driver.findElement(By.name("companyName"));
		elementCompanyName.clear();
		elementCompanyName.sendKeys("Cognizant");
		
		//WebElement elementUpdate = driver.findElement(By.className("smallSubmit"));
		//elementUpdate.click();
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		Thread.sleep(200);
		driver.close();
	
		
		
		
		
	}

}
