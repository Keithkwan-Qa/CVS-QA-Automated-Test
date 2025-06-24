package E2E_Test;

import CVS_Website.Pages.BasePage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;

import java.lang.reflect.Method;
import java.time.Duration;

public class Test_Parent {

    protected static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    protected static ExtentReports reports;
    protected static ExtentTest logger;
    protected static ExtentHtmlReporter htmlReporter;

    protected BasePage basePage;
    protected CVS_Website.Pages.HomePage.components.Announcement Announcement;


    @BeforeSuite
    public void setupReports(){
        //Sometimes it is not necessary to use html reporter since there are other ways you can
        // configure the report, but I prefer this method since it gives more control
        String reportPath = System.getProperty("user.dir") + "/HTML_Report/HTML_Report.AutomationReport.html";
        htmlReporter = new ExtentHtmlReporter(reportPath);
        htmlReporter.config().setDocumentTitle("CVS Homepage UI Validation Test REPORT");
        htmlReporter.config().setReportName("CVS Homepage UI Validation Test RESULTS");
        htmlReporter.config().setTheme(Theme.STANDARD);
        reports = new ExtentReports();
        reports.attachReporter(htmlReporter);
        reports.setSystemInfo("User", System.getProperty("user.name"));
        reports.setSystemInfo("OS", System.getProperty("os.name"));
        reports.setSystemInfo("Browser","Chrome, Firefox, Edge, Safari");

    }


    //We need to set the parameter for browser in order to allow multi-browser testing
    @Parameters("browser")
    @BeforeMethod
    public void setTestName(String browser, Method methodName) {

        logger = reports.createTest(methodName.getName());
        initializingDriver(browser);

        //Below is to configure the driver and the window to replicate a new user
        WebDriver webDriver = driver.get();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        webDriver.manage().deleteAllCookies();
        basePage = new BasePage(getDriver());

    }

    //Below allows us to switch between browsers depending on
    public void initializingDriver(String browser) {

        switch (browser.toLowerCase()) {

            case "chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("start-maximized");
                chromeOptions.addArguments("incognito");
                driver.set(new ChromeDriver(chromeOptions));
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("-private");
                driver.set(new FirefoxDriver(firefoxOptions));
                break;

            case "edge":
                WebDriverManager.edgedriver().setup();
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("--inprivate");
                edgeOptions.addArguments("--start-maximized");
                driver.set(new EdgeDriver(edgeOptions));
                break;

            case "safari":
                WebDriverManager.safaridriver().setup();
                driver.set(new SafariDriver());
                break;

            default:
                throw new IllegalArgumentException("Browser: " + browser + " is not supported");

        }
    }

    public static WebDriver getDriver(){

        return driver.get();

    }

    @AfterMethod
    public void endTest() {

        reports.flush();

    }

    @AfterClass
    public void closeBrowser() {

        if (driver.get() != null){
            driver.get().quit();
            driver.remove();

        }
    }

    @AfterSuite
    public void breakDown() {

        if (reports != null){
            reports.flush();

        }
    }//end of aftersuite
}
