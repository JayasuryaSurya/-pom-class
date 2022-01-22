package org.Maven_Project;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_class_image {

	private WebDriver driver;
	
	@FindBy(xpath="(//img[@class='replace-2x img-responsive'])[2]")
    private WebElement image;
	public WebElement getImage() {
		return image;
	}
	public Pom_class_image(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
