package org.Adactin_POM_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Details {
	public WebDriver driver;
	
    @FindBy(name = "location")
    private WebElement location1;
    public WebElement getlocation1() {
		return location1;
  	}
    @FindBy(name = "hotels")
    private WebElement hotel1;
    public WebElement gethotel1() {
		return hotel1;
  	}
    @FindBy(name = "room_type")
    private WebElement roomtype1;
    public WebElement getroomtype1() {
		return roomtype1;
  	}
    @FindBy(name = "room_nos")
    private WebElement noofroom1;
    public WebElement getnoofroom1() {
		return noofroom1;
  	}
    @FindBy(name = "datepick_in")
    private WebElement checkin;
    public WebElement getcheckin() {
		return checkin;
  	}
    @FindBy(name = "datepick_out")
    private WebElement checkout;
    public WebElement getcheckout() {
		return checkout;
  	}
    @FindBy(name = "adult_room")
    private WebElement adultsroom;
    public WebElement getadultsroom() {
		return adultsroom;
  	}
    @FindBy(name = "child_room")
    private WebElement children;
    public WebElement getchildren() {
		return children;
  	}
    @FindBy(name = "Submit")
    private WebElement search;
    public WebElement getsearch() {
		return search;
  	}
    public Hotel_Details(WebDriver driver1) {
	     this.driver = driver1;
	     PageFactory.initElements(driver , this);
    	
	}  
}
