package scripts;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.hssf.record.LbsDataSubRecord.LbsDropData;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genaricLibrary.BaseClass;

import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class TestCase2 extends BaseClass {
@Test
public void tc2() throws IOException {
	SkillraryLoginPage s=new SkillraryLoginPage(driver);
	s.gearbutton();
	s.skilldemoapplication();
	utilities.switchingtabs(driver);
	SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
	
	utilities.dropdown(sd.getCoursedd(),pdata.getpropertydata("coursedd"));
	
	TestingPage tp=new TestingPage(driver);
	utilities.dragdrop(driver,tp.getSeleniumtraining(),tp.getCharttab());
	Point loc = tp.getFacebook().getLocation();
	int x = loc.getX();
	int y=loc.getY();
	utilities.ScrollBar(driver, x, y);
	tp.facebookicon();
	
	
	
}


}
