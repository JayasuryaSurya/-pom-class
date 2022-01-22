package org.Adactin_POM_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order {
	public WebDriver driver;
	
    @FindBy(name = "my_itinerary")
    private WebElement order;
    public WebElement getorder() {
		return order;
  	}
    public Order(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	    }
}
