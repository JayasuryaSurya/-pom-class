package org.Adactin_POM_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Box_Continue {
	public WebDriver driver;
	
	@FindBy(name = "radiobutton_0")
	private WebElement box;
	public WebElement getbox() {
		return box;
	}
	@FindBy(name = "continue")
	private WebElement continu;
	public WebElement getcontinu() {
		return continu;
	}
	public Box_Continue(WebDriver driver1) {
	     this.driver = driver1;
		 PageFactory.initElements(driver , this);
		}
}   