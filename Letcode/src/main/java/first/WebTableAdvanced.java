package first;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebTableAdvanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://letcode.in/advancedtable");
	WebElement number=	driver.findElement(By.tagName("select"));
	Select mynumber=new Select(number);
	mynumber.selectByValue("5");

ArrayList<String> univtext= new ArrayList<String>();
List<WebElement> column2=driver.findElements(By.xpath("//table[@id='advancedtable']/tbody/tr/td[2]"));
   for (WebElement column : column2) {
    //String columnvalue	=column.getText();
    //univtext.add(columnvalue); //or
    univtext.add(column.getText());  
}System.out.println(univtext);

//by clicking next button
ArrayList<String> pagecolumnvalue = new ArrayList<String>();
 int sizeofpagination=  driver.findElements(By.xpath("//div[@id='advancedtable_paginate']/span/a")).size();
System.out.println(sizeofpagination);
if (sizeofpagination>0) {
	List<WebElement> pagecolumn2=driver.findElements(By.xpath("//table[@id='advancedtable']/tbody/tr/td[2]"));
	for (WebElement pagecolumn : pagecolumn2) {
		String value= pagecolumn.getText(); 
		System.out.println(value);
     	pagecolumnvalue.add(value);
		}
	do {
	
	WebElement nextbutton=driver.findElement(By.xpath("//div//a[@class='paginate_button next']"));
String nextclassname=	nextbutton.getAttribute("class");
	if (!nextclassname.contains("disabled")) {
		nextbutton.click();
	}	else {break;
	}
	} while (true);
}else {
	System.out.println("No pagination");}

//WebElement nextbutton=driver.findElement(By.xpath("//div//a[@class='paginate_button next']"));
//nextbutton.click();


/*

//by finding pages 1,2 3,4,5....10 it will only find 12345&10,it wont find 6 to 9

//int pages= driver.findElements(By.xpath("//div//a[@class='paginate_button ']")).size(); //to know no. of pages
ArrayList<String> pagecolumnvalue = new ArrayList<String>();
//List<WebElement> pages=
WebElement pagee= driver.findElement(By.xpath("//div//a[@class='paginate_button '][2]"));
pagee.click();
List<WebElement> pagecolumn2=driver.findElements(By.xpath("//table[@id='advancedtable']/tbody/tr/td[2]"));
for (WebElement pagecolumn : pagecolumn2) {
String value= pagecolumn.getText(); 
System.out.println(value);}

}

/*ArrayList<String> pagecolumnvalue = new ArrayList<String>();
List<WebElement> pages=driver.findElements(By.xpath("//div//a[@class='paginate_button ']"));
pages.click();
for (WebElement page : pages) {
	System.out.println(page.getText());
	page.click();
	List<WebElement> pagecolumn2=driver.findElements(By.xpath("//table[@id='advancedtable']/tbody/tr/td[2]"));
	for (WebElement pagecolumn : pagecolumn2) {
 String value= pagecolumn.getText(); 
 System.out.println(value);}
	
}
/*System.out.println(pages.size());
for (WebElement page : pages) {
	// page.click();
	List<WebElement> pagecolumn2=driver.findElements(By.xpath("//table[@id='advancedtable']/tbody/tr/td[2]"));
	for (WebElement pagecolumn : pagecolumn2) {
 String value= pagecolumn.getText(); 
 System.out.println(value);
	pagecolumnvalue.add(value);
	   }
	  	} System.out.println(pagecolumnvalue);
/*
WebElement nextbutton= driver.findElement(By.linkText("Next"));
nextbutton.click();




*/
	}}