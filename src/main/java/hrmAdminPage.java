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
        By byMenuAdmin = By.xpath("//a[contains(normalize-space(),'Admin')]");
        WebElement menuAdmin = wait.until(ExpectedConditions.visibilityOfElementLocated(byMenuAdmin));
        menuAdmin.click();

        //locator02
        By byMenuPIM = By.xpath("//a[contains(normalize-space(),'PIM')]");

        //locator03
        By byMenuLeave = By.xpath("//a[contains(normalize-space(),'Leave')]");

        //locator04
        By byTxtSearchUsername = By.xpath("//label[text()='Username']/ancestor::div[contains(@class,'oxd-input-group')]//input");

        //locator05
        By bySelUserRole = By.xpath("//label[text()='User Role']/following::div[contains(@class,'oxd-select-text')][1]");

        //locator06
        By byAdminOption = By.xpath("//div[@role='option']//span[text()='Admin");

        //locator07
        By byESSOption = By.xpath("//div[@role='option']//span[text()='ESS");

        //locator08
        By byTxtEmployeeName = By.xpath("//label[text()='Employee Name']/ancestor::div[contains(@class,'oxd-input-group')]//input");

        //locator09
        By byBtnReset = By.xpath("//button[text()=' Reset ']");

        //locator10
        By byBtnSearch = By.xpath("//button[text()=' Search ']");

        //locator11
        By bySelUserManagement = By.xpath("//li[@class='oxd-topbar-body-nav-tab --parent --visited']");

        //locator12
        By bySecondRowUsername = By.xpath("(//div[contains(@class,'oxd-table-row--with-border')])[3]//div[@role='cell'][2]");

        //locator13
        By bySecondRowUserRole = By.xpath("(//div[contains(@class,'oxd-table-row--with-border')])[3]//div[@role='cell'][3]");

        //locator14
        By bySecondRowDeleteBtn = By.xpath("(//div[contains(@class,'oxd-table-row--with-border')])[3]//i[contains(@class,'bi-trash')]");

        //locator15
        By bySecondRowEditBtn = By.xpath("(//div[contains(@class,'oxd-table-row--with-border')])[3]//i[contains(@class,'bi-pencil-fill')]");

        //locator16
        By byUsernameHeader = By.xpath("//div[@role='columnheader' and contains(.,'Username')]");

        //locator17
        By byUserRoleHeader = By.xpath("//div[@role='columnheader' and contains(.,'User Role')]");

        //locator18
        By byBreadcrumb = By.xpath("//span[contains(@class,'oxd-topbar-header-breadcrumb')]");

        //locator19
        By ByBtnCollapseMenu = By.xpath("//button[.//i[contains(@class,'bi-chevron-left')]]");

        //locator20
        By byBtnCaretUp = By.xpath("//button[.//i[contains(@class,'bi-caret-up-fill')]]");

        //locator21
        By byBtnAdd = By.xpath("//button[text()=' Add ']");

        chromeDriver.quit();
    }
}
