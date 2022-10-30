package genaricLibrary;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.beust.jcommander.defaultprovider.PropertyFileDefaultProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public Propertyfile pdata=new Propertyfile();
public WebDriverUtilities utilities= new WebDriverUtilities();
	public WebDriver driver;
	
@BeforeMethod
public void  openApp() throws IOException {
	WebDriverManager.chromedriver().setup();
	//System.setProperty("webdriver.chrome.driver","/home/shanth/eclipse-workspace/SkillraryEcommercePro/resoures/chromedriver");
	driver=new ChromeDriver();
	System.out.println(driver);
driver.manage().window().maximize();
	driver.get(pdata.getpropertydata("url"));
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
@AfterMethod
public void closeApp(ITestResult res) throws IOException {
	int status = res.getStatus();
	String names = res.getName();
	if (status==2) {
	Photo p=new Photo();
	p.getPhoto(driver, names);
	    }
	//driver.quit();
	}


}
