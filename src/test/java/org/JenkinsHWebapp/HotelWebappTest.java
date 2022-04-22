package org.JenkinsHWebapp;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class HotelWebappTest {

	@Test
	
	public void test1 () throws FileNotFoundException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Formation\\Desktop\\HotelWebbApp-master\\HotelDatabase\\src\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = (WebDriver) new ChromeDriver();
        
	    driver.get("http://localhost:8090/HotelWebapp/");
	    
	    MainPage mainPage = PageFactory.initElements(driver,MainPage.class);
	    mainPage.selectClick();
	    
	    List<String> toto = mainPage.optionLoop();
	    List<String> list = new ArrayList<>();
        list.add("Paris");
        list.add("Londres");
        list.add("Tokyo");
        list.add("New-York");
	    assertEquals(list, toto);
	    
	    mainPage.tableLoop();
	}
}
