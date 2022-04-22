package org.JenkinsHWebapp;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MainPage {
	
	@FindBy(xpath = "//select")
	WebElement select;
    
	@FindBy(xpath = "//tbody")
	WebElement table;
	
 
    public List<String> optionLoop() {
	    Select openList = new Select(select);
		List <WebElement> op = openList.getOptions();
	    int size = op.size();
    	List<String> options = new ArrayList<String>();
	    for(int i =1; i<size ; i++){
	       options.add(op.get(i).getText());
	       System.out.println(options);
	      }
	    	System.out.println(options);
	    return options;
    }
    
    /*
    public void tableLoop() throws FileNotFoundException {
       // Now get all the TR elements from the table
	    List<WebElement> allRows = table.findElements(By.tagName("tr"));
	    List<String> result = new ArrayList<>();
	    // And iterate over them, getting the cells
	    for (WebElement row : allRows) {
	        List<WebElement> cells = row.findElements(By.tagName("td"));
	        // Print the contents of each cell
	        for (WebElement cell : cells) {
	            result.add(cell.getText());
	        }
	    }
	    System.out.println(result);
	
	    Scanner sc = new Scanner(new File("src/main/resources/file.csv"));
	    List<String> fileCSV = new ArrayList<>();
	    while (sc.hasNext())// returns a boolean value
	    {
	        fileCSV.add(sc.nextLine());
	        System.out.println(fileCSV);
	    }
    }
    */
    
	public void selectClick() {
		select.click();
	}

}
