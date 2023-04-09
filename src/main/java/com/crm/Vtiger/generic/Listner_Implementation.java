package com.crm.Vtiger.generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner_Implementation implements ITestListener  {

	public void onTestStart(ITestResult result) {
			}

	public void onTestSuccess(ITestResult result) {
		
	}

	public void onTestFailure(ITestResult result) 
	{
		String timeanddate= new Date().toString().replace(":","_").replace(" ","_");
		String testname=result.getMethod().getMethodName();
		EventFiringWebDriver efw= new EventFiringWebDriver(BaseClass.sdriver);
	    File src = efw.getScreenshotAs(OutputType.FILE);
	    File dest= new File("./ScreenShot/"+testname+timeanddate+".png");
	    try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void onTestSkipped(ITestResult result) {
			}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
}
