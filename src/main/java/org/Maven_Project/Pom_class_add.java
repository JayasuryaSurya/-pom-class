package org.Maven_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_class_add {
private WebDriver driver;
	
	@FindBy(xpath="//p[@class= 'buttons_bottom_block no-print']")
    private WebElement add;
	public WebElement getadd() {
		return add;
	}
	public Pom_class_add(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
