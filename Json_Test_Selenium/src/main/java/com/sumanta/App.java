package com.sumanta;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App {

	WebDriver driver;

	@BeforeClass
	void setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

	}

	@AfterClass
	void terDown() {
		driver.close();

	}

	@Test(dataProvider = "dp")
	void login( String data) {
		String []users=data.split(",");
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		driver.findElement(By.id("Email")).sendKeys(users[0]);
		driver.findElement(By.id("Password")).sendKeys(users[1]);
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
		
	   String act_title =driver.getTitle();
	   String exp_title="nopCommerce demo store";
	   Assert.assertEquals(act_title,exp_title);
	   
	   
		
		
		

	}

	  @DataProvider(name = "dp")
      public String[] readJson() throws FileNotFoundException {
		
		JsonParser jsonParser=new JsonParser();
		FileReader reader=new FileReader(".\\JsonFiles\\TestData.json");
		Object obj=jsonParser.parse(reader);
		JsonObject jsonObject=(JsonObject) obj;
		JsonArray array=(JsonArray) jsonObject.get("userLogin");
		String arr[]=new String[array.size()];
		
		for(int i=0;i<array.size();i++) {
			
			JsonObject userLogin=(JsonObject) array.get(i);
		    JsonElement user =userLogin.get("username");
		    JsonElement pass =userLogin.get("password");
		    
			arr[i]=user+","+pass;
			
		}
		return arr;
		

	}

}
