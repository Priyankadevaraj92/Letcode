package first;

import java.util.NoSuchElementException;

import javax.management.RuntimeErrorException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Throwvsthrows {
public void code() throws InterruptedException {
	Thread.sleep(5000);//error 1.throws declaration 2.surround with try/catch
	                   //select anything so that compiler will accept 
}
public static void main(String[] args) {
	Throwvsthrows its= new Throwvsthrows();
	its.test();
	//its.code();  //if you select throws declaration in thread.sleep,it will throw error here bcz we are calling the code() func
	             //we have to handle the error here,its not best way to use throw declaration, we have to use try/catch
	try {
		its.code();    //-->here i selected try/catch, we can use try catch directly in code()
		
	} catch (InterruptedException e) {
		//e.printStackTrace(); 
		throw new RuntimeException();//instead of e.printStackTrace() we can throw our customized exception or inbuild exception
		//here when we throw new exception, if try fails and catch block executes it will throw exception and stops the program
			}
}
public void test() {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://letcode.in/signin");
	//driver.findElement(By.name("email")).sendKeys("priyavinu92@gmail.com");
	try {
		driver.findElement(By.name("email1")).sendKeys("priyavinu92@gmail.com");//if i changed the element to email1-->no such element exception will come
		                                    //so we have to handle exception,select & right click this line surround with try/catch
	} catch (NoSuchElementException e) { //here i delete the exception and write nosuch element exception
//		e.printStackTrace();
		System.err.println("Element not found");
	throw new RuntimeException();
	} 
	driver.findElement(By.name("password")).sendKeys("Passw0rd$");
	driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
	driver.quit();
}
}
