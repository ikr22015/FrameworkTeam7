package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobject.HomePage;
import pageobject.MemberLogInPage;
import utility.ReadExcelFile;

public class TestMemberLogInPage extends MemberLogInPage {

    @Test(dataProvider = "testdata")
    public void testMemberLogIn(String username, String password)throws InterruptedException{
        HomePage hp = PageFactory.initElements(driver,HomePage.class);
        hp.goToMemberLogin();

        MemberLogInPage mlp = PageFactory.initElements(driver, MemberLogInPage.class);
        mlp.memberLogin(username,password);

    }

    @DataProvider(name = "testdata")
    public Object[][] TestDataFeed(){
        ReadExcelFile config = new ReadExcelFile("../HealthFirst/data/file.xls");
        int rows = config.getRowCount(0);
        Object[][] credentials = new Object[rows][2];
        for (int i = 0; i < rows; i++){
            credentials[i][0] = config.getData(0,i,0);
            credentials[i][1] = config.getData(0,i,0);
        }
        return credentials;
    }



//    @Test
//    public void testForgetPassword(){
//        HomePage hp = PageFactory.initElements(driver,HomePage.class);
//        hp.goToMemberLogin();
//
//        MemberLogInPage mlp = PageFactory.initElements(driver, MemberLogInPage.class);
//        mlp.memberLogin();
//
//        mlp.forgetPassword();
//    }


}
