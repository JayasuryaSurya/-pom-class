package org.Maven_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_class_box_proceed2 {
private WebDriver driver;
	
	@FindBy(id="cgv")
    private WebElement box;
    public WebElement getbox() {
		return box;
	}
	public Pom_class_box_proceed2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

    @FindBy(xpath="(//button[@type='submit'])[2]")
    private WebElement proceed2;
    public WebElement getproceed2() {
	    return proceed2;
}
}