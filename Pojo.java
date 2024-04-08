package org.proj;

import org.ggg.BaseClass2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends BaseClass{
	public Pojo() {
		PageFactory.initElements(driver, this);
		
		
	}
	@CacheLookup
	@FindBy(xpath = "//input[@type='text']")
	WebElement text;
	
	@CacheLookup
	@FindBy(xpath= "//button[@title='Search']")
	WebElement search;
	
	@CacheLookup
	@FindBy(xpath= "//a[text()='Spider Man Toys Amazing Action Figures PVC Doll- Nepali Pasal']")
	WebElement doll;
	
	
public WebElement getText() {
		return text;
	}



	public WebElement getSearch() {
		return search;
	}


	

	public WebElement getDoll() {
		return doll;
	}



	
	}

	
	

	
