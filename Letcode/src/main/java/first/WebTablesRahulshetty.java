package first;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class WebTablesRahulshetty {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();
		// System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		// -->instead of this we have to write assertion
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		driver.findElement(By.id("checkBoxOption1")).click();
		// System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
        driver.quit();
	}
	
	
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator(); 
		String child = iterator.next();
		String parent = iterator.next();
		driver.switchTo().window(child);
		String text = driver.findElement(By.tagName("h3")).getText();
		System.out.println(text);
		driver.switchTo().window(parent);
		String text1 = driver.findElement(By.tagName("h3")).getText();
		System.out.println(text1);
		driver.quit();
		*/
	
	//limiting webdriver scope
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		int noOfLinks = driver.findElements(By.tagName("a")).size();
		System.out.println(noOfLinks);
		
		//to find the no. of links in footer
		WebElement footerdriver = driver.findElement(By.id("gf-BIG")); //limiting webdriver scope
		int footerlinks = footerdriver.findElements(By.tagName("a")).size();
		System.out.println(footerlinks);
		
		// to find the no. of links in left side(its in table/ tr and 1st column) 
	/*	
		WebElement columndriver = driver.findElement(By.xpath("//tr/td[1]/ul/li"));
		List<WebElement> list = driver.findElements(By.tagName("a"));
		int columnlinks =list .size();
		
		// click on each link in 1st column and check pages are opening by printing title
		
		for (int i = 1; i < columnlinks; i++)  { //i=1 bcz there is link for header also we dont need that
		String clickonlink = Keys.chord(Keys.CONTROL,Keys.ENTER);
		list.get(i).sendKeys(clickonlink); // or
	//	list.get(i).sendKeys(Keys.chord(Keys.CONTROL,keys.ENTER));
		
		}*/
		
		List<WebElement> list1 = driver.findElements(By.xpath("//tr/td[1]/ul/li/a"));
		int columnlinkssize =list1 .size();
		System.out.println(columnlinkssize);
		
		// click on each link in 1st column by pressing ctrl and enter(so scope is in the 
		                                              //same window or else itw ill be in window opens by clicking link )
		
		for (int i = 0; i < columnlinkssize; i++)  { 
		
	//	String clickonlink = Keys.chord(Keys.CONTROL,keys.ENTER);
	//	list.get(i).sendKeys(clickonlink); // or
		list1.get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		
		}
		//and check pages are opening by printing title
		/*Set<String> windowHandles = driver.getWindowHandles();
		      int noOfWindows = windowHandles.size();
	          System.out.println(noOfWindows);
		Iterator<String> iterator = windowHandles.iterator();
		for (String windowss : windowHandles) {
		//	System.out.println(windowss);
		driver.switchTo().window(windowss);
		System.out.println(driver.getTitle());	
		}*/
		
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		while (iterator.hasNext()) { //hashnext will check if next index is present or not
			String next = iterator.next();       
			driver.switchTo().window(next);
			//driver.switchTo().window(iterator.next());
			
			System.out.println(driver.getTitle());
		} 
			
		
		
	driver.quit();
}}
        
        

 





