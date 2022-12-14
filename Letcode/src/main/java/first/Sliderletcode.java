package first;

import java.awt.Point;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.auto.common.Visibility;

public class Sliderletcode {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		/*driver.get("https://letcode.in/slider");
		WebElement slider=  driver.findElement(By.name("generate"));
		driver.findElement(By.xpath("//button[text()='Get Countries']")).click();
	    WebElement countries=	driver.findElement(By.xpath("//div//p[@class='has-text-primary-light']"));
	    System.out.println(countries.getText());	
	    org.openqa.selenium.Point point= slider.getLocation();
		int x=point.getX();
		int y=point.getY();
		System.out.println("X "+x+" Y "+y);
		Actions builder=new Actions(driver);
		builder.dragAndDropBy(slider, x, y).build().perform();
		driver.findElement(By.xpath("//button[text()='Get Countries']")).click();
		System.out.println(countries.getText());
		*/
		
		driver.get("https://jqueryui.com/resizable/");
		driver.switchTo().frame(0);
		
		WebElement resize = driver.findElement(By.xpath("//div[contains(@class,'ui-icon ui-icon-gripsmall-diagonal')]"));
		//wait.until(ExpectedConditions.elementToBeClickable(resize));
		org.openqa.selenium.Point point = resize.getLocation();
		int x = point.getX();
		int y = point.getY();
		System.out.println("X"+x+"Y"+y);
		Actions builder=new Actions(driver);
		//builder.dragAndDropBy(resize, x+10,y+10).build().perform(); //MoveTargetOutOfBoundsException
		builder.dragAndDropBy(resize,413,40).build().perform();
		Thread.sleep(5000);
		driver.quit();
		
		
			}
}

    
