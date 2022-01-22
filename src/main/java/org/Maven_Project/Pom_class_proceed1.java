package org.Maven_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_class_proceed1 {
private WebDriver driver;
	
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
    private WebElement proceed1;
    public WebElement getproceed1() {
		return proceed1;
	}
	public Pom_class_proceed1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
