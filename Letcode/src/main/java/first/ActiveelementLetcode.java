package first;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveelementLetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		                           // When opening the page if you see cursor is blinking in input field,
		                          //it means the cursor defaults in the input field, that element called active element
		                          //we can interact thru active element without finding the element.
		WebElement activeele= driver.switchTo().activeElement();
		activeele.sendKeys("priyaavinuu92@gmail.com",Keys.TAB,"9442776243",Keys.ENTER);
	 	       // here when we mouseover in sendkeys, it shows char sequence,
		       //in Charsequence we can pass n no. of parameters in sendkeys()funs 
		
	}

}
