package first;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framesletcode {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.get("https://letcode.in/frame");
		//Handling frame by index
		/*   
        driver.switchTo().frame(2);
        driver.findElement(By.name("fname")).sendKeys("Priyanka");
        driver.findElement(By.name("lname")).sendKeys("Devaraj");
		*/

		//Handling frame by name or id
		/* driver.switchTo().frame("firstFr");
        driver.findElement(By.name("fname")).sendKeys("Priyanka");
        driver.findElement(By.name("lname")).sendKeys("Devaraj");
        */

		//By webelement (other than id or name ,ex.class name but we have to store as webelement and we can use the webelement)
		//(here i use xpath(no id or name or if its dynamic)
		/*WebElement webelement= driver.findElement(By.xpath("//iframe[@src='frameUI']"));
        driver.switchTo().frame(webelement);
        driver.findElement(By.name("fname")).sendKeys("Priyanka");
        driver.findElement(By.name("lname")).sendKeys("Devaraj");
        */
		
		// inner frame(Handling frame by webelement or name or id(dono why index is not working))
		WebElement webelement= driver.findElement(By.xpath("//iframe[@src='frameUI']"));
		driver.switchTo().frame(webelement);
		driver.findElement(By.name("fname")).sendKeys("Priyanka");
		driver.findElement(By.name("lname")).sendKeys("Devaraj");
		WebElement email=driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(email);
		driver.findElement(By.name("email")).sendKeys("priyavinu92@gmail.com");
		driver.switchTo().parentFrame();//this will go one frame outside the current frame 
		driver.findElement(By.name("lname")).sendKeys("prabu");
		driver.switchTo().defaultContent(); //if we want to come outside to main page from frame or inner frame
		//driver.findElement(By.name("lname")).sendKeys("deva"); -->this will come as error bcz it went to mainpage
		driver.quit();

	}

}
