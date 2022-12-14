package first;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshotletcode {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 ChromeDriver driver= new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	driver.get("https://letcode.in/dropdowns");
      	
	File scrnshot=driver.getScreenshotAs(OutputType.FILE);
	File destination=new File("./snaps/img1.png");
	//FileUtils.copyFile(scrnshot,destination);
	  org.openqa.selenium.io.FileHandler.copy(scrnshot, destination);//(throws declaration) 
	    //try catch
		//	try {
		//	org.openqa.selenium.io.FileHandler.copy(scrnshot, destination);
		//	} catch (IOException e) {
		//		e.printStackTrace();}
	//or 
	//  File scrnshot=driver.getScreenshotAs(OutputType.FILE);
    //  FileUtils.copyFile(scrnshot,new File("./snaps/img1.png"));
	
	  //element screenshot 
	  WebElement ele =driver.findElement(By.className("control"));
	    File scrnshot1=ele.getScreenshotAs(OutputType.FILE);
		File destination1=new File("./snaps/img2.png");
		org.openqa.selenium.io.FileHandler.copy(scrnshot1, destination1);
	// section screenshot 	  
	  WebElement ele1 =driver.findElement(By.xpath("//div[@class='card-content'][1]"));
		 File scrnshot2=ele1.getScreenshotAs(OutputType.FILE);
		 File destination2=new File("./snaps/img3.png");
		 org.openqa.selenium.io.FileHandler.copy(scrnshot2, destination2);
	  driver.quit();
			
	}

}
