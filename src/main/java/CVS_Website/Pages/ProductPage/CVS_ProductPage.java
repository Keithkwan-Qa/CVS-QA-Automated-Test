package CVS_Website.Pages.ProductPage;

import CVS_Website.Pages.BasePage;
import CVS_Website.Pages.HomePage.CVS_Homepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class CVS_ProductPage extends BasePage {

    private static final Logger logger = LoggerFactory.getLogger(CVS_ProductPage.class);
    private WebDriver driver;
    private WebDriverWait wait;


    /**
     * constructor to initialize page
     *
     * @param driver WebDriver driver instance
     */
    public CVS_ProductPage(WebDriver driver) {

        super(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);

    }

    @FindBy(css = "div[class='mb-24 flex w-full max-w-screen-xl flex-1 flex-col self-center md:mb-0']")
    private WebElement productContainer;

    @FindBy(css = "")
    private WebElement productDisplayContainer;
}

