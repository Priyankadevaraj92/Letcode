package first;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowhandlingLetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://letcode.in/windows");
		//driver.findElement(By.id("home")).click();
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getTitle());        //---->this will give mainpage url
		String mainwindow =driver.getWindowHandle();    //--->this func is to handle only primary window
		System.out.println(mainwindow);                  //--->this will give primary window id
		driver.findElement(By.id("home")).click();
		Set<String> multiwindows=driver.getWindowHandles(); //-->we cant get gettext in set , so we have to convert in to list
		System.out.println(multiwindows);       // --->this will give both primary and new window id  
		List<String> list= new ArrayList<String>(multiwindows);
		for (String windowsss : list) {
			System.out.println(windowsss);
		}
		// or System.out.println(multiwindows);                 // --->this will give both primary and new window id
		System.out.println(list.size());
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.switchTo().window(list.get(0));
		System.out.println(driver.getCurrentUrl());
		driver.close();                                 //--->here dont use quit(),it will close all window
		driver.switchTo().window(list.get(1));
		driver.close();
		//System.out.println(driver.getCurrentUrl());    //---> error bcz we closed the window
		
		//driver.switchTo().window(mainwindow);
		//Set<String> multiwindows1=driver.getWindowHandles();
		//driver.switchTo().window(mainwindow1);
		//driver.findElement(By.id("multi")).click();
		/*Set<String> secondwinhandles= driver.getWindowHandles();
		for (String allWintitle : list) {
			System.out.println(allWintitle);
		}
		
		
		/*		list.clear();         --->not working
		driver.get("https://letcode.in/windows");
		driver.findElement(By.id("multi")).click();
		//not working
		/*Set<String> multiwindows1=driver.getWindowHandles();
		list.clear();
		list.addAll(multiwindows1);
		//List<String> list1= new ArrayList<String>(multiwindows1);
	    driver.switchTo().window(list.get(0));
	    System.out.println(driver.getCurrentUrl());
		 */

	}

}
