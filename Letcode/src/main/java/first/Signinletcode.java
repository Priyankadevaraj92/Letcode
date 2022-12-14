package first;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Signinletcode {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
ChromeDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://letcode.in/");
String url=driver.getCurrentUrl();
System.out.println(url);
	driver.findElement(By.linkText("Sign up")).click();
	WebElement labels =driver.findElement(By.xpath("(//div[contains(@class,'box column is')])"));
	String text=labels.getText();
	System.out.println(text);
 driver.findElement(By.id("name")).sendKeys("Priyanka Devaraj");
 driver.findElement(By.id("email")).sendKeys("priyavinu92@gmail.com");
 driver.findElement(By.name("password")).sendKeys("Passw0rd$");
 driver.findElement(By.id("agree")).click();
 WebElement sign=driver.findElement(By.xpath("//button[contains(@class,'is-primary')]"));
 sign.click();
	}}
	
	//String name1 =driver.findElement(By.xpath("(//label[@class='label'])")).getText();
//System.out.println(name1);
//driver.findElement(by.linktext)


	
	



	
	
