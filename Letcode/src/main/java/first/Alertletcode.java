package first;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertletcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(300));
		driver.get("https://letcode.in/alert");
		// to find label text
		 List<WebElement> labels= driver.findElements(By.tagName("label"));
		 for (WebElement text : labels) {
			System.out.println(text.getText());	
		}
	//simple alert	 
	driver.findElement(By.id("accept")).click();
	 Alert alert1= driver.switchTo().alert();
	 System.out.println(alert1.getText());
	 alert1.accept();
	 //dismiss alert and print the text
	 driver.findElement(By.id("confirm")).click();
	 Alert alert2= driver.switchTo().alert();
	 System.out.println(alert2.getText());
	 alert2.dismiss();
	//prompt alert ( Type your name & accept)
	 driver.findElement(By.id("prompt")).click();
	 Alert alert3= driver.switchTo().alert();
	 alert3.sendKeys("Priyanka");
	 System.out.println(alert3.getText());
	 alert3.accept();
	
	 
	 //sweet alert (modern alert)
	     // driver.findElement(By.id("modern")).click();  ---->this is not alert ,we can inspect this
	     // Alert alert4= driver.switchTo().alert();
	     // System.out.println(alert4.getText());
     	 //alert2.dismiss();
     driver.findElement(By.id("modern")).click();
	 WebElement ele= driver.findElement(By.xpath("//div[@class='modal is-active']"));
	 System.out.println(ele.getText());	
	 driver.findElement(By.xpath("//button[@class='modal-close is-large']")).click();		
	 driver.quit();
		}

	}


