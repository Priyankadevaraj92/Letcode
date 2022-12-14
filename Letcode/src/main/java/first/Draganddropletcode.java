package first;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddropletcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(300));
		/*driver.get("https://letcode.in/dropable");
		WebElement draggable= driver.findElement(By.id("draggable"));
		WebElement droppable= driver.findElement(By.id("droppable"));
		Actions builder= new Actions(driver);
		builder.dragAndDrop(draggable, droppable).perform();
		System.out.println(droppable.getText());
		*/
		/*//DRAGANDDROP
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);     //----> when you right click to inspect ,if there is view frame source 
		                                       //we have to USE switchto frame (iframe 1of1(only one frame))
		WebElement draggable= driver.findElement(By.id("draggable"));
		WebElement droppable= driver.findElement(By.id("droppable"));  //--> we cant draganddrop using element
		Actions builder= new Actions(driver);
		builder.dragAndDrop(draggable, droppable).perform();
		System.out.println(droppable.getText());
		driver.switchTo().defaultContent();  // -->this will come out of the frame

		*/
		//DRAGGABLE
		driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(0);
		WebElement draggable= driver.findElement(By.id("draggable"));
		int x= draggable.getLocation().getX();
		int y= draggable.getLocation().getY();
		System.out.println("x="+x+"y="+y);
		Actions builder= new Actions(driver);
		builder.dragAndDropBy(draggable, x+60, y+80).perform();
		driver.switchTo().defaultContent();  // -->this will come out of the frame
		//driver.quit();
		}

}
