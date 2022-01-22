package org.Maven_Project;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_class_signin {
	
	private WebDriver driver;
	
	@FindBy(name="email")
    private WebElement email;
	public WebElement getEmail() {
		return email;
	}
    public Pom_class_signin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

    @FindBy(name="passwd")
    private WebElement password;
	public WebElement getPassword() {
		return password;
	}
    @FindBy(name="SubmitLogin")
	private WebElement signup;
	public WebElement getSignup() {
		return signup;
	}
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
