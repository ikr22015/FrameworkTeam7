package base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonAPI{
    public static WebDriver driver = null;

    @BeforeMethod
    @Parameters({"browser_name", "operating_system", "URL"})
    public void setUp(String browserName, String os, String url){
        getLocalDriver(browserName,os);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(35,TimeUnit.SECONDS);
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }

    public WebDriver getLocalDriver(String browserName, String os){
        if (browserName.equalsIgnoreCase("chrome")){
            if (os.equalsIgnoreCase("windows")){
                System.setProperty("webdriver.chrome.driver","../Generic/drivers/chromedriver.exe");
                driver = new ChromeDriver();
            }else if (os.equalsIgnoreCase("mac")){
                System.setProperty("webdriver.chrome.driver","../Generic/drivers/chromedriver");
                driver = new ChromeDriver();
            }
        }else if (browserName.equalsIgnoreCase("firefox")){
            if (os.equalsIgnoreCase("windows")){
                    System.setProperty("webdriver.gecko.driver","../Generic/drivers/geckodriver.exe");
                driver = new FirefoxDriver();
            }else if (os.equalsIgnoreCase("mac")){
                System.setProperty("webdriver.gecko.driver","../Generic/drivers/geckodriver");
                driver = new FirefoxDriver();
            }
        }
        return driver;
    }


//    public List<WebElement> getListOfWebElementsById(String locator){
//        List<WebElement> list = new ArrayList<WebElement>();
//        list = driver.findElements(By.id(locator));
//        return list;
//    }
//
//    public List<String> getTextFromWebElement(String locator){
//        List<WebElement> elements = new ArrayList<WebElement>();
//        List<String> text = new ArrayList<String>();
//        elements = driver.findElements(By.cssSelector(locator));
//        for (WebElement web:elements){
//            text.add(web.getText());
//        }
//        return text;
//    }
//
//    public List<WebElement> getListOfWebElementsByCss(String locator){
//        List<WebElement> list = new ArrayList<WebElement>();
//        list = driver.findElements(By.cssSelector(locator));
//        return list;
//    }
}
