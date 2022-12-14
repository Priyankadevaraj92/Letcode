package first;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.auto.common.Visibility;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(3000));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.priceline.com/?vrid=b94b28c76e77348dc35ed599a587b8df");
    driver.findElement(By.xpath("//div/input[@id='hotelDates']")).click();
	String month="November 2022";
	String checkin= "12";
	String checkout= "15";
	String in_date="November 12, 2022";
	String out_date="November 15, 2022";
	
	JavascriptExecutor je= (JavascriptExecutor)driver;
	je.executeScript("window.scrollBy(0,500)");
	
	while (true) {
		String monthtext=	driver.findElement(By.xpath("//div[@class='sc-dkPtRN Month__MonthName-sc-12ikvnx-0 dRHBpU jJhIR']")).getText();
		if (monthtext.contains(month)) {
			break;
		}else {
			WebElement button=	driver.findElement(By.xpath("//button[contains(@class,' CalendarCard__RightArrow')]"));	
			button.click();
			break;
		} 
	}	
	
	//List<WebElement> alldates=	driver.findElements(By.className("day-cell"));
	List<WebElement> alldates=	driver.findElements(By.xpath("//div[@class='day-cell']/div/div"));
	for (WebElement date : alldates) {
		//System.out.println(dates.getText());
		String text = date.getText();
		System.out.println(text);
		if (text.equals(checkin)) {
			date.click();
			//break; //dont use break here, it will com out of the loop and wont click checkout date
		} if (text.equals(checkout)) {
			date.click();
			break;
		}
	}
	driver.findElement(By.xpath("//button[text()='Done']")).click();
	/*
	List<WebElement> alldates=	driver.findElements(By.className("day-cell"));
	int size = alldates.size();

	for (int i = 0; i <size; i++) {
		String attribute = alldates.get(i).getAttribute("aria-label");
		if (attribute.equalsIgnoreCase(in_date)) {
			alldates.get(i).click();
		}else if (attribute.equalsIgnoreCase(out_date)) {
			alldates.get(i).click();
			break;
		}
			
		}
		*/
	}

	private static JavascriptExecutor JavascriptExecutor(ChromeDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}
	//driver.quit();
	}