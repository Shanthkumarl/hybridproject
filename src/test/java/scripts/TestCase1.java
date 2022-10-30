package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import genaricLibrary.BaseClass;
import pomPages.AddtoChartPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;

public class TestCase1 extends BaseClass{
@Test
public void Tc1() {
SkillraryLoginPage s= new SkillraryLoginPage(driver);
s.gearbutton();
s.skilldemoapplication();
utilities.switchingtabs(driver);
SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
utilities.mouseHover(driver,sd.getCoursetab());
sd.seleniumtrainingtab();
AddtoChartPage ac=new AddtoChartPage(driver);
utilities.doubleClick(driver,ac.getAddbtn());
ac.addtochartbutton();
utilities.alertpopups(driver);
}
}

