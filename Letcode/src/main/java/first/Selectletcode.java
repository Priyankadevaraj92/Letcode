package first;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectletcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
ChromeDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://letcode.in/selectable");
WebElement select1= driver.findElement(By.xpath("//h3[text()='Selenium']"));
WebElement select2= driver.findElement(By.xpath("//h3[text()='Protractor']"));	
WebElement select3= driver.findElement(By.xpath("//h3[text()='LetCode']"));
Actions builder= new Actions(driver);
builder.keyDown(Keys.CONTROL)
.click(select1).click(select2).click(select3)
.keyUp(Keys.CONTROL).perform();
	
}}