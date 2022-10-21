package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeaftapsDropdown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
        
		//Find an element
		WebElement elementUsername = driver.findElement(By.id("username"));
		//Action on the element
		elementUsername.sendKeys("Demosalesmanager");
		
		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");
		
		WebElement elementLogin =driver.findElement(By.className("decorativeSubmit"));
		elementLogin.click();
		
		WebElement elementCRMFSA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMFSA.click();
		
		WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		elementLeads.click();
		
		WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
		elementCreateLead.click();
		
		
		WebElement elementEmployee = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select(elementEmployee);
		dd.selectByVisibleText("Employee");
		
		WebElement elementIndustry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd1 = new Select(elementIndustry);
		dd1.selectByValue("IND_FINANCE");
		
		WebElement elementOwnership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dd2 = new Select(elementOwnership);
		dd2.selectByIndex(4);
		
		
	}

}
