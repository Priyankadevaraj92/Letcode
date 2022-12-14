package first;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehoverletcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		WebElement ele= driver.findElement(By.xpath("//div/img[contains(@alt,\"Appliances\")]"));
		Actions builder=new Actions(driver);
		builder.moveToElement(ele);
		driver.findElement(By.linkText("Washing Machines")).click();
	    System.out.println(driver.getTitle());
	}

}
