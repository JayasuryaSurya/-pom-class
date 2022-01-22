package org.Adactin_POM_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_In {
	public WebDriver driver;

      @FindBy(name = "username")
      private WebElement username;
      public WebElement getUsername() {
		return username;
    	}
      public Login_In(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	    }
	  public WebElement getPassword() {
		return password;
	    }
	  public WebElement getLogin() {
		return login;
	    }

	  @FindBy(name = "password")
      private WebElement password;
      
      @FindBy(name = "login")
      private WebElement login;     
}
