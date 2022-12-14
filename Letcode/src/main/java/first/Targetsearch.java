package first;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Targetsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.target.com/");
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement ele=driver.findElement(By.id("search"));

		Actions aa =new Actions(driver);
		aa.click(ele).keyDown(Keys.SHIFT).sendKeys("pencil pouch for kids").keyUp(Keys.SHIFT).perform();
		driver.findElement(By.xpath("//button[text()='go']")).click();

		//ele.sendKeys("pencil pouch for kids",Keys.ENTER);		
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//button[text()='Price']")).click();

		WebElement zero = driver.findElement(By.xpath("//label[@for='chk-5zja2']/div[@class='styles__CheckboxVisual-sc-1ekjv4k-5 iNtnEG']"));
		//WebElement zero = driver.findElement(By.xpath("//div[text()='$0  –  $15']/parent::span"));
	//	WebElement zero = driver.findElement(By.xpath("//label[@for='chk-5zja2']"));
		             //above 3 lines is selecting but in console isselected=false
	//	WebElement zero1 = driver.findElement(By.xpath("//input[@id='chk-5zja2']/parent::div"));
		//WebElement zero = driver.findElement(By.name("chk-fwtfr")); -->nosuch element but this is the exact checkbox

		zero.click();
		System.out.println(zero.getText());
		System.out.println(zero.isDisplayed());
		wait.until(ExpectedConditions.elementToBeClickable(zero));
		System.out.println(zero.isSelected());

		//WebElement zero = driver.findElement(By.xpath("//div[text()='$0  –  $15']")); //parent::span"));
		//WebElement zero = driver.findElement(By.xpath("//input[@id='chk-5zja2']")); //-->eleClickableInterception
		//WebElement zero = driver.findElement(By.xpath("//label[@for='chk-5zja2']"));//div[@class='styles__CheckboxVisual-sc-1ekjv4k-5 iNtnEG']"));
		//WebElement zero = driver.findElement(By.xpath("//input[@id='chk-5zja2']/parent::div"));--> not selecting
		//	boolean selected = zero.isSelected();
		//wait.until(ExpectedConditions.elementSelectionStateToBe(zero, true));
		//elementToBeClickable(zero));
		//zero.click();

		driver.findElement(By.xpath("//div//button[text()='Update']")).click();
		System.out.println(driver.getCurrentUrl());
		driver.quit();






		//driver.navigate().to(null);
	}

}
