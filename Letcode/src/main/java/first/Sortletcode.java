package first;

import java.awt.Point;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sortletcode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(300));
		driver.get("https://letcode.in/sortable");
		WebElement gettowork= driver.findElement(By.xpath(" //div[text()=' Get to work']"));
		org.openqa.selenium.Point point= gettowork.getLocation();
		int x1=point.getX();
		int y1=point.getY();
		System.out.println("x1="+x1+"y"+y1);
	 WebElement done=driver.findElement(By.xpath("//div[@id='cdk-drop-list-1']"));
	 org.openqa.selenium.Point point1= done.getLocation();
	    int x2=point1.getX();
		int y2=point1.getY();
		System.out.println("x2="+x2+"y2"+y2);
		Actions builder= new Actions(driver);
	     //builder.dragAndDrop(gettowork, done).perform();    --->this also work
		 //wait.until(ExpectedConditions.elementToBeClickable(gettowork));
		 //builder.moveByOffset(x1, y1).clickAndHold().perform(); //(not to mention)
	    builder.clickAndHold(gettowork).perform();
	    builder.moveToElement(done).release(done).perform(); //or
	   // builder.moveByOffset(x2, y2).release().perform(); //--->not working
	}

}
