package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLeadPage {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		
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
		
		WebElement elementFindLeads = driver.findElement(By.linkText("Find Leads"));
		elementFindLeads.click();
		
		Thread.sleep(5000);

		// Click on Phone
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();

		// Enter phone number
		
		driver.findElement(By.name("phoneNumber")).sendKeys("9597661212");

		// Click find leads button
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		// Capture lead ID of First Resulting lead

		String str = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println("Captured Lead ID is" + " " + str);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

		// click delete
		driver.findElement(By.linkText("Delete")).click();

		// click find leads button
		driver.findElement(By.linkText("Find Leads")).click();

		// Enter captured LeadId
		driver.findElement(By.name("id")).sendKeys(str);

		// Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		// Verify message "No records to display" in the Lead List. This message
		// confirms the successful deletion
		String noRecord = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(noRecord);

		if (noRecord.contains("No records to display")) {

			System.out.println("The LeadId has been deleted Succesfully");
		} else {
			System.out.println("The LeadId is not Deleted");
		}
		Thread.sleep(5000);
		driver.close();
		
		
		
	}

}
