package pageobject;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI{
    Actions actions = new Actions(driver);

    //************************* Header Locators ************************
    @FindBy(css = "#header .logo")
    WebElement logo;

    @FindBy(xpath = "//*[@id=\"header\"]//div[6]/a[1]/span")
    WebElement memberLogin;

    @FindBy(xpath = "//*[@id=\"header\"]//div[6]/a[2]/span")
    WebElement providerLogIn;

    @FindBy(css = "#hf_langs_selector > div:nth-child(1) > ul:nth-child(1) > li:nth-child(1)")
    WebElement langChange;

    @FindBy(css = "#hf_langs_selector > div:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1) > span:nth-child(1)")
    WebElement langSanish;

    @FindBy(css = "#hf_langs_selector > div:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1) > span:nth-child(1)")
    WebElement langChinese;

    @FindBy(css = "input.display.search_box_upd")
    WebElement searchBox;

    @FindBy(xpath = "//input[@name = 'sa']")
    WebElement goBtn;

    @FindBy(xpath = "//a[text() =\"Info for Brokers\"]")
    WebElement infoForBroker;

    @FindBy(xpath = "//li[@id = \"menu-item-13283\"]/a[text() = \"Info For Employers\"]")
    WebElement infoForEmployers;

    //************************* Body Locators ************************

    @FindBy(xpath = "//a[@class = \"view_all_plans\"]")
    WebElement viewAllPlans;

    @FindBy(xpath = "//div[@class = \"box_content\"]/ul/li/a[text() = \"Become a Member\"]")
    WebElement becomeaMember;

    @FindBy(xpath = "//div[@class = \"box_content\"]/ul/li/a[text() = \"Find a Doctor or Hospital\"]")
    WebElement findDoctor;

    @FindBy(xpath = "//div[@class = \"box_content\"]/ul/li/a[text() = \"Pay My Bill\"]")
    WebElement payToBill;

    @FindBy(css = "#container > div.wrapper > div.widget > div.border_box.doctors > div > a")
    WebElement reviewPlan;

    @FindBy(xpath = "//*[@id=\"container\"]/div[1]/div[3]/div[2]/div/a")
    WebElement healtyLiving;

    @FindBy(xpath = "//*[@id=\"container\"]/div[1]/div[5]/div[1]//div/a")
    WebElement hFirstCommunity;

    @FindBy(xpath = "//*[@id=\"container\"]/div[1]/div[5]/div[2]//div/a")
    WebElement findHealthPlan;

    @FindBy(id = "#hf_contact_us_btn")
    WebElement contuctUs;


    //************************* SubFooter Locators ************************

    @FindBy(xpath = "//*[@id=\"menu-item-4448\"]/a")
    WebElement leafPlan;

    @FindBy(id = "//*[@id=\"menu-item-1695\"]/a")
    WebElement madicaidManageCare;

    @FindBy(xpath = "//*[@id=\"menu-item-1697\"]/a")
    WebElement childHealthPlus;

    @FindBy(xpath = "//*[@id=\"menu-item-4923\"]/a")
    WebElement madicarePlans;

    @FindBy(xpath = "//*[@id=\"menu-item-4924\"]/a")
    WebElement madicareMadicaidPlans;

    @FindBy(xpath = "//*[@id=\"menu-item-7361\"]/a")
    WebElement personalWillnessPlan;

    @FindBy(xpath = "//*[@id=\"menu-item-8904\"]/a")
    WebElement managedLongTerm;

    @FindBy(xpath = "//*[@id=\"menu-item-7584\"]/a")
    WebElement essentialPlan;

    @FindBy(xpath = "//*[@id=\"menu-item-13213\"]/a")
    WebElement proAndProPlusPlan;

    @FindBy(xpath = "//*[@id=\"menu-item-14763\"]/a")
    WebElement totalEPOplan;

    @FindBy(xpath = "//*[@id=\"menu-item-14763\"]/a")
    WebElement totalEPOplan;


    //************************* Header methods ************************
    public void search(){
        searchBox.sendKeys("doctor");
        goBtn.click();
    }

    public void langChangeEnglishToChinese(){
        actions.moveToElement(langChange).moveToElement(langChinese).click().build().perform();
    }

    public void goToMemberLogin(){
        memberLogin.click();
    }

    public void gotoProviderLogin(){
        providerLogIn.click();
    }

    public void gotoInfoForBrokers(){
        infoForBroker.click();
    }

    public void gotoInfoForEmployers(){
        infoForEmployers.click();
    }
    //************************* Body methods ************************
    public void gotoViewallPlans(){
        viewAllPlans.click();
    }

    public void gotoBecomeaMember() {
        becomeaMember.click();
    }

    public void gotoFindDoctor(){
        findDoctor.click();
    }

    public void gotoPayBill(){
        payToBill.click();
    }

    public void gotoReviewPlan(){
        reviewPlan.click();
    }

    public void gotoHealtyLiving(){
        healtyLiving.click();
    }

    public void gotoHFcommunity(){
        hFirstCommunity.click();
    }

    public void gotoFindHealthPlan(){
        findHealthPlan.click();
    }

    public void gotoContactUs(){
        contuctUs.click();
    }
}
