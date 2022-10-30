package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {
@FindBy(xpath=" //a[text()=' GEARS ']")
private WebElement gearbtn;


@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
private  WebElement skillrarydemoapp;

@FindBy(name="q")
private WebElement searchtb;

@FindBy(xpath="//input[@type='submit']")
private WebElement searchbtn;

 
public SkillraryLoginPage(WebDriver driver){
	PageFactory.initElements(driver,this);
}

public void gearbutton() {
	gearbtn.click();
}

public void skilldemoapplication() {
	skillrarydemoapp.click();
	}
 public void searchbutton() {
	searchbtn.click();
 }
public void searchtextbox(String title) {
	searchtb.sendKeys(title);
}
}


