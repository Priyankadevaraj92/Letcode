package first;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitletcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get("https://letcode.in/waits");
	    WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	    WebElement ele= driver.findElement(By.id("accept"));
	    ele.click();
	    wait.until(ExpectedConditions.alertIsPresent());
	    Alert alert= driver.switchTo().alert();
	    System.out.println(alert.getText());
	    alert.accept();
	    driver.quit();
	}

}
