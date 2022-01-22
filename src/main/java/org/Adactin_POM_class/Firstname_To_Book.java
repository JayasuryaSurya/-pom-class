package org.Adactin_POM_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Firstname_To_Book {
	public WebDriver driver;
	
	    @FindBy(name = "first_name")
	    private WebElement firstname;
	    public WebElement getfirstname() {
			return firstname;
	  	}
	    @FindBy(name = "last_name")
	    private WebElement lastname;
	    public WebElement getlastname() {
			return lastname;
	  	}
	    @FindBy(name = "address")
	    private WebElement address;
	    public WebElement getaddress() {
			return address;
	  	}
	    @FindBy(name = "cc_num")
	    private WebElement card;
	    public WebElement card() {
			return card;
	  	}
	    @FindBy(name = "cc_type")
	    private WebElement cardtype1;
	    public WebElement getcardtype1() {
			return cardtype1;
	  	}
	    @FindBy(name = "cc_exp_month")
	    private WebElement month1;
	    public WebElement getmonth1() {
			return month1;
	  	}
	    @FindBy(name = "cc_exp_year")
	    private WebElement year1;
	    public WebElement getyear1() {
			return year1;
	  	}
	    @FindBy(name = "cc_cvv")
	    private WebElement cvvnum;
	    public WebElement getcvvnum() {
			return cvvnum;
	  	}
	    @FindBy(name = "book_now")
	    private WebElement book;
	    public WebElement getbook() {
			return book;
	  	}
	    public Firstname_To_Book(WebDriver driver1) {
		     this.driver = driver1;
		     PageFactory.initElements(driver , this);	
		} 	 	    
}
