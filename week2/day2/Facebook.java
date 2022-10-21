package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
public static void main(String[] args){
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));;
	
	WebElement elementCreateNewAcc = driver.findElement(By.linkText("Create New Account"));
	elementCreateNewAcc.click();
	
	//WebElement elementFirstName = driver.findElement(By.name("firstname"));
	//elementFirstName.sendKeys("sunan");
	driver.findElement(By.name("firstname")).sendKeys("sunan");
	driver.findElement(By.name("lastname")).sendKeys("vignesh");
	//WebElement elementSurName = driver.findElement(By.name("lastname"));
	//elementSurName.sendKeys("vignesh");
	
	WebElement elementEmail = driver.findElement(By.name("reg_email__"));
	elementEmail.sendKeys("ss@gmail.com");
	
	WebElement elementPassword = driver.findElement(By.id("password_step_input"));
	elementPassword.sendKeys("FacebookPassword@123");
	
	WebElement elementDay = driver.findElement(By.id("day"));
	Select dy = new Select(elementDay);
	dy.selectByVisibleText("26");
	
	WebElement elementMonth = driver.findElement(By.id("month"));
	Select Mo = new Select(elementMonth);
	Mo.selectByValue("8");
	
	WebElement elementYear = driver.findElement(By.id("Year"));
	Select Ye = new Select(elementYear);
	Ye.selectByValue("1994");
	
	WebElement elementGender = driver.findElement(By.id("u_b_4_Vj"));
	Select Gen = new Select(elementGender);
	Gen.selectByValue("1");
	
}
}
