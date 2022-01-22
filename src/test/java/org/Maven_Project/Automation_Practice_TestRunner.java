package org.Maven_Project;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_Practice_TestRunner extends Base_Class {
	
	public static WebDriver driver;
	public static void main(String[] args) throws Throwable   {
		
		driver = browserlaunch("chrome");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jaya surya\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
//	    WebDriver driver = new ChromeDriver();
		
		geturl("http://automationpractice.com/index.php?controller=authentication&back=my-account");
//	    driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    WebElement email = driver.findElement(By.name("email"));
//	    email.sendKeys("sjayasurya07mugil@gmail.com");
	    inputvalues(email, "sjayasurya07mugil@gmail.com");
	    
	    WebElement password = driver.findElement(By.name("passwd"));
//	    password.sendKeys("9445956998");
	    inputvalues(password, "9445956998");
	   
	    WebElement signup = driver.findElement(By.name("SubmitLogin"));
//	    signup.click();
	    elementclick(signup);
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	    WebElement tshirt = driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]"));
	    Thread.sleep(5000);
	    //tshirt.click();
	    elementclick(tshirt);
	    //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("arguments[0].click();",tshirt);    
	   
	    Thread.sleep(4000);
	    WebElement image = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
//	    image.click();
	    elementclick(image);
	    
	    Thread.sleep(4000);
	    WebElement add = driver.findElement(By.id("add_to_cart"));
//	    add.click();
        elementclick(add);
        
	    Thread.sleep(4000);
	    WebElement proceed = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
//	    proceed.click();
	    elementclick(proceed);
	    
	    WebElement proceed1 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
//	    proceed1.click();
	    elementclick(proceed1);
	    
	    WebElement address = driver.findElement(By.name("processAddress"));
//	    address.click();
	    elementclick(address);
	    
	    WebElement box = driver.findElement(By.id("cgv"));
//	    box.click();
	    elementclick(box);
	    
	    Thread.sleep(2000);
	    WebElement proceed2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
//	    proceed2.click();
	    elementclick(proceed2);
	    
	    WebElement bank = driver.findElement(By.xpath("//a[@class='cheque']"));
//	    bank.click();
	    elementclick(bank);
	    
	    Thread.sleep(2000);
	    WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
//	    submit.click();
	    elementclick(submit);
	    
	    WebElement backorders = driver.findElement(By.xpath("//a[@title = 'Back to orders']"));   
//	    backorders.click();
	    elementclick(backorders);
}
}