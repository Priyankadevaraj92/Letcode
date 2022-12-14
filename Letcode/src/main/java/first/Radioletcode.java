package first;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radioletcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(300));
		driver.get("https://letcode.in/radio");
	//	WebElement label1= driver.findElement(By.xpath("//label[text()='Select any one']']"));
	//	System.out.println(label1.getText());
		driver.findElement(By.id("yes")).click();
		driver.findElement(By.id("one")).click();
		Boolean isenabled =driver.findElement(By.id("one")).isSelected();
		System.out.println("Cofirm you can select only one radio button "+isenabled);
		Boolean isenabled1=driver.findElement(By.id("two")).isSelected();
		System.out.println("Cofirm you can select only one radio button "+isenabled1);
		driver.findElement(By.id("nobug")).click();
		driver.findElement(By.id("bug")).click();
		Boolean isenabled2 =driver.findElement(By.id("nobug")).isEnabled();
		System.out.println("Find the bug "+isenabled2);
		Boolean isenabled3=driver.findElement(By.id("bug")).isEnabled();
		System.out.println("Find the bug "+isenabled3);
		Boolean isselected1= driver.findElement(By.id("foo")).isSelected();
		System.out.println("Find which one is selected "+isselected1);
		
		
	
		Boolean isselected2= driver.findElement(By.id("notfoo")).isSelected();
		System.out.println("Find which one is selected "+isselected2);
		Boolean isenabled4=driver.findElement(By.id("maybe")).isEnabled();
		System.out.println(isenabled4);
		Boolean isselected3=driver.findElement(By.xpath("//label/input[@type='checkbox'][1]")).isSelected();
		System.out.println("Find if the checkbox is selected? "+isselected3);
		//driver.findElement(By.xpath("//input[@type='checkbox'][2]")).click();
		//Boolean isselected4=driver.findElement(By.xpath("//input[@type='checkbox'][2]")).isSelected();
		//System.out.println("Find if the checkbox is selected? "+isselected4);
		driver.quit();
	}

}
