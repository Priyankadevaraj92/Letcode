package first;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputLetcode {

public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
ChromeDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://letcode.in/edit");
System.out.println(driver.getTitle());
WebElement title= driver.findElement(By.tagName("h1"));
System.out.println(title.getText());
//to print all labels
//WebElement ele0= driver.findElement(By.xpath("//div[contains(@class,'card-content')][1]"));
//System.out.println(ele0.getText());
List<WebElement> labels=  driver.findElements(By.tagName("label"));
for (WebElement label : labels) {
System.out.println(label.getText());	
}
WebElement lastele= labels.get(labels.size()-1);
System.out.println(lastele.getText());     // to print last element
//System.out.println(labels.size());//or
int size=labels.size();
if (size==6) {
	System.out.println("Test case pass");
}else {
	System.out.println("Test case fail");
}

driver.findElement(By.id("fullName")).sendKeys("Nivya prabu");
driver.findElement(By.id("join")).sendKeys(" girl",Keys.TAB);
WebElement ele= driver.findElement(By.id("getMe"));
System.out.println(ele.getAttribute("value"));  
driver.findElement(By.id("clearMe")).clear();
boolean noedit= driver.findElement(By.id("noEdit")).isEnabled();
System.out.println(noedit);
String isreadonly= driver.findElement(By.id("dontwrite")).getAttribute("value");
System.out.println(isreadonly);
driver.quit();
	}

}
