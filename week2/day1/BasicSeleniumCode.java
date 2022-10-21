package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicSeleniumCode {
public static void main(String[] args){
	//setup driver before starting the browser
	WebDriverManager.chromedriver().setup();
	//we can change chromedriver() to opera or any other browser we are using.
	//open a chrome browser
	ChromeDriver driver = new ChromeDriver();
	//if we run till this we can see an empty chrome page opening
    
	// Load the url to test
	driver.get("http://leaftaps.com/opentaps/control/main");
	//maximize the browser
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
	
	WebElement CompanyName = driver.findElement(By.id("createLeadForm_companyName"));
	CompanyName.sendKeys("HCL");
	
	WebElement FirstName = driver.findElement(By.id("createLeadForm_firstName"));
	FirstName.sendKeys("sunan");
	
	WebElement LastName = driver.findElement(By.id("createLeadForm_lastName"));
	LastName.sendKeys("vignesh");
	
	WebElement CreateLead = driver.findElement(By.className("smallSubmit"));
	CreateLead.click();
	
	
	
	
	
	
	//driver.findElement(By.id("username"))
	//close the browser
	//driver.close();
}
}
