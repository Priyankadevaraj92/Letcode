package first;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Interactwithbuttons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://letcode.in/buttons");
		driver.findElement(By.id("home")).click();
		String url= driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().back();
		
		
	 Point point= driver.findElement(By.id("position")).getLocation();
		  System.out.println(point);  //or
		                     //WebElement ele= driver.findElement(By.id("position"));
		                     //System.out.println(ele.getLocation()); //or ele.getpoint(); //or 
		                	//org.openqa.selenium.Point point= ele.getLocation(); 
	                         //int x=point.getX();
	                      	 //int y=point.getY();
	                       //System.out.println("X="+x+" Y="+y);
	 String color=driver.findElement(By.id("color")).getCssValue("background-color");
		                     //WebElement ele2= driver.findElement(By.id("color"));
		                      //String color=ele2.getCssValue("background-color");	
	      System.out.println(color);
	 Rectangle rect= driver.findElement(By.id("property")).getRect();
	                      	//System.out.println(rect.getHeight());
	                      	//System.out.println(rect.getWidth()); //or
	      System.out.println("dime "+rect.getDimension());
	      System.out.println("point "+rect.getPoint());   //or
		                     //Dimension dime= rect.getDimension();
	                   	//System.out.println(dime);
		              //System.out.println(dime.getHeight());
		           //System.out.println(dime.getWidth());
	boolean isenabled =driver.findElement(By.id("isDisabled")).isEnabled();
	      System.out.println(isenabled);
	WebElement ele3= driver.findElement(By.tagName("h2"));
	      System.out.println(ele3.getText());
	Actions builder= new Actions(driver);
	builder.clickAndHold(ele3).perform();
	driver.quit();

	}

}
