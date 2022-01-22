package org.Maven_Project;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
public static WebDriver driver;
	//Browser launch
	public static WebDriver browserlaunch(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
		    //driver = new FirefoxDriver();
		}
		return driver;
	}
	//click
	public static void elementclick(WebElement element) {
		element.click();
	}
    //sendkeys
	public static void inputvalues(WebElement element, String value) {
		element.sendKeys(value);
	}
    // get
	public static void geturl(String url) {
		driver.get(url);
	}
	//close
	public static void driverclose() {
		driver.close();
	}
	//Quit
	public static void driverquit() {
		driver.quit();
	}
	//select by index
	public static void selectindex(WebElement element, int index) {
		Select select = new Select(element);
        select.selectByIndex(index);
	}
}
