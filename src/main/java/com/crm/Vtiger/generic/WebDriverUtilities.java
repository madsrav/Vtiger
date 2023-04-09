package com.crm.Vtiger.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import objectRepository.HomePage;

public class WebDriverUtilities {
	WebDriver driver;
	Select select;
	public WebDriverUtilities(WebDriver driver)
	{
	  this.driver=driver;	
	}
	public void closeBrowser()
	{
		driver.close();
	}

	public void maximizewindow()
	{
		driver.manage().window().maximize();
	}

	public void waitForPageLoad()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public void dropDownByIndex(WebElement element, int index)
	{
		select = new Select(element);
		select.selectByIndex(index);
	}

	public void dropDownByValue(WebElement element, String value)
	{
		select.selectByValue(value);
	}

	public void dropDownByVisibleText(String text,WebElement element)
	{
		select.selectByVisibleText(text);
	}

	public void acceptAlert()
	{
		driver.switchTo().alert().accept();
	}

	public void dismissAlert()
	{
		driver.switchTo().alert().dismiss();		
	}

	public void switchtowindow(String windowid)
	{
		driver.switchTo().window(windowid);
	}
	public void switchtoFrame(int index)
	{
		driver.switchTo().frame(index);
	}

	public void jseExecutor(String jseScript)
	{
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		jse.executeScript(jseScript);
	}
	public void SwitchToWindow(String title)
	{
		String currentwindow= driver.getWindowHandle();
		for(String childId : driver.getWindowHandles())
		{
			if(!currentwindow.equals(childId))
			{
				driver.switchTo().window(childId);
				if(title.contains(driver.getTitle())) 
				{
					break;
				}
				else
				{
					throw new NoSuchWindowException(title+"window not availble");
				}
			}
		}
	}
	public void moveToTheElement(WebElement element)
	{
	//	WebDriverUtilities utils = new WebDriverUtilities(driver);
		 Actions act = new Actions(driver);
		 act.moveToElement(element).perform(); 
	}

}
