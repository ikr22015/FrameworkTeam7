package pageobject;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends CommonAPI{
    Actions actions = new Actions(driver);

    private By res = By.xpath("//a[@url = \"https://online.citi.com/US/JRS/pands/detail.do?ID=MoneyMarket\"]");

    @FindBy(xpath = "//div[@alt= \"Citi Bank Logo\"]/span")
    WebElement logo;

    @FindBy(xpath = "//a[@href = \"/US/JRS/pands/detail.do?ID=AOProductSelection\"]")
    WebElement openAnAccount;

    @FindBy(xpath = "//a[@href = \"/US/login.do?locale=es_US\"]")
    WebElement spanish;

    @FindBy(id = "searchicon")
    WebElement searchBtn;

    @FindBy(id = "citi-autocomplete-content-searchbox-livesearch")
    WebElement searchBox;

    @FindBy(xpath = "//a[@url = \"https://online.citi.com/US/JRS/pands/detail.do?ID=MoneyMarket\"]")
    WebElement savingAccMoneyMarket;

    public void getTitle(){
        logo.click();
    }

    public void goToOpenAccount(){
        openAnAccount.click();
    }

    public void languageChange(){
        spanish.click();
    }

    public void search(){
        wait.until(ExpectedConditions.presenceOfElementLocated(res));
        searchBtn.click();
        searchBox.sendKeys("saving account ");
        actions.moveToElement(savingAccMoneyMarket).click().build().perform();
    }
}
