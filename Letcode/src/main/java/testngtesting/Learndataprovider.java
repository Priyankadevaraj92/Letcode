package testngtesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Learndataprovider {
@Test(dataProvider= "getdata",dataProviderClass = DataUtils.class)
public void login(String data[]) {
	System.err.println("Email: "+data[0]);
	System.err.println("Psss: "+data[1]);
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://letcode.in/");
	WebElement log=driver.findElement(By.linkText("Log in"));
	log.click();
	WebElement ele2 =driver.findElement(By.name("email"));
	ele2.sendKeys(data[0],Keys.TAB);
	WebElement ele3= driver.findElement(By.name("password"));
	ele3.sendKeys(data[1]);
	driver.findElement(By.xpath("//button[text()='LOGIN']")).submit();
	driver.quit();
}	
	
}
