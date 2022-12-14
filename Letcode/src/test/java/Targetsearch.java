

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Targetsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.target.com/");
		WebElement ele= driver.findElement(By.id("search"));
		ele.sendKeys("pencil pouch for kids",Keys.ENTER);
				
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//button[text()='Price']")).click();
		driver.findElement(By.xpath("//div//label[contains(@for,'chk-5zja2')]/div[contains(@class,'styles__CheckboxVisual-sc-1v63imw-5')]")).click();
		driver.findElement(By.xpath("//div//button[text()='Update']")).click();
		System.out.println(driver.getCurrentUrl());
		
		
		
		
		

	  //driver.navigate().to(null);
	}

}
