package first;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.Assert;

import com.beust.jcommander.IStringConverter;
import com.beust.jcommander.converters.IntegerConverter;

import net.bytebuddy.implementation.EqualsMethod;


public class Webtableletcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://letcode.in/table");
		//TABLE1
		WebElement table= driver.findElement(By.id("shopping")); //here we only want to find elements within the table
	   List<WebElement> header= table.findElements(By.tagName("th"));
		for (WebElement headertext : header) {
			System.out.println(headertext.getText());
	    }
 	  List<WebElement> allrows= table.findElements(By.xpath("//table[@id='shopping']//tbody/tr"));
		 //To get no. of rows
		  /* int size= allrows.size();    -->
		  System.out.println(size);
		  if (size==4) {
			System.out.println("YES");
		  }else { System.out.println("NO");
		  }*/
	    // To print 1st column
		/* for (WebElement row : allrows) {
		List<WebElement> allcolumn1= row.findElements(By.tagName("td"));
	    WebElement all= allcolumn1.get(0);       -->to get 1st column
	    System.out.println(all.getText());
	    }
	    // To print 2nd column
		for (WebElement row : allrows) {
		List<WebElement> allcolumn2= row.findElements(By.tagName("td"));
		WebElement all1= allcolumn2.get(1);        -->to get 2nd column
		System.out.println(all1.getText());
	    }*/
 	  
 	 /*	for (WebElement row : allrows) {
	    List<WebElement> allcolumn2= row.findElements(By.tagName("td"));
	    WebElement secondcolumn= allcolumn2.get(1);
	    //System.out.println("Actual Values are"+secondcolumn.getText());
      String string1=  secondcolumn.getText();
		int val = Integer.parseInt(string1);
		total= total+val;
		} System.out.println("Total Values"+total);
	     */	 
 	   //or
 
 	int total=0;
		  for (int i = 0; i < allrows.size(); i++) {
		  List<WebElement> row =allrows.get(i).findElements(By.tagName("td"));
		  WebElement secondcolumn=row.get(1);
			           /*or WebElement row =allrows.get(i);
			                List<WebElement> allcolumn2= row.findElements(By.tagName("td"));
			                WebElement secondcolumn= allcolumn2.get(1);*/
	     
		     //System.out.println("Print all 2nd column text"+secondcolumn.getText());
		  String string1=  secondcolumn.getText();
		//  int val = Integer.parseInt(string1);  //-->change string to int
		  int val = Integer.valueOf(string1);
		  total= total+val;
		} System.out.println("Total Values"+total);  
	
	//TABLE2
	WebElement table2= driver.findElement(By.id("simpletable"));	
	List<WebElement> allrows1= table2.findElements(By.xpath("//table[@id='simpletable']//tbody/tr"));
	boolean breakLoop = false;
	for (WebElement eachrow : allrows1) {
		List<WebElement> allcolumns= eachrow.findElements(By.tagName("td"));
		for (WebElement eachcolumn : allcolumns) {
			String columnvalue= eachcolumn.getText();
			System.out.println(columnvalue);
					if (columnvalue.equals("Raj")) {
						WebElement inputele= eachrow.findElement(By.tagName("input"));
						inputele.click();
						breakLoop = true;
							break;
						}//else {System.out.println("fail");}
		}
		//if(!breakLoop)  { -->it means if breakloop is false(it will print the 1st column and i am breaking the loop)
		if(breakLoop) {   // -->it means if breakloop is true(it will iterate till find raj and click input and will break the loop)
			System.out.println("I am breaking the loop");
			break;
		}else {
			System.out.println("I am continuing the loop");
		}
	}
	/*	
	WebElement table2= driver.findElement(By.id("simpletable"));	
	List<WebElement> allrows1= table2.findElements(By.xpath("//table[@id='simpletable']//tbody/tr"));
	for (WebElement eachrow : allrows1) {
	List<WebElement> allcolumn= eachrow.findElements(By.tagName("td"));
	WebElement lastname= allcolumn.get(1);
	String text= lastname.getText();
	if (text.equals("Raj")) {
		allcolumn.get(3).findElement(By.tagName("input")).click();
		break;*/
	
	//SORTING
	WebElement table3= driver.findElement(By.xpath("/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div/div[3]/div/table"));
	/*ArrayList<String> obtainedList = new ArrayList<String>(); 
	List<WebElement> allrows2= table3.findElements(By.tagName("tr")); 
	//System.out.println(allrows2.size());
	for (WebElement eachrow2 : allrows2) {
		//String rowvalue =eachrow2.getText();
	List<WebElement> allcolumn2=	eachrow2.findElements(By.tagName("td"));
	WebElement columnvalue=	allcolumn2.get(0); 
	String beforesortcolumnvalue= columnvalue.getText();
	//System.out.println(columnvalue.getText());
	obtainedList.add(beforesortcolumnvalue);
	}*/
	//here i directly find the column value of 0th location
	ArrayList<String>	treats= new ArrayList<String>();	
	List<WebElement> valueof0	=driver.findElements(By.xpath("//table[contains(@class,'mat-sort table is-bordered is-striped')]/tr/td[1]"));
	for (WebElement textvalue : valueof0) {
	//System.out.println(textvalue.getText());
	String treatnames=	textvalue.getText();
	treats.add(treatnames);
	}System.out.println(treats);
    WebElement sort= driver.findElement(By.xpath("//div[contains(@class,'mat-sort-header-arrow')][1]"));
	  sort.click();
	  ArrayList<String> sortedList = new ArrayList<String>();  
	    List<WebElement> allrows3= table3.findElements(By.tagName("tr"));
		//System.out.println(allrows2.size());
		for (WebElement eachrow3 : allrows3) {
	    List<WebElement> allcolumn3= eachrow3.findElements(By.tagName("td"));
		String aftersortcolumnvalue= allcolumn3.get(0).getText();
		sortedList.add(aftersortcolumnvalue);
		}
		Collections.sort(treats);
		Assert.assertEquals(treats, sortedList);
		System.out.println(treats);
		System.out.println(sortedList);
		 // this both print [Cupcake, Eclair, Frozen yogurt, Gingerbread, Ice cream]
		
		//reverse sort
		Collections.sort(treats);
		Collections.reverse(treats);
		WebElement sort1= driver.findElement(By.xpath("//div[contains(@class,'mat-sort-header-arrow')][1]"));
		  sort1.click();
		  ArrayList<String> sortedList1 = new ArrayList<String>();  
		    List<WebElement> allrows4= table3.findElements(By.tagName("tr"));
			//System.out.println(allrows2.size());
			for (WebElement eachrow3 : allrows4) {
		    List<WebElement> allcolumn4= eachrow3.findElements(By.tagName("td"));
			String aftersortcolumnvalue= allcolumn4.get(0).getText();
			sortedList1.add(aftersortcolumnvalue);
			}
			
		System.out.println(treats.equals(sortedList1));// to check both arraylist are equal
		System.out.println(treats);
		System.out.println(sortedList1);
		   // this both print [Ice cream, Gingerbread, Frozen yogurt, Eclair, Cupcake]
	//driver.quit();
		
	}}
	//}
	   
	   
