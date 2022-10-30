package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoChartPage {
@FindBy(id="add")
private WebElement addbtn;
@FindBy(xpath="//button[text()=' Add to Cart']")
private WebElement chartbtm;

public AddtoChartPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public WebElement getAddbtn() {
	return addbtn;
}
public void addtochartbutton() {
chartbtm.click();	
}


}