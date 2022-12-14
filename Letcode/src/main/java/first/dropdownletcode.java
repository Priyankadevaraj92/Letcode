package first;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownletcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://letcode.in/dropdowns");
		WebElement fruits= driver.findElement(By.id("fruits"));
		Select allfruits= new Select(fruits);
	List<WebElement> allopt=	allfruits.getOptions();
		for (WebElement allfruitopt : allopt) {
			System.out.println("allfruitopt "+allfruitopt.getText());
		}
		//selectbyvisibletext
		Select myfruits= new Select(fruits);
		myfruits.selectByVisibleText("Apple");
		System.out.println(myfruits.isMultiple());
		//selectbyvalue
		WebElement country= driver.findElement(By.id("country"));
		Select mycountry= new Select(country);
		mycountry.selectByValue("India");
		WebElement select= mycountry.getFirstSelectedOption();
		System.out.println(select.getText());
		//Select last programing language & print all options
		WebElement lang= driver.findElement(By.id("lang"));
		Select mylang= new  Select(lang);
		mylang.selectByVisibleText("C#");
		List<WebElement> alllang= mylang.getOptions();   
		     for (WebElement selectalllang : alllang) {
			 System.out.println(selectalllang.getText());
		     }//or
		     //alllang.forEach()?
		//To select multiple
		WebElement heros= driver.findElement(By.id("superheros"));
		   Select myheros=new Select(heros);
		   System.out.println(myheros.isMultiple());//or
	    	//Boolean ismulti= myheros.isMultiple();
		    //System.out.println(ismulti);
		 myheros.selectByValue("am");
		 myheros.selectByVisibleText("Batwoman");
		List<WebElement> selectedheros=myheros.getAllSelectedOptions();
		   for (WebElement webElement : selectedheros) {
		   System.out.println(webElement.getText());	
		   }
		//deselect
		myheros.deselectByValue("am");
		//to select all options
		List<WebElement> allheros=myheros.getOptions();
	      for (WebElement webElement : allheros) {
		  System.out.println(webElement.getText());
	      }
		
 	
	}
	}


