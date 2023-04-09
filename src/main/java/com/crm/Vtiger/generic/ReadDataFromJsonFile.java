package com.crm.Vtiger.generic;

import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;

public class ReadDataFromJsonFile {
	public void readDataFromJsonFile() throws Throwable
	{
		FileReader fr = new FileReader("./DATA/commondata.json");
		JSONParser jp = new JSONParser();
		Object jObj = jp.parse(fr);
		HashMap hp	=(HashMap)jObj;
	    Object url=hp.get("url");
		Object un=hp.get("username");
	    Object pwd=hp.get("password");
//		System.out.println(url);
//		System.out.println(un);
//		System.out.println(pwd);

	}
}
