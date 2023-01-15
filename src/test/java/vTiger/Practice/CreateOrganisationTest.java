package vTiger.Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CreateOrganisationTest {

	public static void main(String[] args) throws Exception {
		//step 1:Launch the browser
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM-KCSE6\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://localhost:8888/");
	   
	   //step 2:login to the application
	   driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
	   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
	   driver.findElement(By.xpath("//input[@type='submit']")).click();
	     
	   //step 3:click on the organization module/link
	   driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
	   
	   //step 4:click on create organization look up image/icon
	   driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();//look up icon/image
	  
	   // step 5: create organization with mandatory fields
	   driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("SCT1");
	   driver.findElement(By.xpath("//select[@name='industry']")).click();
	   driver.findElement(By.xpath("//option[@value='Energy']")).click(); 
	   driver.findElement(By.xpath("(//select[@class='small'])[3]")).click();
	   driver.findElement(By.xpath("//option[@value='Customer']")).click(); 
	   driver.findElement(By.xpath("(//select[@name='rating'])")).click();
	   driver.findElement(By.xpath("//option[@value='Active']")).click();
	   
	  // step 6: click on save button
       driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();
       
       //step 7:Validate
       String contactHeader = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
         if(contactHeader.contains("SCT1"))
       {
    	   System.out.println(contactHeader);
    	   System.out.println("PASS");
       }
       else
       {
    	   System.out.println("FAIL");
       }
        
       //step 8:logout of the application
      WebElement element= driver.findElement(By.xpath("//td[@class='small']")); 
      Actions act = new Actions(driver);
      act.moveToElement(element).perform();
	  driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	}

}
