package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWait {

	public static void main(String[] args) {
		//Setting up driver before starting browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement elementusername = driver.findElement(By.linkText("Create New Account"));
	    elementusername.click();
	   
	    driver.findElement(By.name("firstname")).sendKeys("sunan");
	    driver.findElement(By.name("lastname")).sendKeys("vig");
		

	    WebElement elementDay = driver.findElement(By.id("day"));
	    Select dd = new Select(elementDay);
	    dd.selectByVisibleText("26");
	    
	    WebElement elementMonth = driver.findElement(By.id("month"));
	    Select dd1 = new Select(elementMonth);
	    dd1.selectByValue("3");
	    
	    
	    
	    
	}

}
