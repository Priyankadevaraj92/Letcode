package first;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pagination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
ChromeDriver driver= new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.manage().window().maximize();
driver.get("https://letcode.in/advancedtable");
WebElement number=	driver.findElement(By.tagName("select"));
Select mynumber=new Select(number);
mynumber.selectByValue("5");

//ArrayList<String> univ= new ArrayList<String>(); if we declare array here outside loop we can iterate to print values at last using for loop
 int sizeofpagination=  driver.findElements(By.xpath("//div[@id='advancedtable_paginate']/span/a")).size();
 System.out.println(sizeofpagination);
  if (sizeofpagination>0) {
       do {
    	   ArrayList<String> univ= new ArrayList<String>();
    	   List<WebElement> columnvalues= driver.findElements(By.xpath("//table[@id='advancedtable']/tbody/tr/td[2]"));
    	     for (WebElement eachcolumnvalue : columnvalues) {
    	   	  String columnvalue=	eachcolumnvalue.getText();
    	      univ.add(columnvalue);
    	       //or  univ.add(eachcolumnvalue.getText());
    	      //System.out.println("columnvalue>>"+columnvalue); this will print all univ names in next next lines
    	     } System.out.println(univ); //it will print all column names as arraylist
       WebElement nextbutton=	driver.findElement(By.linkText("Next"));
       String nextclassname=  nextbutton.getAttribute("class");
       if (!nextclassname.contains("disabled")) { 
		nextbutton.click(); 
       }else break;   // if it doesn't met condition it will break otherwise its going to be a neverending loop
   	     
     }while(true);
}else 
	System.out.println("No pagination...");
  
  
//  for (String alluniv : univ) { //this will work if only we have arraylist outside the loop
//		System.out.println(alluniv);//to print all university names in next next line(it wont print as arraylist)
//    	}
driver.quit();
	}}


