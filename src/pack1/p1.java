  package pack1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1
{

public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();//open the chrome browser
	driver.get("https://www.facebook.com");//fetches the web application and waits until it is loaded completely
	// no such session exception as the window gets closed
String title=driver.getTitle();//returns title of the web page
System.out.println(title);
driver.close();

	}


}
