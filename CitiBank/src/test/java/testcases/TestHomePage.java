package testcases;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageobject.HomePage;

public class TestHomePage extends CommonAPI{
    @Test
    public void testSearch(){
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.search();
    }
}
