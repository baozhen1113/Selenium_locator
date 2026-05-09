import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class amazonSearchResultPage {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); // tat automation bar
        options.setExperimentalOption("useAutomationExtension", false);             // tat automation bar

        WebDriver chromeDriver = new ChromeDriver(options);
        chromeDriver.manage().window().maximize(); // maximize windows
        chromeDriver.get("https://www.amazon.com/"); // home page

        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(30));

        //locator01
        //locator02
        //locator03

        //locator04
        By byTxtSearch = By.id("twotabsearchtextbox");
        WebElement txtSearch = wait.until(ExpectedConditions.visibilityOfElementLocated(byTxtSearch));
        txtSearch.sendKeys("adidas");

        By byBtnSearch = By.id("nav-search-submit-button");
        WebElement btnSearch = wait.until(ExpectedConditions.elementToBeClickable(byBtnSearch));
        btnSearch.click();

        //locator05
        By byCard = By.id("nav-cart-count-container");

        //locator06
        By bySize = By.id("a-autoid-66-announce");

        //locator07
        //locator08
        //locator09
        //locator10
        //locator11
        //locator12
        By bylblCheckGenderMan = By.xpath("//div[@id='gender']//a[.//span[text()='Men']]//label");

        //locator13
        By byTxtResultSearch = By.xpath("//h1[@data-csa-c-content-id='desktop/1/0/default/default']//h2[contains(@class,'a-size-base')]//span[1]");

        //locator14

        chromeDriver.quit();
    }
}
