import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class airbnbHomePage {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); // tat automation bar
        options.setExperimentalOption("useAutomationExtension", false);             // tat automation bar

        WebDriver chromeDriver = new ChromeDriver(options);
        chromeDriver.manage().window().maximize(); // maximize windows
        chromeDriver.get("https://demo5.cybersoft.edu.vn/"); // home page

        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(30));

        //locator01
        By byCyberSoftLogo = By.xpath("//a[.//span[text()='CyberSoft']]");

        //locator02
        By byHomeNav = By.xpath("//ul[contains(@class,'menu-phone')]//a[text()='Home']");

        //locator03
        By byAboutNav = By.xpath("//ul[contains(@class,'menu-phone')]//a[text()='About']");

        //locator04
        By bySelAvatar = By.id("user-dropdown");

        //locator05
        By bySelPlace = By.xpath("(//div[contains(@class,'grid-cols-12')]/div)[1]");

        //locator06
        By bySelTime = By.xpath("(//div[contains(@class,'grid-cols-12')]/div)[3]");

        //locator07
        By byAddGuest = By.xpath("(//div[contains(@class,'grid-cols-12')]/div)[5]");

        //locator08
        By byBtnAddGuest = By.xpath("//div[text()='Khách']/following::button[2]");

        //locator09
        By byBtnMinusGuest = By.xpath("//div[text()='Khách']/following::button[1]");

        //locator10
        By byFirstCard = By.xpath("(//div[contains(@class,'grid')]/a)[1]");

        //locator11
        By byTextSecondCard = By.xpath("(//div[contains(@class,'grid')]/a)[2]//h2");

        //locator12
        By byBtnType = By.xpath("//button[text()='Loại nơi ở']");

        //locator13
        By byBtnPrice = By.xpath("//button[text()='Giá']");

        //locator14
        By byTextTime = By.xpath("(//div[contains(@class,'grid')]/a)[3]//p");

      chromeDriver.quit();

    }
}
