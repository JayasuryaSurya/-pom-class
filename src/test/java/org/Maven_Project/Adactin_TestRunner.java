package org.Maven_Project;
import java.util.concurrent.TimeUnit;
import org.Adactin_POM_class.Box_Continue;
import org.Adactin_POM_class.Firstname_To_Book;
import org.Adactin_POM_class.Hotel_Details;
import org.Adactin_POM_class.Login_In;
import org.Adactin_POM_class.Order;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_TestRunner extends Base_Class{   
	
	public static WebDriver driver = Base_Class.browserlaunch("chrome");
    public static Login_In a = new Login_In(driver);
    public static Hotel_Details b = new Hotel_Details(driver);
    public static Box_Continue c = new Box_Continue(driver);
    public static Firstname_To_Book d = new Firstname_To_Book (driver);
    public static Order e = new Order(driver);
    
	public static void main(String[] args) throws Throwable   {
		
//		driver = browserlaunch("chrome");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jaya surya\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
//	    WebDriver driver = new ChromeDriver();
	    
		geturl("https://adactinhotelapp.com/");
//		driver.get("https://adactinhotelapp.com/");
	
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
//	    Login_In a = new Login_In(driver);
	    
//	    WebElement username = driver.findElement(By.name("username"));
//		username.sendKeys("jayasurya");
//		inputvalues(username, "jayasurya");
		inputvalues(a.getUsername(), "jayasurya");
	    
//		WebElement password = driver.findElement(By.name("password"));
//		password.sendKeys("9445956998Sj@");	
//	    inputvalues(password, "9445956998Sj@");
		inputvalues(a.getPassword(), "9445956998Sj@");
		
//	    WebElement login = driver.findElement(By.name("login"));
//		login.click();
//		elementclick(login);
		elementclick(a.getLogin());
		Thread.sleep(3000);
		
//		Hotel_Details b = new Hotel_Details(driver);
		
//		WebElement location1 = driver.findElement(By.name("location"));
//		Select location = new Select(location1);
//	    location.selectByIndex(2);
//		selectindex(location1, 2);
		selectindex(b.getlocation1(), 2);
		
//	    WebElement hotel1 = driver.findElement(By.name("hotels"));
//		Select hotel = new Select(hotel1);
//	    hotel.selectByIndex(3);
//	    selectindex(hotel1, 3);
	    selectindex(b.gethotel1(), 3);
		
//	    WebElement roomtype1 = driver.findElement(By.name("room_type"));
//		Select roomtype = new Select(roomtype1);
//	    roomtype.selectByIndex(2);
//	    selectindex(roomtype1, 2);
	    selectindex(b.getroomtype1(), 2);
	    
//	    WebElement noofroom1 = driver.findElement(By.name("room_nos"));
//		Select noofroom = new Select(noofroom1);
//	    noofroom.selectByIndex(3);
//	    selectindex(noofroom1, 3);
	    selectindex(b.getnoofroom1(), 3);
	    
//	    WebElement checkin = driver.findElement(By.name("datepick_in"));
//	    checkin.sendKeys("1/1/2019");
//	    inputvalues(checkin, "1/1/2019");
	    inputvalues(b.getcheckin(), "1/1/2019");
	    
//	    WebElement checkout = driver.findElement(By.name("datepick_out"));
//	    checkout.sendKeys("2/2/2019");
//	    inputvalues(checkout, "2/2/2019");
	    inputvalues(b.getcheckout(), "2/2/2019");
	    
//	    WebElement adultsroom = driver.findElement(By.name("adult_room"));
//		Select adults = new Select(adultsroom);
//	    adults.selectByIndex(2);
//	    selectindex(adultsroom, 2);
	    selectindex(b.getadultsroom(), 2);
	    
//	    WebElement children = driver.findElement(By.name("child_room"));
//		Select child = new Select(children);
//	    child.selectByIndex(3);
//	    selectindex(children, 3);
	    selectindex(b.getchildren(), 3);
	    
//	    WebElement search = driver.findElement(By.name("Submit"));
//	    search.click();
//	    elementclick(search);
	    elementclick(b.getsearch());
	    Thread.sleep(3000);
	   
//	    Box_Continue c = new Box_Continue(driver);
	    
//	    WebElement box = driver.findElement(By.name("radiobutton_0"));
//	    box.click();
//	    elementclick(box);
	    elementclick(c.getbox());
	    
//	    WebElement continu = driver.findElement(By.name("continue"));
//	    continu.click();
//	    elementclick(continu);
	    elementclick(c.getcontinu());
	    
//	    Firstname_To_Book d = new Firstname_To_Book (driver);
	    
//	    WebElement firstname = driver.findElement(By.name("first_name"));
//	    firstname.sendKeys("jayasurya");
//	    inputvalues(firstname, "jayasurya");
	    inputvalues(d.getfirstname(), "jayasurya");
	    
//	    WebElement lastname = driver.findElement(By.name("last_name"));
//	    lastname.sendKeys("S");
//	    inputvalues(lastname, "S");
	    inputvalues(d.getlastname(), "S");
	    
//	    WebElement address = driver.findElement(By.name("address"));
//	    address.sendKeys("Patti(vill & p.o),karur(t.k),coimbatore(d.t)");
//	    inputvalues(address, "Patti(vill & p.o),karur(t.k),coimbatore(d.t)");
	    inputvalues(d.getaddress(), "Patti(vill & p.o),karur(t.k),coimbatore(d.t)");
	    
//	    WebElement card = driver.findElement(By.name("cc_num"));
//	    card.sendKeys("1234567890123456");
//	    inputvalues(card, "1234567890123456");
	    inputvalues(d.card(), "1234567890123456");
	    
//	    WebElement cardtype1 = driver.findElement(By.name("cc_type"));
//	 	Select cardtype = new Select(cardtype1);
//	 	cardtype.selectByIndex(2);
//	 	selectindex(cardtype1, 2);    
	    selectindex(d.getcardtype1(), 2);
	    
//	 	WebElement month1 = driver.findElement(By.name("cc_exp_month"));
//		Select month = new Select(month1);
//	    month.selectByIndex(3);
//		selectindex(month1, 3);    
	    selectindex(d.getmonth1(), 3);
	    
//		WebElement year1= driver.findElement(By.name("cc_exp_year"));
//		Select year = new Select(year1);
//		year.selectByIndex(11);   
//	    selectindex(year1, 11);
		selectindex(d.getyear1(), 11);
	    
//	    WebElement cvvnum = driver.findElement(By.name("cc_cvv"));
//		cvvnum.sendKeys("000");	
//		inputvalues(cvvnum, "000");
		inputvalues(d.getcvvnum(), "000");
		
//		WebElement book = driver.findElement(By.name("book_now"));
//		book.click();
//	    elementclick(book);
		elementclick(d.getbook());
		
//		Order e = new Order(driver);
		
//	    WebElement order = driver.findElement(By.name("my_itinerary"));
//		order.click();
//	    elementclick(order);
		elementclick(e.getorder());
}
}