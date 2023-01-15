package vTiger.Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CreateOrganisationNameText {
	
	//public static void main(String[] args) throws Exception {
	
		public static void main(String[] args) 
		{
	
		//step 1: Launch the Browser	
       System.setProperty("webdriver.chrome.driver","D:\\SELENIUM-KCSE6\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("http://localhost:8888/");
	   
	   //step 2:login to application  
	   driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
	   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
	   driver.findElement(By.xpath("//input[@type='submit']")).click();
	   
	 //step 3:click on the organization module/link
	   driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
	   
	 //step 4:click on create organization look up image/icon
	   driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
	   
	//step 5:create organization with mandatory fields   
	   driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("SCT3");
	   
	   
	// step 6: click on save button
	   driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();
	   
     //step 7:Validate
       
       String contactHeader = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
       if(contactHeader.contains("SCT3"))
     {
  	   System.out.println(contactHeader);
  	   System.out.println("PASS");
     }
     else
     {
  	   System.out.println("FAIL");
     } 
	   
       //step 8:logout of the application
       WebElement element= driver.findElement(By.xpath("(//td[@class='small'])[2]")); 
       Actions act = new Actions(driver);
       act.moveToElement(element).perform();
	   driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	 
	}
}
