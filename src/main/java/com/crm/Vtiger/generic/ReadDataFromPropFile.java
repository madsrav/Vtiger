package com.crm.Vtiger.generic;

import java.io.FileReader;
import java.util.Properties;

public class ReadDataFromPropFile {
	public String readDataFromPropFile(String key) throws Throwable
	{
	
	FileReader reader= new FileReader(I_Autoconstants.PropPath);
	Properties prop= new Properties();
	prop.load(reader);
	String value = prop.getProperty(key);
	return value;
	}
}
