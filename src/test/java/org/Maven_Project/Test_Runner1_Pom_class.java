package org.Maven_Project;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Test_Runner1_Pom_class  extends Base_Class {
	public static void main(String[] args) throws Throwable  {
		
	    browserlaunch("Chrome");
//	    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
				          //"C:\\Users\\Jaya surya\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
//	    WebDriver driver = new ChromeDriver();
		  
		
		geturl("http://automationpractice.com/index.php?controller=authentication&back=my-account");
//	    driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	   Pom_class_signin a = new Pom_class_signin(driver);
	     
//	      WebElement email = driver.findElement(By.name("email"));
//	      email.sendKeys("sjayasurya07mugil@gmail.com");
//	      inputvalues(email, "sjayasurya07mugil@gmail.com");
	      inputvalues(a.getEmail(), "sjayasurya07mugil@gmail.com");
	    
//	      WebElement password = driver.findElement(By.name("passwd"));
//	      password.sendKeys("9445956998");
//	      inputvalues(password, "9445956998");
	      inputvalues(a.getPassword(), "9445956998");
	      
//	      WebElement signup = driver.findElement(By.name("SubmitLogin"));
//	      signup.click();
//	      elementclick(signup);
	      elementclick(a.getSignup());
	      
	      driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    
	   Pom_class_tshirt b = new Pom_class_tshirt(driver); 
	   
//	      WebElement tshirt = driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]"));
//	    //tshirt.click();
//	    JavascriptExecutor js = (JavascriptExecutor) driver;
//	    js.executeScript("arguments[0].click();",tshirt);    
//	    elementclick(tshirt);
	    elementclick(b.getTshirt());
	    
	      driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	      Thread.sleep(5000);
	      
	   Pom_class_image c = new Pom_class_image(driver); 
	      
//	      WebElement image = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
//	      image.click();
//	      elementclick(image);
	      elementclick(c.getImage());
	   
	      driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    
	   Pom_class_add d = new Pom_class_add(driver); 
	      Thread.sleep(2000);
//	      WebElement add = driver.findElement(By.xpath("//span[text()='Add to cart']"));
//	      add.click();
//	      elementclick(add);
	      elementclick(d.getadd());
	      Thread.sleep(4000);
	      
	   Pom_class_proceed e = new Pom_class_proceed(driver); 
	      
//	      WebElement proceed = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
//	      proceed.click();
//	      elementclick(proceed);
	      elementclick(e.getproceed());
	      
	   Pom_class_proceed1 f = new Pom_class_proceed1(driver); 
	      
//	      WebElement proceed1 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
//	      proceed1.click();
//	      elementclick(proceed1);
	      elementclick(f.getproceed1());
	      
	   Pom_class_address g = new Pom_class_address(driver); 
	      
//	      WebElement address = driver.findElement(By.name("processAddress"));
//	      address.click();
//	      elementclick(address);
	      elementclick(g.getaddress());
	      
	   Pom_class_box_proceed2 h = new Pom_class_box_proceed2(driver); 
	      
//	      WebElement box = driver.findElement(By.id("cgv"));
//	      box.click();
//	      elementclick(box);
	      elementclick(h.getbox());
	      
	      Thread.sleep(2000);
//	      WebElement proceed2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
//	      proceed2.click();
//	      elementclick(proceed2);
	      elementclick(h.getproceed2());
	      
	   Pom_class_bank_submit i = new Pom_class_bank_submit(driver);  
	      
//	      WebElement bank = driver.findElement(By.xpath("//a[@class='cheque']"));
//	      bank.click();
//	      elementclick(bank);
	      elementclick(i.getbank());
	      
	      Thread.sleep(2000);
//	      WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
//	      submit.click();
//	      elementclick(submit);
	      elementclick(i.getsubmit());
	}
	}

