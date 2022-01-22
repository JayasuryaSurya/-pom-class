package org.Maven_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_class_bank_submit {
private WebDriver driver;
	
	@FindBy(xpath="//a[@class='cheque']")
    private WebElement bank;
    public WebElement getbank() {
		return bank;
	}
	public Pom_class_bank_submit(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

    @FindBy(xpath="(//button[@type='submit'])[2]")
    private WebElement submit;
    public WebElement getsubmit() {
	return submit;
}
}
