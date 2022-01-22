package org.Maven_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_class_tshirt {
	
	private WebDriver driver;
	
	@FindBy(xpath="(//a[text()='T-shirts'])[2]")
    private WebElement tshirt;
    public WebElement getTshirt() {
		return tshirt;
	}
	public Pom_class_tshirt(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
