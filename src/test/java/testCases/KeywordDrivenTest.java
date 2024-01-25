package testCases;

import org.testng.annotations.Test;
import pageObject.LoginPage;
import Utilities.ReadExcelSheetData;

public class KeywordDrivenTest {
@Test
        public void TC_KDT()
{
        ReadExcelSheetData rs = new ReadExcelSheetData();

        // Call DemoFile method with an argument
        rs.DemoFile(4);

        // Perform actions using KeywordActions
        LoginPage ka = new LoginPage();
        ka.openBrowser();
        ka.navigateToURL();
        ka.enterEmail();
        ka.enterPassword();
        ka.closeBrowser();
    }

}
