package org.Maven_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_class_proceed {
private WebDriver driver;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
    private WebElement proceed;
    public WebElement getproceed() {
		return proceed;
	}
	public Pom_class_proceed(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
