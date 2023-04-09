package com.crm.Vtiger.generic;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class JavaUtility {
	
	Faker faker = new Faker(new Locale("en-IND"));

	@Test
	//for generating random number
	public int generateRandomNumber(int range)
	{
		Random random= new Random();
		return random.nextInt(range);
	}

	public String generatePhoneNumber()
	{
		return faker.phoneNumber().cellPhone();
	}

	public Object generateUid()
	{
		return faker.number().digits(12);

	}
	public String policyid()
	{
		return faker.number().digits(6);
	}

	public String fakeAddress()
	{
		return faker.address().fullAddress();
	}
	public String nationalId()
	{
		return	faker.number().digits(10);
	}

	public String nomineeRelation()
	{
		return faker.relationships().any();
	}
	public String nomineePriority()
	{
		return faker.number().digits(1);
	}

   public String Orgname()
   {
	   return faker.company().industry();
   }
	public String generateFirstName()
	{
		return faker.name().firstName();
	}

	public String generatelastname()
	{
		return faker.name().lastName();
	}
	public String generatebirthdate()
	{
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/YYYY");
		return df.format( faker.date().birthday());
	}


}
