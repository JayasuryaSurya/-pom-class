package org.Maven_Project;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_class_address {
private WebDriver driver;
	
	@FindBy(name="processAddress")
    private WebElement address;
    public WebElement getaddress() {
		return address;
	}
	public Pom_class_address(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
