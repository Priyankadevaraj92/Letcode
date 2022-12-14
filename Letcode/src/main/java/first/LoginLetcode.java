package first;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginLetcode {

	public static void main(String[] args) throws IOException {
		Properties config = new Properties();
		FileInputStream fis= new FileInputStream("C:\\Priyanka\\eclipse workspace\\Myprogram\\config.properties");
		config.load(fis);
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://letcode.in/");
		WebElement log=driver.findElement(By.linkText("Log in"));
		log.click();
		System.out.println(log.getText());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
	WebElement ele=	driver.findElement(By.xpath("//div[contains(@class,'box column is-half')]"));
	String textt=ele.getText();
	System.out.println(textt);
	WebElement ele2 =driver.findElement(By.name("email"));
	String att= ele2.getAttribute("placeholder");
	System.out.println(att);
	ele2.sendKeys(config.getProperty("Userid"),Keys.TAB);
	WebElement ele3= driver.findElement(By.name("password"));
	String att2= ele3.getAttribute("type");
	System.out.println(att2);
	ele3.sendKeys(config.getProperty("Password"));
	driver.findElement(By.xpath("//button[text()='LOGIN']")).submit();
	//driver.findElement(By.xpath("//button[contains(@class,'button is-primary')][1]")).click();
	
	//visibility of toast
	WebElement toast= driver.findElement(By.xpath("//div[contains(@id,'toast-container')]/div"));
	//div[contains(@id,'toast-container')]/div
	wait.until(ExpectedConditions.visibilityOf(toast));
	System.out.println(toast.getText());
	//Invisibility of toast
	Boolean toastmsg= wait.until(ExpectedConditions.invisibilityOf(toast));
	System.out.println(toastmsg);
	driver.findElement(By.linkText("Sign out")).click();
	WebElement toast2=driver.findElement(By.xpath("//div[contains(@role,'alertdialog')]"));
	System.out.println(toast2.getText());
	driver.quit();
		

	}

}
