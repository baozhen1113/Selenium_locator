import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class hrmAdminPage {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.setExperimentalOption("useAutomationExtension", false);

        WebDriver chromeDriver = new ChromeDriver(options);
        chromeDriver.manage().window().maximize(); // maximize windows
        chromeDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); // login page

        //   khai bao webdriverwait
        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(30));

        By byTxtUsername = By.name("username");
        WebElement txtUsername = wait.until(ExpectedConditions.visibilityOfElementLocated(byTxtUsername));
        txtUsername.sendKeys("Admin");

        By byTxtPassword = By.name("password");
        WebElement txtPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(byTxtPassword));
        txtPassword.sendKeys("admin123");

        By byBtnLogin = By.xpath("//button[text()=' Login ']");
        WebElement btnLogin = wait.until(ExpectedConditions.elementToBeClickable(byBtnLogin));
        btnLogin.click();

        // locator01
        By byMenuAdmin =  By.xpath("//a[contains(normalize-space(),'Admin')]");
        WebElement menuAdmin = wait.until(ExpectedConditions.visibilityOfElementLocated(byMenuAdmin));

        //locator02
        By byMenuPIM =  By.xpath("//a[contains(normalize-space(),'PIM')]");

        //locator03
        By byMenuLeave =  By.xpath("//a[contains(normalize-space(),'Leave')]");

        //locator04
        By byTxtSearchUsername = By.xpath("//label[text()='Username']/ancestor::div[contains(@class,'oxd-input-group')]//input");

        //locator05
        
        chromeDriver.quit();
    }
}
