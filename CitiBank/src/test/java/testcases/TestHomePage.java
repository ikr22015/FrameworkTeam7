package testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestHomePage {
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
}
