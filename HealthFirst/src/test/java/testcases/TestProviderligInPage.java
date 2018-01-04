package testcases;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageobject.HomePage;
import pageobject.ProviderLogInPage;

public class TestProviderligInPage extends CommonAPI {
    @Test
    public void testProviderLogIn(){
        HomePage hp = PageFactory.initElements(driver,HomePage.class);
        hp.gotoProviderLogin();

        ProviderLogInPage plp = PageFactory.initElements(driver, ProviderLogInPage.class);
        plp.providerLogIn();
    }
}